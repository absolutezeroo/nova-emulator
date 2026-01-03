package com.nova.core.domain.model.hotel.room;

/**
 * Enumeration of room categories.
 */
public enum RoomCategory {
    NONE(0),
    TRADING(1),
    PARTY(2),
    GAMES(3),
    FANSITE(4),
    PERSONAL(5);

    private final int code;

    RoomCategory(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static RoomCategory fromCode(int code) {
        for (RoomCategory cat : values()) {
            if (cat.code == code) {
                return cat;
            }
        }
        return NONE;
    }
}
