package com.nova.core.domain.model.core.permission;

/**
 * Value Object representing a Rank's unique identifier.
 */
public record RankId(int value) {

    public RankId {
        if (value <= 0) {
            throw new IllegalArgumentException("Rank ID must be positive");
        }
    }

    public static RankId of(int value) {
        return new RankId(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
