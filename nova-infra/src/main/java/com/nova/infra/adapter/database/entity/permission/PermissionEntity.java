package com.nova.infra.adapter.database.entity.permission;

import java.time.Instant;

/**
 * Database entity record mapping to the 'permissions' table.
 */
public record PermissionEntity(
        int id,
        Integer categoryId,
        String permissionKey,
        String name,
        String description,
        boolean isDangerous,
        Instant createdAt
) {}
