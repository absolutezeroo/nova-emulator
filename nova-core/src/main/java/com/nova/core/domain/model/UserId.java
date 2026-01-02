package com.nova.core.domain.model;

import java.util.Objects;

/**
 * Value Object representing a User's unique identifier.
 */
public record UserId(int value) {

    public UserId {
        if (value <= 0) {
            throw new IllegalArgumentException("User ID must be positive");
        }
    }

    public static UserId of(int value) {
        return new UserId(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
