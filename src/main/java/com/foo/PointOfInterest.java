package com.foo;


public abstract class PointOfInterest {

    protected EmbeddedSimpleLocation location;
    protected String name;

    public EmbeddedSimpleLocation getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public PointOfInterest(String name, EmbeddedSimpleLocation location) {
        this.location = location;
        this.name = name;
    }

    public Environment getDimension() {
        return location.getSimpleWorld().getEnvironment();
    }

    public void setLocation(EmbeddedSimpleLocation location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }
}
