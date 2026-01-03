package com.nova.core.domain.model.hotel.room;

/**
 * Value Object representing a Room's unique identifier.
 */
public record RoomId(int value) {

    public RoomId {
        if (value <= 0) {
            throw new IllegalArgumentException("Room ID must be positive");
        }
    }

    public static RoomId of(int value) {
        return new RoomId(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
