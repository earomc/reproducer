package com.foo.banner;

import dev.morphia.annotations.Embedded;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Embedded
public class EmbeddedBannerMeta {

    private List<EmbeddedPattern> patterns;

    public EmbeddedBannerMeta(List<EmbeddedPattern> patterns) {
        this.patterns = patterns;
    }

    public EmbeddedBannerMeta() {
        this.patterns = new ArrayList<>();
        //empty constructor
    }

    public @NotNull
    List<EmbeddedPattern> getPatterns() {
        return patterns;
    }

    public void setPatterns(@NotNull List<EmbeddedPattern> patterns) {
        this.patterns = patterns;
    }

    public void addPattern(@NotNull EmbeddedPattern pattern) {
        patterns.add(pattern);
    }

    public @NotNull
    EmbeddedPattern getPattern(int i) {
        return patterns.get(i);
    }

    public @NotNull
    EmbeddedPattern removePattern(int i) {
        return patterns.remove(i);
    }

    public void setPattern(int i, @NotNull EmbeddedPattern pattern) {
        patterns.set(i, pattern);
    }

    public int numberOfPatterns() {
        return patterns.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmbeddedBannerMeta)) return false;
        EmbeddedBannerMeta that = (EmbeddedBannerMeta) o;
        return Objects.equals(getPatterns(), that.getPatterns());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatterns());
    }
}
