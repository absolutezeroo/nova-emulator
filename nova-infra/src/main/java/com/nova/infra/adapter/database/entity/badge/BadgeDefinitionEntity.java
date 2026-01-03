package com.nova.infra.adapter.database.entity.badge;

/**
 * Database entity record mapping to the 'badge_definitions' table.
 * <p>
 * Available badge codes.
 */
public record BadgeDefinitionEntity(
        String code,
        boolean isRare,
        String description
) {}
