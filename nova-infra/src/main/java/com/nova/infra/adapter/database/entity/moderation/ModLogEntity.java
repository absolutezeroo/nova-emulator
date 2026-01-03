package com.nova.infra.adapter.database.entity.moderation;

import java.time.Instant;

/**
 * Database entity record mapping to the 'mod_logs' table.
 * <p>
 * Moderation action logs.
 */
public record ModLogEntity(
        int id,
        int staffId,
        Integer targetUserId,
        Integer targetRoomId,
        String action,
        String details,
        Instant createdAt
) {}
