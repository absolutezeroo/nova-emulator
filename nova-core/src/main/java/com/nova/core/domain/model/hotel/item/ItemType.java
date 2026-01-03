package com.nova.core.domain.model.hotel.item;

/**
 * Enumeration of item types.
 */
public enum ItemType {
    /** Floor item (furniture placed on floor) */
    FLOOR('S'),
    /** Wall item (poster, window, etc.) */
    WALL('I'),
    /** Effect item (wearable effect) */
    EFFECT('E'),
    /** Badge item */
    BADGE('B'),
    /** Bot item */
    BOT('R'),
    /** Pet item */
    PET('P');

    private final char code;

    ItemType(char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }

    public static ItemType fromCode(char code) {
        for (ItemType type : values()) {
            if (type.code == Character.toUpperCase(code)) {
                return type;
            }
        }
        return FLOOR;
    }

    public static ItemType fromString(String s) {
        if (s == null || s.isEmpty()) return FLOOR;
        return fromCode(s.charAt(0));
    }

    public boolean isFloorItem() {
        return this == FLOOR;
    }

    public boolean isWallItem() {
        return this == WALL;
    }
}
