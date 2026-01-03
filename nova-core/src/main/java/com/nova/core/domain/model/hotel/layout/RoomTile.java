package com.nova.core.domain.model.hotel.layout;

import java.util.Objects;

/**
 * Value Object representing a single tile in a room.
 */
public record RoomTile(
        int x,
        int y,
        double height,
        RoomTileState state,
        int rotation
) {
    public RoomTile {
        if (x < 0) throw new IllegalArgumentException("X coordinate cannot be negative");
        if (y < 0) throw new IllegalArgumentException("Y coordinate cannot be negative");
        state = state != null ? state : RoomTileState.OPEN;
    }

    public static RoomTile open(int x, int y, double height) {
        return new RoomTile(x, y, height, RoomTileState.OPEN, 0);
    }

    public static RoomTile blocked(int x, int y) {
        return new RoomTile(x, y, 0, RoomTileState.BLOCKED, 0);
    }

    public static RoomTile entry(int x, int y, double height, int rotation) {
        return new RoomTile(x, y, height, RoomTileState.ENTRY, rotation);
    }

    public boolean isWalkable() {
        return state == RoomTileState.OPEN || state == RoomTileState.ENTRY;
    }

    public boolean isBlocked() {
        return state == RoomTileState.BLOCKED;
    }

    public boolean isSittable() {
        return state == RoomTileState.SIT;
    }

    public boolean isLayable() {
        return state == RoomTileState.LAY;
    }

    public boolean isEntry() {
        return state == RoomTileState.ENTRY;
    }

    public RoomTile withHeight(double newHeight) {
        return new RoomTile(x, y, newHeight, state, rotation);
    }

    public RoomTile withState(RoomTileState newState) {
        return new RoomTile(x, y, height, newState, rotation);
    }

    public RoomTile withRotation(int newRotation) {
        return new RoomTile(x, y, height, state, newRotation);
    }

    /**
     * Calculate distance to another tile.
     */
    public double distanceTo(RoomTile other) {
        int dx = other.x - x;
        int dy = other.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Check if adjacent to another tile.
     */
    public boolean isAdjacentTo(RoomTile other) {
        return Math.abs(other.x - x) <= 1 && Math.abs(other.y - y) <= 1;
    }
}
