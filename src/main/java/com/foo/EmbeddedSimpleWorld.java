package com.foo;

import dev.morphia.annotations.Embedded;

@Embedded
public class EmbeddedSimpleWorld {

    private String worldName;
    private Environment environment;

    public EmbeddedSimpleWorld() {}

    public EmbeddedSimpleWorld(String worldName, Environment environment) {
        this.worldName = worldName;
        this.environment = environment;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getWorldName() {
        return worldName;
    }
}
