package com.nova.infra.adapter.persistence.entity.room;

import java.time.Instant;

/**
 * Database entity record mapping to the 'rooms' table.
 * <p>
 * Core room data only. Settings are in room_settings, decoration in room_decoration.
 */
public record RoomEntity(
        int id,
        int ownerId,
        Integer categoryId,
        String name,
        String description,
        String modelName,
        String password,
        String state,  // ENUM: open, locked, password, invisible
        int score,
        int usersCount,
        Instant createdAt,
        Instant updatedAt
) {}
