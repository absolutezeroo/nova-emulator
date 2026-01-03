package com.nova.infra.adapter.persistence.entity.permission;

/**
 * Database entity record mapping to the 'rank_permissions' table.
 * <p>
 * Many-to-many link between ranks and permissions.
 */
public record RankPermissionEntity(
        int rankId,
        int permissionId
) {}
