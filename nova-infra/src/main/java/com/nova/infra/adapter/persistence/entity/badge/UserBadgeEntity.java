package com.nova.infra.adapter.persistence.entity.badge;

import java.time.Instant;

/**
 * Database entity record mapping to the 'user_badges' table.
 * <p>
 * User badge collection.
 * Slot: 0=not worn, 1-5=slot position
 */
public record UserBadgeEntity(
        int id,
        int userId,
        String badgeCode,
        int slot,
        Instant createdAt
) {}
