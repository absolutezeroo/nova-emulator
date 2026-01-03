package com.nova.infra.adapter.out.persistence.entity.permission;

/**
 * Database entity record mapping to the 'permission_categories' table.
 */
public record PermissionCategoryEntity(
        int id,
        String name,
        String description,
        int orderNum
) {}
