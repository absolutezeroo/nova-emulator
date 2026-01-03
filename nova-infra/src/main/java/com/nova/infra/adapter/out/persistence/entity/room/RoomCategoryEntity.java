package com.nova.infra.adapter.out.persistence.entity.room;

/**
 * Database entity record mapping to the 'room_categories' table.
 * <p>
 * Navigator room categories.
 */
public record RoomCategoryEntity(
        int id,
        Integer parentId,
        String name,
        String nameKey,
        int iconId,
        int minRank,
        boolean isPublic,
        int orderNum
) {}
