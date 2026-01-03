package com.nova.core.domain.model.hotel.layout;

import java.util.Objects;

/**
 * Domain entity representing a room's floor layout (heightmap).
 * <p>
 * Corresponds to 'room_models' table.
 * The heightmap is a string where:
 * - 'x' or 'X' = blocked tile (wall)
 * - '0'-'9', 'a'-'z' = height level (0-35)
 * - Rows are separated by newlines
 */
public class RoomLayout {
    private final String name;
    private final String heightmap;
    private final int doorX;
    private final int doorY;
    private final int doorDirection;

    // Parsed data (calculated from heightmap)
    private final int mapSizeX;
    private final int mapSizeY;
    private final RoomTile[][] tiles;

    public RoomLayout(String name, String heightmap, int doorX, int doorY, int doorDirection) {
        this.name = Objects.requireNonNull(name, "Layout name cannot be null");
        this.heightmap = Objects.requireNonNull(heightmap, "Heightmap cannot be null");
        this.doorX = doorX;
        this.doorY = doorY;
        this.doorDirection = doorDirection;

        // Parse heightmap
        String[] rows = heightmap.replace("\r", "").split("\n");
        this.mapSizeY = rows.length;
        this.mapSizeX = rows.length > 0 ? rows[0].length() : 0;
        this.tiles = new RoomTile[mapSizeX][mapSizeY];

        parseHeightmap(rows);
    }

    private void parseHeightmap(String[] rows) {
        for (int y = 0; y < rows.length; y++) {
            String row = rows[y];
            for (int x = 0; x < row.length() && x < mapSizeX; x++) {
                char c = row.charAt(x);
                double height = parseHeight(c);

                if (x == doorX && y == doorY) {
                    tiles[x][y] = RoomTile.entry(x, y, height, doorDirection);
                } else if (c == 'x' || c == 'X') {
                    tiles[x][y] = RoomTile.blocked(x, y);
                } else {
                    tiles[x][y] = RoomTile.open(x, y, height);
                }
            }
        }

        // Fill remaining tiles as blocked
        for (int x = 0; x < mapSizeX; x++) {
            for (int y = 0; y < mapSizeY; y++) {
                if (tiles[x][y] == null) {
                    tiles[x][y] = RoomTile.blocked(x, y);
                }
            }
        }
    }

    private double parseHeight(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'a' && c <= 'z') {
            return 10 + (c - 'a');
        } else if (c >= 'A' && c <= 'Z') {
            return 10 + (c - 'A');
        }
        return 0;
    }

    // ============== Tile Access ==============

    public RoomTile getTile(int x, int y) {
        if (!isValidPosition(x, y)) return null;
        return tiles[x][y];
    }

    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public boolean isWalkable(int x, int y) {
        RoomTile tile = getTile(x, y);
        return tile != null && tile.isWalkable();
    }

    public boolean isBlocked(int x, int y) {
        RoomTile tile = getTile(x, y);
        return tile == null || tile.isBlocked();
    }

    public double getHeight(int x, int y) {
        RoomTile tile = getTile(x, y);
        return tile != null ? tile.height() : 0;
    }

    public RoomTile getDoorTile() {
        return getTile(doorX, doorY);
    }

    // ============== Getters ==============

    public String getName() { return name; }
    public String getHeightmap() { return heightmap; }
    public int getDoorX() { return doorX; }
    public int getDoorY() { return doorY; }
    public int getDoorDirection() { return doorDirection; }
    public int getMapSizeX() { return mapSizeX; }
    public int getMapSizeY() { return mapSizeY; }

    /**
     * Get total walkable tile count.
     */
    public int getWalkableTileCount() {
        int count = 0;
        for (int x = 0; x < mapSizeX; x++) {
            for (int y = 0; y < mapSizeY; y++) {
                if (tiles[x][y].isWalkable()) count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "RoomLayout{name='" + name + "', size=" + mapSizeX + "x" + mapSizeY +
               ", door=(" + doorX + "," + doorY + ")}";
    }
}
