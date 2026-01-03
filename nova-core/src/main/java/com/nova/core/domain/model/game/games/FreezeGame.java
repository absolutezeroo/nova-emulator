package com.nova.core.domain.model.game.games;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.room.RoomId;

import java.util.*;

/**
 * Domain entity representing a Freeze game.
 * <p>
 * Players throw snowballs to freeze opponents and score points.
 * Frozen players can be unfrozen by teammates.
 */
public class FreezeGame extends RoomGame {
    /** Player freeze timers (userId -> ticks remaining) */
    private final Map<UserId, Integer> frozenPlayers;
    /** Snowball power-ups per player */
    private final Map<UserId, Integer> snowballs;
    /** Player lives */
    private final Map<UserId, Integer> lives;

    private static final int DEFAULT_DURATION = 180 * 2; // 3 minutes
    private static final int FREEZE_DURATION = 10 * 2; // 10 seconds
    private static final int DEFAULT_LIVES = 3;
    private static final int DEFAULT_SNOWBALLS = 5;

    public FreezeGame(RoomId roomId) {
        super(roomId, DEFAULT_DURATION);
        this.frozenPlayers = new HashMap<>();
        this.snowballs = new HashMap<>();
        this.lives = new HashMap<>();
    }

    public FreezeGame(RoomId roomId, int durationSeconds) {
        super(roomId, durationSeconds * 2);
        this.frozenPlayers = new HashMap<>();
        this.snowballs = new HashMap<>();
        this.lives = new HashMap<>();
    }

    // ============== Player Setup ==============

    @Override
    public boolean addPlayer(UserId userId, String username, GameTeam team) {
        if (!super.addPlayer(userId, username, team)) return false;
        snowballs.put(userId, DEFAULT_SNOWBALLS);
        lives.put(userId, DEFAULT_LIVES);
        return true;
    }

    @Override
    public boolean removePlayer(UserId userId) {
        if (!super.removePlayer(userId)) return false;
        frozenPlayers.remove(userId);
        snowballs.remove(userId);
        lives.remove(userId);
        return true;
    }

    // ============== Freeze Mechanics ==============

    public boolean throwSnowball(UserId throwerId, UserId targetId) {
        if (!isRunning()) return false;

        GamePlayer thrower = getPlayer(throwerId);
        GamePlayer target = getPlayer(targetId);
        if (thrower == null || target == null) return false;
        if (!thrower.isAlive() || !target.isAlive()) return false;

        // Check if thrower has snowballs
        int available = snowballs.getOrDefault(throwerId, 0);
        if (available <= 0) return false;

        // Same team = unfreeze
        if (thrower.getTeam() == target.getTeam()) {
            unfreezePlayer(targetId);
            return true;
        }

        // Different team = freeze
        snowballs.put(throwerId, available - 1);
        freezePlayer(targetId, throwerId);
        return true;
    }

    private void freezePlayer(UserId userId, UserId freezerId) {
        if (isFrozen(userId)) return;

        frozenPlayers.put(userId, FREEZE_DURATION);

        // Reduce life
        int currentLives = lives.getOrDefault(userId, 0);
        if (currentLives > 0) {
            lives.put(userId, currentLives - 1);
        }

        // Award points to freezer
        addPlayerScore(freezerId, 1);

        // Check if out of lives
        if (currentLives <= 1) {
            GamePlayer player = getPlayer(userId);
            if (player != null) {
                player.eliminate();
            }
        }
    }

    private void unfreezePlayer(UserId userId) {
        frozenPlayers.remove(userId);
    }

    public boolean isFrozen(UserId userId) {
        return frozenPlayers.containsKey(userId) && frozenPlayers.get(userId) > 0;
    }

    public int getFreezeTimeLeft(UserId userId) {
        return frozenPlayers.getOrDefault(userId, 0);
    }

    // ============== Power-ups ==============

    public void addSnowballs(UserId userId, int amount) {
        snowballs.merge(userId, amount, Integer::sum);
    }

    public int getSnowballs(UserId userId) {
        return snowballs.getOrDefault(userId, 0);
    }

    public int getLives(UserId userId) {
        return lives.getOrDefault(userId, 0);
    }

    // ============== Game Events ==============

    @Override
    protected void onGameStart() {
        // Reset all player states
        for (UserId userId : players.keySet()) {
            frozenPlayers.remove(userId);
            snowballs.put(userId, DEFAULT_SNOWBALLS);
            lives.put(userId, DEFAULT_LIVES);
            GamePlayer player = getPlayer(userId);
            if (player != null) player.revive();
        }
    }

    @Override
    protected void onTick() {
        // Update freeze timers
        List<UserId> thawed = new ArrayList<>();
        for (Map.Entry<UserId, Integer> entry : frozenPlayers.entrySet()) {
            int remaining = entry.getValue() - 1;
            if (remaining <= 0) {
                thawed.add(entry.getKey());
            } else {
                entry.setValue(remaining);
            }
        }
        for (UserId userId : thawed) {
            frozenPlayers.remove(userId);
        }

        // Check for team elimination
        checkTeamElimination();
    }

    private void checkTeamElimination() {
        // If only one team has alive players, they win
        Set<GameTeam> aliveTeams = EnumSet.noneOf(GameTeam.class);
        for (GamePlayer player : players.values()) {
            if (player.isAlive() && player.getTeam().isTeam()) {
                aliveTeams.add(player.getTeam());
            }
        }

        if (aliveTeams.size() == 1) {
            end();
        }
    }

    @Override
    protected void onGameEnd() {
        // Final scoring
    }

    @Override
    protected void onReset() {
        frozenPlayers.clear();
        snowballs.clear();
        lives.clear();
    }

    // ============== Getters ==============

    public int getAlivePlayers(GameTeam team) {
        return (int) players.values().stream()
            .filter(p -> p.getTeam() == team && p.isAlive())
            .count();
    }
}
