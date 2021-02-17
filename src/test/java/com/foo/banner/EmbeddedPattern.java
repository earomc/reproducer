package com.foo.banner;

import dev.morphia.annotations.Embedded;

import java.util.Objects;

@Embedded
public class EmbeddedPattern {

    private PatternType patternType;
    private DyeColor color;

    public EmbeddedPattern() {
    }

    public EmbeddedPattern(PatternType patternType, DyeColor color) {
        this.patternType = patternType;
        this.color = color;
    }

    public PatternType getPatternType() {
        return patternType;
    }

    public void setPatternType(PatternType patternType) {
        this.patternType = patternType;
    }

    public DyeColor getColor() {
        return color;
    }

    public void setColor(DyeColor color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmbeddedPattern)) return false;
        EmbeddedPattern that = (EmbeddedPattern) o;
        return getPatternType() == that.getPatternType() &&
                getColor() == that.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatternType(), getColor());
    }
}
