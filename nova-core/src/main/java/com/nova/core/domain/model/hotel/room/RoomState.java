package com.nova.core.domain.model.hotel.room;

/**
 * Enumeration of room access states.
 */
public enum RoomState {
    OPEN(0),
    DOORBELL(1),
    PASSWORD(2),
    INVISIBLE(3);

    private final int code;

    RoomState(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static RoomState fromCode(int code) {
        for (RoomState state : values()) {
            if (state.code == code) {
                return state;
            }
        }
        return OPEN;
    }
}
