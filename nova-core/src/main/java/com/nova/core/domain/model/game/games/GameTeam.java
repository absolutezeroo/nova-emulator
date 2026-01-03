package com.nova.core.domain.model.game.games;

/**
 * Enumeration of game teams (colors).
 */
public enum GameTeam {
    NONE(0),
    RED(1),
    GREEN(2),
    BLUE(3),
    YELLOW(4);

    private final int code;

    GameTeam(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static GameTeam fromCode(int code) {
        for (GameTeam team : values()) {
            if (team.code == code) {
                return team;
            }
        }
        return NONE;
    }

    public boolean isTeam() {
        return this != NONE;
    }
}
