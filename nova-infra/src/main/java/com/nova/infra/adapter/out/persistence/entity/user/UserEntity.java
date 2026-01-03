package com.nova.infra.adapter.out.persistence.entity.user;

import java.time.Instant;

/**
 * Database entity record mapping to the 'users' table.
 * <p>
 * Core identity data (immutable).
 * Profile/mutable data is in user_data table.
 */
public record UserEntity(
        int id,
        String username,
        String email,
        String passwordHash,
        int rankId,
        Instant createdAt
) {
    public static UserEntity minimal(int id, String username) {
        return new UserEntity(id, username, "", "", 1, Instant.now());
    }
}
