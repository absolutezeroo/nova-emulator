package com.nova.infra.adapter.out.persistence.entity.permission;

import java.time.Instant;

/**
 * Database entity record mapping to the 'user_permissions' table.
 * <p>
 * Individual user permission overrides (grant or revoke).
 */
public record UserPermissionEntity(
        int userId,
        int permissionId,
        boolean granted,
        Integer grantedById,
        String reason,
        Instant expiresAt,
        Instant createdAt
) {}
