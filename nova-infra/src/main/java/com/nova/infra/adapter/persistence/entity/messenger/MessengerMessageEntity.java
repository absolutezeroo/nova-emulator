package com.nova.infra.adapter.persistence.entity.messenger;

import java.time.Instant;

/**
 * Database entity record mapping to the 'messenger_messages' table.
 * <p>
 * Offline messenger messages.
 */
public record MessengerMessageEntity(
        int id,
        int senderId,
        int receiverId,
        String message,
        Instant createdAt,
        boolean isRead
) {}
