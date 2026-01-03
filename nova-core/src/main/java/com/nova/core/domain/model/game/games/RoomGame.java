package com.nova.core.domain.model.game.games;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.room.RoomId;

import java.util.*;

/**
 * Abstract base class for room games (BattleBanzai, Freeze, Football).
 */
public abstract class RoomGame {
    protected final RoomId roomId;
    protected final Map<UserId, GamePlayer> players;
    protected final Map<GameTeam, Integer> teamScores;

    protected GameState state;
    protected int timeLeft; // In ticks
    protected int gameDuration; // In ticks

    protected RoomGame(RoomId roomId, int gameDuration) {
        this.roomId = Objects.requireNonNull(roomId, "Room ID cannot be null");
        this.players = new HashMap<>();
        this.teamScores = new EnumMap<>(GameTeam.class);
        for (GameTeam team : GameTeam.values()) {
            if (team.isTeam()) {
                teamScores.put(team, 0);
            }
        }
        this.state = GameState.IDLE;
        this.gameDuration = gameDuration;
        this.timeLeft = gameDuration;
    }

    // ============== Game Lifecycle ==============

    public void start() {
        if (state != GameState.IDLE) return;
        state = GameState.STARTING;
        timeLeft = gameDuration;
        onGameStart();
    }

    public void tick() {
        if (state == GameState.STARTING) {
            state = GameState.RUNNING;
        }

        if (state == GameState.RUNNING) {
            timeLeft--;
            onTick();

            if (timeLeft <= 0) {
                end();
            }
        }
    }

    public void end() {
        if (state != GameState.RUNNING && state != GameState.STARTING) return;
        state = GameState.ENDING;
        onGameEnd();
        state = GameState.ENDED;
    }

    public void reset() {
        state = GameState.IDLE;
        timeLeft = gameDuration;
        for (GameTeam team : teamScores.keySet()) {
            teamScores.put(team, 0);
        }
        for (GamePlayer player : players.values()) {
            player.reset();
        }
        onReset();
    }

    // ============== Player Management ==============

    public boolean addPlayer(UserId userId, String username, GameTeam team) {
        if (players.containsKey(userId)) return false;
        if (state == GameState.RUNNING) return false;

        GamePlayer player = new GamePlayer(userId, username, team);
        players.put(userId, player);
        return true;
    }

    public boolean removePlayer(UserId userId) {
        return players.remove(userId) != null;
    }

    public boolean switchTeam(UserId userId, GameTeam team) {
        GamePlayer player = players.get(userId);
        if (player == null) return false;
        if (state == GameState.RUNNING) return false;

        player.joinTeam(team);
        return true;
    }

    public GamePlayer getPlayer(UserId userId) {
        return players.get(userId);
    }

    public boolean isPlaying(UserId userId) {
        return players.containsKey(userId);
    }

    // ============== Scoring ==============

    public void addTeamScore(GameTeam team, int points) {
        if (!team.isTeam()) return;
        teamScores.merge(team, points, Integer::sum);
    }

    public void addPlayerScore(UserId userId, int points) {
        GamePlayer player = players.get(userId);
        if (player != null) {
            player.addScore(points);
            addTeamScore(player.getTeam(), points);
        }
    }

    public int getTeamScore(GameTeam team) {
        return teamScores.getOrDefault(team, 0);
    }

    public GameTeam getWinningTeam() {
        GameTeam winner = GameTeam.NONE;
        int highScore = 0;
        for (Map.Entry<GameTeam, Integer> entry : teamScores.entrySet()) {
            if (entry.getValue() > highScore) {
                highScore = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }

    // ============== Team Queries ==============

    public List<GamePlayer> getTeamPlayers(GameTeam team) {
        List<GamePlayer> result = new ArrayList<>();
        for (GamePlayer player : players.values()) {
            if (player.getTeam() == team) {
                result.add(player);
            }
        }
        return result;
    }

    public int getTeamPlayerCount(GameTeam team) {
        return (int) players.values().stream()
            .filter(p -> p.getTeam() == team)
            .count();
    }

    // ============== Abstract Methods ==============

    protected abstract void onGameStart();
    protected abstract void onTick();
    protected abstract void onGameEnd();
    protected abstract void onReset();

    // ============== State Checks ==============

    public boolean isIdle() { return state == GameState.IDLE; }
    public boolean isRunning() { return state == GameState.RUNNING; }
    public boolean isEnded() { return state == GameState.ENDED; }
    public boolean isActive() { return state == GameState.RUNNING || state == GameState.STARTING; }

    // ============== Getters ==============

    public RoomId getRoomId() { return roomId; }
    public GameState getState() { return state; }
    public int getTimeLeft() { return timeLeft; }
    public int getGameDuration() { return gameDuration; }
    public Collection<GamePlayer> getPlayers() { return Collections.unmodifiableCollection(players.values()); }
    public int getPlayerCount() { return players.size(); }
}
