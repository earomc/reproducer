package com.foo;

import com.antwerkz.bottlerocket.BottleRocket;
import com.antwerkz.bottlerocket.BottleRocketTest;
import com.foo.banner.*;
import com.github.zafarkhaja.semver.Version;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import dev.morphia.Datastore;
import dev.morphia.DeleteOptions;
import dev.morphia.Morphia;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.Test;

public class ReproducerTest extends BottleRocketTest {
    private Datastore datastore;

    public ReproducerTest() {
        //MongoClient mongo = getMongoClient();
        //MongoDatabase database = getDatabase();
        MongoClient mongoClient = MongoClients.create();
        datastore = Morphia.createDatastore(mongoClient, databaseName());
        datastore.getMapper().map(City.class, SMPPlayer.class);
    }

    @NotNull
    @Override
    public String databaseName() {
        return "morphia_repro";
    }

    @Nullable
    @Override
    public Version version() {
        return BottleRocket.DEFAULT_VERSION;
    }

    @Test
    public void reproduce() {
        //making a location
        EmbeddedSimpleWorld simpleWorld = new EmbeddedSimpleWorld("test", Environment.NORMAL);
        EmbeddedSimpleLocation location = new EmbeddedSimpleLocation(0, 0, 0, simpleWorld);

        //making a banner
        EmbeddedBannerMeta bannerMeta = new EmbeddedBannerMeta();
        bannerMeta.addPattern(new EmbeddedPattern(PatternType.CIRCLE_MIDDLE, DyeColor.RED));
        EmbeddedBanner banner = new EmbeddedBanner(bannerMeta, DyeColor.WHITE);

        City awesomeCity = new City("AwesomeCity", location, banner);
        awesomeCity.addPlayer(new SMPPlayer());

        //datastore.insert(awesomeCity);

        datastore.find(City.class).delete(new DeleteOptions().multi(true));

    }

}
