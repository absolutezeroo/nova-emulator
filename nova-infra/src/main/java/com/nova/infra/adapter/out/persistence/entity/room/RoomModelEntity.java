package com.nova.infra.adapter.out.persistence.entity.room;

/**
 * Database entity record mapping to the 'room_models' table.
 * <p>
 * Room floor models with heightmaps.
 */
public record RoomModelEntity(
        String name,
        String heightmap,
        int doorX,
        int doorY,
        int doorDir,
        boolean isCustom,
        boolean isClubOnly
) {}
