package com.nova.core.domain.model.hotel.unit;

/**
 * Enumeration of room unit types.
 */
public enum RoomUnitType {
    /** Human player avatar */
    USER(1),
    /** NPC/Bot entity */
    BOT(2),
    /** Pet entity */
    PET(3),
    /** Rentable space unit */
    RENTABLE_SPACE(4);

    private final int code;

    RoomUnitType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static RoomUnitType fromCode(int code) {
        for (RoomUnitType type : values()) {
            if (type.code == code) {
                return type;
            }
        }
        return USER;
    }
}
