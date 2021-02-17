package com.foo.banner;


/**
 * All supported color values for dyes and cloth
 */
public enum DyeColor {

    /**
     * Represents white dye.
     */
    WHITE(0x0, 0xF),
    /**
     * Represents orange dye.
     */
    ORANGE(0x1, 0xE),
    /**
     * Represents magenta dye.
     */
    MAGENTA(0x2, 0xD),
    /**
     * Represents light blue dye.
     */
    LIGHT_BLUE(0x3, 0xC),
    /**
     * Represents yellow dye.
     */
    YELLOW(0x4, 0xB),
    /**
     * Represents lime dye.
     */
    LIME(0x5, 0xA),
    /**
     * Represents pink dye.
     */
    PINK(0x6, 0x9),
    /**
     * Represents gray dye.
     */
    GRAY(0x7, 0x8),
    /**
     * Represents light gray dye.
     */
    LIGHT_GRAY(0x8, 0x7),
    /**
     * Represents cyan dye.
     */
    CYAN(0x9, 0x6),
    /**
     * Represents purple dye.
     */
    PURPLE(0xA, 0x5),
    /**
     * Represents blue dye.
     */
    BLUE(0xB, 0x4),
    /**
     * Represents brown dye.
     */
    BROWN(0xC, 0x3),
    /**
     * Represents green dye.
     */
    GREEN(0xD, 0x2),
    /**
     * Represents red dye.
     */
    RED(0xE, 0x1),
    /**
     * Represents black dye.
     */
    BLACK(0xF, 0x0);

    private final byte woolData;
    private final byte dyeData;


    DyeColor(final int woolData, final int dyeData) {
        this.woolData = (byte) woolData;
        this.dyeData = (byte) dyeData;
    }

    /**
     * Gets the associated wool data value representing this color.
     *
     * @return A byte containing the wool data value of this color
     * @see #getDyeData()
     * @deprecated Magic value
     */
    @Deprecated
    public byte getWoolData() {
        return woolData;
    }

    /**
     * Gets the associated dye data value representing this color.
     *
     * @return A byte containing the dye data value of this color
     * @see #getWoolData()
     * @deprecated Magic value
     */
    @Deprecated
    public byte getDyeData() {
        return dyeData;
    }


}
