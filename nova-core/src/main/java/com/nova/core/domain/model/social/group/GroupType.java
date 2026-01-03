package com.nova.core.domain.model.social.group;

/**
 * Enumeration of group access types.
 */
public enum GroupType {
    /** Anyone can join */
    OPEN(0),
    /** Request required */
    LOCKED(1),
    /** Closed to new members */
    CLOSED(2);

    private final int code;

    GroupType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static GroupType fromCode(int code) {
        for (GroupType type : values()) {
            if (type.code == code) {
                return type;
            }
        }
        return OPEN;
    }
}
