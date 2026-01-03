package com.nova.infra.adapter.out.persistence.entity.user;

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
    public boolean isValid() {
        if (isUsed) return false;
        if (expiresAt == null) return true;
        return Instant.now().isBefore(expiresAt);
    }
}
