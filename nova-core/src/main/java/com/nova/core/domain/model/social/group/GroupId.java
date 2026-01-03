package com.nova.core.domain.model.social.group;

/**
 * Value Object representing a Group's unique identifier.
 */
public record GroupId(int value) {

    public GroupId {
        if (value <= 0) {
            throw new IllegalArgumentException("Group ID must be positive");
        }
    }

    public static GroupId of(int value) {
        return new GroupId(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
