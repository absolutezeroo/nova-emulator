package com.nova.infra.adapter.database.entity.room;

/**
 * Database entity record mapping to the 'room_decoration' table.
 * <p>
 * Visual customization (mood light, jukebox, custom heightmap).
 */
public record RoomDecorationEntity(
        int roomId,
        String backgroundColor,
        String moodLightData,   // JSON
        boolean jukeboxEnabled,
        int jukeboxVolume,
        String customHeightmap,
        Integer customDoorX,
        Integer customDoorY,
        Integer customDoorDir
) {}
