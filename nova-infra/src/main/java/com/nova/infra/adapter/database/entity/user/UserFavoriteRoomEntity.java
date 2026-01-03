package com.nova.infra.adapter.database.entity.user;

import java.time.Instant;

/**
 * Database entity record mapping to the 'user_favorite_rooms' table.
 */
public record UserFavoriteRoomEntity(
        int userId,
        int roomId,
        Instant createdAt
) {}
