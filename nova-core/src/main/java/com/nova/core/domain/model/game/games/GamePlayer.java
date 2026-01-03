package com.nova.core.domain.model.game.games;

import com.nova.core.domain.model.core.user.UserId;

import java.util.Objects;

/**
 * Value Object representing a player in a room game.
 */
public class GamePlayer {
    private final UserId userId;
    private final String username;
    private GameTeam team;
    private int score;
    private boolean alive;

    public GamePlayer(UserId userId, String username, GameTeam team) {
        this.userId = Objects.requireNonNull(userId, "User ID cannot be null");
        this.username = username != null ? username : "";
        this.team = team != null ? team : GameTeam.NONE;
        this.score = 0;
        this.alive = true;
    }

    public static GamePlayer create(UserId userId, String username) {
        return new GamePlayer(userId, username, GameTeam.NONE);
    }

    // ============== Game Actions ==============

    public void joinTeam(GameTeam team) {
        this.team = team;
    }

    public void leaveTeam() {
        this.team = GameTeam.NONE;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public void resetScore() {
        this.score = 0;
    }

    public void eliminate() {
        this.alive = false;
    }

    public void revive() {
        this.alive = true;
    }

    public void reset() {
        this.score = 0;
        this.alive = true;
    }

    // ============== Getters ==============

    public UserId getUserId() { return userId; }
    public String getUsername() { return username; }
    public GameTeam getTeam() { return team; }
    public int getScore() { return score; }
    public boolean isAlive() { return alive; }
    public boolean isInTeam() { return team.isTeam(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamePlayer that = (GamePlayer) o;
        return Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        return "GamePlayer{user=" + username + ", team=" + team + ", score=" + score + "}";
    }
}
