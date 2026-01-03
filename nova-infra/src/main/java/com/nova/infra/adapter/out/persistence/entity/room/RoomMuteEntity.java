package com.nova.infra.adapter.out.persistence.entity.room;

import java.time.Instant;

/**
 * Database entity record mapping to the 'room_mutes' table.
 */
public record RoomMuteEntity(
        int roomId,
        int userId,
        int mutedById,
        Instant expiresAt
) {}
