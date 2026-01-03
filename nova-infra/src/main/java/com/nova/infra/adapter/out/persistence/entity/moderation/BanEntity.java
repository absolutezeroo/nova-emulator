package com.nova.infra.adapter.out.persistence.entity.moderation;

import java.time.Instant;

/**
 * Database entity record mapping to the 'bans' table.
 * <p>
 * Global bans (user, IP, machine).
 * Ban type: user, ip, machine, super
 */
public record BanEntity(
        int id,
        Integer userId,
        String ipAddress,
        String machineId,
        String reason,
        int bannedById,
        String banType,
        Instant createdAt,
        Instant expiresAt      // NULL = permanent
) {}
