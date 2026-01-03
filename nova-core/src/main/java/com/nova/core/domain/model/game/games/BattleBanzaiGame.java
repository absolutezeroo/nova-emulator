package com.nova.core.domain.model.game.games;

import com.nova.core.domain.model.hotel.room.RoomId;

import java.util.*;

/**
 * Domain entity representing a Battle Banzai game.
 * <p>
 * Players jump on tiles to capture them for their team.
 * Tiles change color based on who stepped on them.
 */
public class BattleBanzaiGame extends RoomGame {
    /** Tile states: 0=neutral, 1=red, 2=green, 3=blue, 4=yellow, +10=locked */
    private final Map<String, Integer> tiles;

    private static final int DEFAULT_DURATION = 120 * 2; // 2 minutes in half-second ticks

    public BattleBanzaiGame(RoomId roomId) {
        super(roomId, DEFAULT_DURATION);
        this.tiles = new HashMap<>();
    }

    public BattleBanzaiGame(RoomId roomId, int durationSeconds) {
        super(roomId, durationSeconds * 2);
        this.tiles = new HashMap<>();
    }

    // ============== Tile Management ==============

    public void registerTile(int x, int y) {
        tiles.put(tileKey(x, y), 0);
    }

    public void stepOnTile(int x, int y, GameTeam team) {
        String key = tileKey(x, y);
        if (!tiles.containsKey(key)) return;

        int currentState = tiles.get(key);

        // If tile is locked, ignore
        if (currentState >= 10) return;

        int newState;
        if (currentState == 0) {
            // Neutral -> first step (color 1)
            newState = team.getCode();
        } else if (currentState == team.getCode()) {
            // Same team stepped again -> lock tile (color + 10)
            newState = team.getCode() + 10;
            addTeamScore(team, 1);
        } else {
            // Different team -> reset to new team
            newState = team.getCode();
        }

        tiles.put(key, newState);
    }

    public int getTileState(int x, int y) {
        return tiles.getOrDefault(tileKey(x, y), 0);
    }

    public GameTeam getTileTeam(int x, int y) {
        int state = getTileState(x, y);
        int teamCode = state >= 10 ? state - 10 : state;
        return GameTeam.fromCode(teamCode);
    }

    public boolean isTileLocked(int x, int y) {
        return getTileState(x, y) >= 10;
    }

    private String tileKey(int x, int y) {
        return x + ":" + y;
    }

    // ============== Game Events ==============

    @Override
    protected void onGameStart() {
        // Reset all tiles to neutral
        for (String key : tiles.keySet()) {
            tiles.put(key, 0);
        }
    }

    @Override
    protected void onTick() {
        // Game logic per tick
    }

    @Override
    protected void onGameEnd() {
        // Calculate final scores based on locked tiles
    }

    @Override
    protected void onReset() {
        // Reset tiles
        for (String key : tiles.keySet()) {
            tiles.put(key, 0);
        }
    }

    // ============== Getters ==============

    public int getTileCount() {
        return tiles.size();
    }

    public int getLockedTileCount(GameTeam team) {
        int count = 0;
        for (int state : tiles.values()) {
            if (state >= 10 && GameTeam.fromCode(state - 10) == team) {
                count++;
            }
        }
        return count;
    }
}
