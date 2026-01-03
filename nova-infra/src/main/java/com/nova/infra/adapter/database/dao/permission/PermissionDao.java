package com.nova.infra.adapter.database.dao.permission;

import com.nova.infra.adapter.database.entity.permission.PermissionEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Jdbi DAO for 'permissions' table.
 */
@RegisterConstructorMapper(PermissionEntity.class)
public interface PermissionDao {

    @SqlQuery("""
            SELECT id, category_id AS categoryId, permission_key AS permissionKey,
                   name, description, is_dangerous AS isDangerous, created_at AS createdAt
            FROM permissions WHERE id = :id
            """)
    Optional<PermissionEntity> findById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, category_id AS categoryId, permission_key AS permissionKey,
                   name, description, is_dangerous AS isDangerous, created_at AS createdAt
            FROM permissions WHERE permission_key = :key
            """)
    Optional<PermissionEntity> findByKey(@Bind("key") String key);

    @SqlQuery("""
            SELECT id, category_id AS categoryId, permission_key AS permissionKey,
                   name, description, is_dangerous AS isDangerous, created_at AS createdAt
            FROM permissions ORDER BY category_id, name
            """)
    List<PermissionEntity> findAll();

    @SqlQuery("""
            SELECT p.permission_key
            FROM permissions p
            INNER JOIN rank_permissions rp ON p.id = rp.permission_id
            WHERE rp.rank_id = :rankId
            """)
    Set<String> findPermissionKeysByRankId(@Bind("rankId") int rankId);

    @SqlQuery("""
            SELECT p.permission_key
            FROM permissions p
            INNER JOIN user_permissions up ON p.id = up.permission_id
            WHERE up.user_id = :userId AND up.granted = TRUE
              AND (up.expires_at IS NULL OR up.expires_at > NOW())
            """)
    Set<String> findGrantedPermissionKeysByUserId(@Bind("userId") int userId);

    @SqlQuery("""
            SELECT p.permission_key
            FROM permissions p
            INNER JOIN user_permissions up ON p.id = up.permission_id
            WHERE up.user_id = :userId AND up.granted = FALSE
              AND (up.expires_at IS NULL OR up.expires_at > NOW())
            """)
    Set<String> findRevokedPermissionKeysByUserId(@Bind("userId") int userId);
}
