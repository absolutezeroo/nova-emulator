package com.nova.infra.adapter.out.persistence.entity.messenger;

import java.time.Instant;

/**
 * Database entity record mapping to the 'messenger_friendships' table.
 * <p>
 * Bidirectional friendships.
 * Relation: 0=none, 1=heart, 2=smile, 3=skull
 */
public record FriendshipEntity(
        int userId,
        int friendId,
        int relation,
        Instant createdAt
) {}
