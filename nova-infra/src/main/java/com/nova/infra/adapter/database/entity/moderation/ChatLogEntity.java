package com.nova.infra.adapter.database.entity.moderation;

import java.time.Instant;

/**
 * Database entity record mapping to the 'chat_logs' table.
 * <p>
 * Room chat logs for moderation.
 * Chat type: say, shout, whisper
 */
public record ChatLogEntity(
        long id,
        int userId,
        int roomId,
        String message,
        String chatType,
        Instant createdAt
) {}
