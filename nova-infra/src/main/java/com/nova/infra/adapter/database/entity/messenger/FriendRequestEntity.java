package com.nova.infra.adapter.database.entity.messenger;

import java.time.Instant;

/**
 * Database entity record mapping to the 'messenger_requests' table.
 * <p>
 * Pending friend requests.
 */
public record FriendRequestEntity(
        int id,
        int senderId,
        int receiverId,
        Instant createdAt
) {}
