package com.foo;

import com.foo.banner.EmbeddedBanner;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Reference;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

@Entity(value = "cities")
public class City extends PointOfInterest implements Comparable<City>
{

    @Id
    private ObjectId id;

    @Reference
    private Set<SMPPlayer> players;
    @Reference
    private Set<SMPPlayer> mayors;

    private EmbeddedBanner banner;



    public City() {
        super(null, null);
    }

    public City(String name, EmbeddedSimpleLocation location, EmbeddedBanner banner) {
        super(name, location);
        this.players = new HashSet<>();
        this.mayors = new HashSet<>();
        this.banner = banner;
    }

    public boolean isMayor(SMPPlayer player) {
        return mayors.contains(player);
    }

    public void setMayor(SMPPlayer player, boolean b) {
        if (b) {
            mayors.add(player);
        } else {
            mayors.remove(player);
        }
    }



    public boolean addPlayer(SMPPlayer player) {
        return players.add(player);
    }

    public boolean kickPlayer(SMPPlayer player) {
        return players.remove(player);
    }

    public Set<SMPPlayer> getMayors() {
        return mayors;
    }

    public Set<SMPPlayer> getPlayers() {
        return players;
    }



    public void setPlayers(Set<SMPPlayer> players) {
        this.players = players;
    }

    public void setMayors(Set<SMPPlayer> mayors) {
        this.mayors = mayors;
    }


    @Override
    public int compareTo(@NotNull City o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "City{" + "players=" + players +
                ", mayors=" + mayors +
                ", location=" + location +
                ", name='" + name + '\'' +
                '}';
    }


    public void setBanner(EmbeddedBanner banner) {
        this.banner = banner;
    }

    public EmbeddedBanner getBanner() {
        return banner;
    }

}


