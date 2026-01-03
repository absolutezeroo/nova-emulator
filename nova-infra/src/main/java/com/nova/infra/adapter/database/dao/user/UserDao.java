package com.nova.infra.adapter.database.dao.user;

import com.nova.infra.adapter.database.entity.user.UserEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.Optional;

/**
 * Jdbi DAO for 'users' table (core identity).
 */
@RegisterConstructorMapper(UserEntity.class)
public interface UserDao {

    @SqlQuery("""
            SELECT id, username, email, password_hash AS passwordHash,
                   rank_id AS rankId, created_at AS createdAt
            FROM users WHERE id = :id
            """)
    Optional<UserEntity> findById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, username, email, password_hash AS passwordHash,
                   rank_id AS rankId, created_at AS createdAt
            FROM users WHERE username = :username
            """)
    Optional<UserEntity> findByUsername(@Bind("username") String username);

    @SqlQuery("""
            SELECT id, username, email, password_hash AS passwordHash,
                   rank_id AS rankId, created_at AS createdAt
            FROM users WHERE email = :email
            """)
    Optional<UserEntity> findByEmail(@Bind("email") String email);

    @SqlQuery("SELECT EXISTS(SELECT 1 FROM users WHERE username = :username)")
    boolean existsByUsername(@Bind("username") String username);

    @SqlQuery("SELECT EXISTS(SELECT 1 FROM users WHERE email = :email)")
    boolean existsByEmail(@Bind("email") String email);
}
