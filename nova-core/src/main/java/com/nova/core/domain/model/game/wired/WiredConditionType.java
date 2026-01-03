package com.nova.core.domain.model.game.wired;

/**
 * Enumeration of Wired condition types.
 */
public enum WiredConditionType {
    FURNIS_HAVE_AVATARS(0),
    FURNIS_HAVE_NO_AVATARS(1),
    TRIGGER_ON_FURNI(2),
    TRIGGER_NOT_ON_FURNI(3),
    HAS_HANDITEM(4),
    DATE_RANGE(5),
    ACTOR_IN_GROUP(6),
    ACTOR_NOT_IN_GROUP(7),
    ACTOR_WEARS_BADGE(8),
    ACTOR_NOT_WEARS_BADGE(9),
    ACTOR_WEARS_EFFECT(10),
    ACTOR_NOT_WEARS_EFFECT(11),
    STUFF_TYPE_MATCHES(12),
    STUFF_TYPE_NOT_MATCHES(13),
    TIME_MORE_THAN(14),
    TIME_LESS_THAN(15),
    HAS_FURNI_ON(16),
    HAS_NO_FURNI_ON(17),
    MATCH_SNAPSHOT(18),
    NOT_MATCH_SNAPSHOT(19),
    ACTOR_IN_TEAM(20),
    ACTOR_NOT_IN_TEAM(21),
    USER_COUNT_IN(22),
    NOT_USER_COUNT_IN(23);

    private final int code;

    WiredConditionType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static WiredConditionType fromCode(int code) {
        for (WiredConditionType type : values()) {
            if (type.code == code) {
                return type;
            }
        }
        return FURNIS_HAVE_AVATARS;
    }
}
