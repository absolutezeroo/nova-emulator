package com.nova.core.domain.model.core.permission;

import java.util.Objects;

/**
 * Domain entity representing a permission.
 * <p>
 * Permissions define what actions users/ranks can perform.
 * Examples: ACC_SUPPORTTOOL, ACC_MODTOOL_TICKET_Q, CMD_SIT
 */
public record Permission(
        PermissionId id,
        String key,
        String category,
        String description
) {
    public Permission {
        Objects.requireNonNull(id, "Permission ID cannot be null");
        Objects.requireNonNull(key, "Permission key cannot be null");
        category = category != null ? category : "general";
        description = description != null ? description : "";
    }

    public static Permission of(int id, String key) {
        return new Permission(PermissionId.of(id), key, "general", "");
    }

    public static Permission of(int id, String key, String category, String description) {
        return new Permission(PermissionId.of(id), key, category, description);
    }

    /**
     * Check if this permission matches a given key.
     */
    public boolean matches(String permissionKey) {
        return key.equalsIgnoreCase(permissionKey);
    }

    /**
     * Check if this permission belongs to a category.
     */
    public boolean inCategory(String cat) {
        return category.equalsIgnoreCase(cat);
    }
}
