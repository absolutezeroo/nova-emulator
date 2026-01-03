package com.nova.infra.adapter.out.persistence.dao.user;

import com.nova.infra.adapter.out.persistence.entity.user.UserFavoriteRoomEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

/**
 * Jdbi DAO for 'user_favorite_rooms' table.
 */
@RegisterConstructorMapper(UserFavoriteRoomEntity.class)
public interface UserFavoriteRoomDao {

    @SqlQuery("""
            SELECT user_id AS userId, room_id AS roomId, created_at AS createdAt
            FROM user_favorite_rooms WHERE user_id = :userId
            """)
    List<UserFavoriteRoomEntity> findByUserId(@Bind("userId") int userId);

    @SqlQuery("SELECT COUNT(*) FROM user_favorite_rooms WHERE user_id = :userId")
    int countByUserId(@Bind("userId") int userId);

    @SqlQuery("SELECT EXISTS(SELECT 1 FROM user_favorite_rooms WHERE user_id = :userId AND room_id = :roomId)")
    boolean isFavorite(@Bind("userId") int userId, @Bind("roomId") int roomId);

    @SqlUpdate("INSERT IGNORE INTO user_favorite_rooms (user_id, room_id) VALUES (:userId, :roomId)")
    int addFavorite(@Bind("userId") int userId, @Bind("roomId") int roomId);

    @SqlUpdate("DELETE FROM user_favorite_rooms WHERE user_id = :userId AND room_id = :roomId")
    int removeFavorite(@Bind("userId") int userId, @Bind("roomId") int roomId);
}
