package com.nova.infra.adapter.persistence.entity.user;

import java.time.Instant;

/**
 * Database entity record mapping to the 'user_tickets' table.
 * <p>
 * SSO authentication tickets (single-use tokens).
 */
public record UserTicketEntity(
        int id,
        int userId,
        String ticket,
        String ipAddress,
        Instant createdAt,
        Instant expiresAt,
        Instant usedAt,
        boolean isUsed
) {
}
