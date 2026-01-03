package com.nova.infra.adapter.persistence.entity.room;

/**
 * Database entity record mapping to the 'room_rights' table.
 * <p>
 * Users with rights in rooms.
 */
public record RoomRightsEntity(
        int roomId,
        int userId
) {}
