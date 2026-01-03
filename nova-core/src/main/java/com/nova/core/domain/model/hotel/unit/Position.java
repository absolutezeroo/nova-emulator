package com.nova.core.domain.model.hotel.unit;

/**
 * Value Object representing a 3D position in a room.
 */
public record Position(
        int x,
        int y,
        double z,
        int headRotation,
        int bodyRotation
) {
    public Position {
        if (x < 0) x = 0;
        if (y < 0) y = 0;
        headRotation = normalizeRotation(headRotation);
        bodyRotation = normalizeRotation(bodyRotation);
    }

    private static int normalizeRotation(int rotation) {
        return ((rotation % 8) + 8) % 8;
    }

    public static Position of(int x, int y, double z) {
        return new Position(x, y, z, 0, 0);
    }

    public static Position of(int x, int y, double z, int rotation) {
        return new Position(x, y, z, rotation, rotation);
    }

    public static Position zero() {
        return new Position(0, 0, 0, 0, 0);
    }

    // ============== Movement ==============

    public Position moveTo(int newX, int newY, double newZ) {
        return new Position(newX, newY, newZ, headRotation, bodyRotation);
    }

    public Position withZ(double newZ) {
        return new Position(x, y, newZ, headRotation, bodyRotation);
    }

    public Position withRotation(int rotation) {
        return new Position(x, y, z, rotation, rotation);
    }

    public Position withHeadRotation(int newHeadRotation) {
        return new Position(x, y, z, newHeadRotation, bodyRotation);
    }

    public Position withBodyRotation(int newBodyRotation) {
        return new Position(x, y, z, headRotation, newBodyRotation);
    }

    // ============== Distance Calculations ==============

    public double distanceTo(Position other) {
        int dx = other.x - x;
        int dy = other.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public int manhattanDistance(Position other) {
        return Math.abs(other.x - x) + Math.abs(other.y - y);
    }

    public boolean isAdjacent(Position other) {
        return Math.abs(other.x - x) <= 1 && Math.abs(other.y - y) <= 1 && !equals2D(other);
    }

    public boolean equals2D(Position other) {
        return x == other.x && y == other.y;
    }

    // ============== Rotation Calculations ==============

    /**
     * Calculate rotation to face another position.
     */
    public int calculateRotation(Position target) {
        return calculateRotation(target.x, target.y);
    }

    /**
     * Calculate rotation to face coordinates.
     */
    public int calculateRotation(int targetX, int targetY) {
        int dx = targetX - x;
        int dy = targetY - y;

        if (dx == 0 && dy == 0) return bodyRotation;

        if (dx > 0 && dy > 0) return 3;
        if (dx > 0 && dy < 0) return 1;
        if (dx < 0 && dy > 0) return 5;
        if (dx < 0 && dy < 0) return 7;
        if (dx > 0) return 2;
        if (dx < 0) return 6;
        if (dy > 0) return 4;
        return 0;
    }

    /**
     * Get position in front based on rotation.
     */
    public Position getPositionInFront() {
        return switch (bodyRotation) {
            case 0 -> of(x, y - 1, z);
            case 1 -> of(x + 1, y - 1, z);
            case 2 -> of(x + 1, y, z);
            case 3 -> of(x + 1, y + 1, z);
            case 4 -> of(x, y + 1, z);
            case 5 -> of(x - 1, y + 1, z);
            case 6 -> of(x - 1, y, z);
            case 7 -> of(x - 1, y - 1, z);
            default -> this;
        };
    }

    @Override
    public String toString() {
        return String.format("(%d,%d,%.2f)", x, y, z);
    }
}
