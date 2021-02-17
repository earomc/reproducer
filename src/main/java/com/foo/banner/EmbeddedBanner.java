package com.foo.banner;

import dev.morphia.annotations.Embedded;

import java.util.Objects;

@Embedded
public class EmbeddedBanner {


    private EmbeddedBannerMeta bannerMeta;
    private DyeColor baseColor;

    public EmbeddedBanner() {
        this.baseColor = DyeColor.WHITE;
    }

    public EmbeddedBanner(EmbeddedBannerMeta bannerMeta, DyeColor baseColor) {
        this.bannerMeta = bannerMeta;
        this.baseColor = baseColor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmbeddedBanner)) return false;
        EmbeddedBanner banner = (EmbeddedBanner) o;
        return Objects.equals(bannerMeta, banner.bannerMeta) &&
                baseColor == banner.baseColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bannerMeta, baseColor);
    }


}
