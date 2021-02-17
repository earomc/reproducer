package com.foo;

import dev.morphia.annotations.Embedded;

@Embedded
public class EmbeddedSimpleLocation {

    private double x;
    private double y;
    private double z;
    private float pitch;
    private float yaw;
    private EmbeddedSimpleWorld simpleWorld;

    public EmbeddedSimpleLocation() {
    }

    public EmbeddedSimpleLocation(double x, double y, double z, float pitch, float yaw, EmbeddedSimpleWorld simpleWorld) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.pitch = pitch;
        this.yaw = yaw;
        this.simpleWorld = simpleWorld;
    }

    public EmbeddedSimpleLocation(double x, double y, double z, EmbeddedSimpleWorld simpleWorld) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.simpleWorld = simpleWorld;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    public float getYaw() {
        return yaw;
    }

    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    public EmbeddedSimpleWorld getSimpleWorld() {
        return simpleWorld;
    }

    public void setSimpleWorld(EmbeddedSimpleWorld simpleWorld) {
        this.simpleWorld = simpleWorld;
    }


}
