package com.nova.infra.adapter.database.dao.user;

import com.nova.infra.adapter.database.entity.user.UserDataEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.time.Instant;
import java.util.Optional;

/**
 * Jdbi DAO for 'user_data' table (profile/mutable data).
 */
@RegisterConstructorMapper(UserDataEntity.class)
public interface UserDataDao {

    @SqlQuery("""
            SELECT user_id AS userId, motto, figure, gender,
                   home_room_id AS homeRoomId,
                   respect_received AS respectReceived,
                   respect_given AS respectGiven,
                   daily_respect_points AS dailyRespectPoints,
                   daily_pet_respect AS dailyPetRespect,
                   achievement_score AS achievementScore,
                   online, last_login_at AS lastLoginAt,
                   last_online_at AS lastOnlineAt,
                   ip_register AS ipRegister, ip_current AS ipCurrent,
                   machine_id AS machineId
            FROM user_data WHERE user_id = :userId
            """)
    Optional<UserDataEntity> findByUserId(@Bind("userId") int userId);

    @SqlQuery("SELECT COUNT(*) FROM user_data WHERE online = TRUE")
    int countOnlineUsers();

    @SqlUpdate("""
            INSERT INTO user_data (user_id, motto, figure, gender)
            VALUES (:userId, :motto, :figure, :gender)
            """)
    int insert(@Bind("userId") int userId, @Bind("motto") String motto,
               @Bind("figure") String figure, @Bind("gender") String gender);

    @SqlUpdate("UPDATE user_data SET motto = :motto, figure = :figure WHERE user_id = :userId")
    int updateProfile(@Bind("userId") int userId, @Bind("motto") String motto, @Bind("figure") String figure);

    @SqlUpdate("UPDATE user_data SET online = :online, last_online_at = :lastOnlineAt WHERE user_id = :userId")
    int updateOnlineStatus(@Bind("userId") int userId, @Bind("online") boolean online, @Bind("lastOnlineAt") Instant lastOnlineAt);

    @SqlUpdate("""
            UPDATE user_data SET last_login_at = :lastLoginAt, ip_current = :ipCurrent, machine_id = :machineId
            WHERE user_id = :userId
            """)
    int updateLoginInfo(@Bind("userId") int userId, @Bind("lastLoginAt") Instant lastLoginAt,
                        @Bind("ipCurrent") String ipCurrent, @Bind("machineId") String machineId);

    @SqlUpdate("UPDATE user_data SET home_room_id = :roomId WHERE user_id = :userId")
    int updateHomeRoom(@Bind("userId") int userId, @Bind("roomId") Integer roomId);

    @SqlUpdate("UPDATE user_data SET respect_received = respect_received + :amount WHERE user_id = :userId")
    int addRespect(@Bind("userId") int userId, @Bind("amount") int amount);

    @SqlUpdate("UPDATE user_data SET achievement_score = achievement_score + :score WHERE user_id = :userId")
    int addAchievementScore(@Bind("userId") int userId, @Bind("score") int score);
}
