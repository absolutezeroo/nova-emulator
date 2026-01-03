package com.nova.infra.adapter.persistence.entity.room;

import java.time.Instant;

/**
 * Database entity record mapping to the 'room_bans' table.
 */
public record RoomBanEntity(
        int roomId,
        int userId,
        int bannedById,
        Instant expiresAt
) {}
