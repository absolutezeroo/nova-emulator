package com.nova.core.domain.model.game.wired;

/**
 * Enumeration of Wired effect types.
 */
public enum WiredEffectType {
    TOGGLE_STATE(0),
    RESET_TIMERS(1),
    MATCH_SSHOT(3),
    MOVE_ROTATE(4),
    GIVE_SCORE(6),
    SHOW_MESSAGE(7),
    TELEPORT(8),
    TOGGLE_STATE_LONG(9),
    MOVE_DIRECTION(10),
    GIVE_SCORE_TEAM(11),
    CHASE(12),
    FLEE(13),
    MOVE_TO_DIR(14),
    GIVE_REWARD(17),
    CALL_STACKS(18),
    KICK_USER(19),
    MUTE_TRIGGER(20),
    BOT_TALK(21),
    BOT_GIVE_HAND_ITEM(22),
    BOT_MOVE(23),
    BOT_TALK_TO_AVATAR(24),
    BOT_FOLLOW_AVATAR(25),
    BOT_CLOTHES(26),
    BOT_TELEPORT(27),
    SET_ROLLER_SPEED(28),
    RAISE_FURNI(29),
    LEAVE_TEAM(30),
    JOIN_TEAM(31);

    private final int code;

    WiredEffectType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static WiredEffectType fromCode(int code) {
        for (WiredEffectType type : values()) {
            if (type.code == code) {
                return type;
            }
        }
        return TOGGLE_STATE;
    }
}
