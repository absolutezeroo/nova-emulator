package com.nova.core.domain.model.social.messenger;

/**
 * Enumeration of messenger relationship types.
 */
public enum MessengerRelation {
    NONE(0),
    HEART(1),      // Lover/Best friend
    SMILE(2),      // Friend
    BOBBA(3);      // Hated/Enemy

    private final int code;

    MessengerRelation(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static MessengerRelation fromCode(int code) {
        for (MessengerRelation rel : values()) {
            if (rel.code == code) {
                return rel;
            }
        }
        return NONE;
    }
}
