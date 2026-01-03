package com.nova.infra.adapter.out.persistence.entity.user;

/**
 * Database entity record mapping to the 'user_wardrobe' table.
 * <p>
 * Saved outfit slots.
 */
public record UserWardrobeEntity(
        int id,
        int userId,
        int slot,
        String figure,
        String gender
) {}
