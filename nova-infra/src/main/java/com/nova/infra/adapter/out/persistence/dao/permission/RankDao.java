package com.nova.infra.adapter.out.persistence.dao.permission;

import com.nova.infra.adapter.out.persistence.entity.permission.RankEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;
import java.util.Optional;

/**
 * Jdbi DAO for 'ranks' table.
 */
@RegisterConstructorMapper(RankEntity.class)
public interface RankDao {

    @SqlQuery("""
            SELECT id, name, badge, level, prefix, prefix_color AS prefixColor,
                   is_hidden AS isHidden, created_at AS createdAt
            FROM ranks WHERE id = :id
            """)
    Optional<RankEntity> findById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, name, badge, level, prefix, prefix_color AS prefixColor,
                   is_hidden AS isHidden, created_at AS createdAt
            FROM ranks ORDER BY level
            """)
    List<RankEntity> findAll();

    @SqlQuery("""
            SELECT id, name, badge, level, prefix, prefix_color AS prefixColor,
                   is_hidden AS isHidden, created_at AS createdAt
            FROM ranks WHERE is_hidden = FALSE ORDER BY level
            """)
    List<RankEntity> findAllVisible();
}
