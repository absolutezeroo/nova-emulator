package com.nova.infra.adapter.database.dao.room;

import com.nova.infra.adapter.database.entity.room.RoomEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.Optional;

/**
 * Jdbi DAO for 'rooms' table.
 */
@RegisterConstructorMapper(RoomEntity.class)
public interface RoomDao {

    @SqlQuery("""
            SELECT id, owner_id AS ownerId, category_id AS categoryId, name, description,
                   model_name AS modelName, password, state, score, users_count AS usersCount,
                   created_at AS createdAt, updated_at AS updatedAt
            FROM rooms WHERE id = :id
            """)
    Optional<RoomEntity> findById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, owner_id AS ownerId, category_id AS categoryId, name, description,
                   model_name AS modelName, password, state, score, users_count AS usersCount,
                   created_at AS createdAt, updated_at AS updatedAt
            FROM rooms WHERE owner_id = :ownerId ORDER BY id
            """)
    List<RoomEntity> findByOwnerId(@Bind("ownerId") int ownerId);

    @SqlQuery("SELECT COUNT(*) FROM rooms WHERE owner_id = :ownerId")
    int countByOwnerId(@Bind("ownerId") int ownerId);

    @SqlQuery("""
            SELECT id, owner_id AS ownerId, category_id AS categoryId, name, description,
                   model_name AS modelName, password, state, score, users_count AS usersCount,
                   created_at AS createdAt, updated_at AS updatedAt
            FROM rooms WHERE state != 'invisible' ORDER BY users_count DESC, score DESC LIMIT :limit
            """)
    List<RoomEntity> findPopular(@Bind("limit") int limit);

    @SqlQuery("""
            SELECT id, owner_id AS ownerId, category_id AS categoryId, name, description,
                   model_name AS modelName, password, state, score, users_count AS usersCount,
                   created_at AS createdAt, updated_at AS updatedAt
            FROM rooms WHERE name LIKE :query AND state != 'invisible' LIMIT :limit
            """)
    List<RoomEntity> searchByName(@Bind("query") String query, @Bind("limit") int limit);

    @SqlUpdate("UPDATE rooms SET users_count = :count WHERE id = :roomId")
    int updateUsersCount(@Bind("roomId") int roomId, @Bind("count") int count);

    @SqlUpdate("UPDATE rooms SET score = score + 1 WHERE id = :roomId")
    int incrementScore(@Bind("roomId") int roomId);

    @SqlUpdate("UPDATE rooms SET name = :name, description = :description WHERE id = :roomId")
    int updateInfo(@Bind("roomId") int roomId, @Bind("name") String name, @Bind("description") String description);

    @SqlUpdate("UPDATE rooms SET state = :state, password = :password WHERE id = :roomId")
    int updateAccess(@Bind("roomId") int roomId, @Bind("state") String state, @Bind("password") String password);

    @SqlUpdate("DELETE FROM rooms WHERE id = :roomId")
    int delete(@Bind("roomId") int roomId);
}
