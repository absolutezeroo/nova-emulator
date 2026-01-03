package com.nova.core.domain.model.core.permission;

/**
 * Value Object representing a Permission's unique identifier.
 */
public record PermissionId(int value) {

    public PermissionId {
        if (value <= 0) {
            throw new IllegalArgumentException("Permission ID must be positive");
        }
    }

    public static PermissionId of(int value) {
        return new PermissionId(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
