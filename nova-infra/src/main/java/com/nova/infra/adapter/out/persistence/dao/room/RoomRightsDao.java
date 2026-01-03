package com.nova.infra.adapter.out.persistence.dao.room;

import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

/**
 * Jdbi DAO for 'room_rights', 'room_bans', 'room_mutes' tables.
 */
public interface RoomRightsDao {

    // ==================== RIGHTS ====================

    @SqlQuery("SELECT user_id FROM room_rights WHERE room_id = :roomId")
    List<Integer> findUsersWithRights(@Bind("roomId") int roomId);

    @SqlQuery("SELECT EXISTS(SELECT 1 FROM room_rights WHERE room_id = :roomId AND user_id = :userId)")
    boolean hasRights(@Bind("roomId") int roomId, @Bind("userId") int userId);

    @SqlUpdate("INSERT IGNORE INTO room_rights (room_id, user_id) VALUES (:roomId, :userId)")
    int grantRights(@Bind("roomId") int roomId, @Bind("userId") int userId);

    @SqlUpdate("DELETE FROM room_rights WHERE room_id = :roomId AND user_id = :userId")
    int revokeRights(@Bind("roomId") int roomId, @Bind("userId") int userId);

    @SqlUpdate("DELETE FROM room_rights WHERE room_id = :roomId")
    int revokeAllRights(@Bind("roomId") int roomId);

    // ==================== BANS ====================

    @SqlQuery("SELECT user_id FROM room_bans WHERE room_id = :roomId AND expires_at > NOW()")
    List<Integer> findBannedUsers(@Bind("roomId") int roomId);

    @SqlQuery("SELECT EXISTS(SELECT 1 FROM room_bans WHERE room_id = :roomId AND user_id = :userId AND expires_at > NOW())")
    boolean isBanned(@Bind("roomId") int roomId, @Bind("userId") int userId);

    @SqlUpdate("""
            INSERT INTO room_bans (room_id, user_id, banned_by_id, expires_at)
            VALUES (:roomId, :userId, :bannedById, DATE_ADD(NOW(), INTERVAL :minutes MINUTE))
            ON DUPLICATE KEY UPDATE expires_at = DATE_ADD(NOW(), INTERVAL :minutes MINUTE), banned_by_id = :bannedById
            """)
    int banUser(@Bind("roomId") int roomId, @Bind("userId") int userId,
                @Bind("bannedById") int bannedById, @Bind("minutes") int minutes);

    @SqlUpdate("DELETE FROM room_bans WHERE room_id = :roomId AND user_id = :userId")
    int unbanUser(@Bind("roomId") int roomId, @Bind("userId") int userId);

    // ==================== MUTES ====================

    @SqlQuery("SELECT EXISTS(SELECT 1 FROM room_mutes WHERE room_id = :roomId AND user_id = :userId AND expires_at > NOW())")
    boolean isMuted(@Bind("roomId") int roomId, @Bind("userId") int userId);

    @SqlUpdate("""
            INSERT INTO room_mutes (room_id, user_id, muted_by_id, expires_at)
            VALUES (:roomId, :userId, :mutedById, DATE_ADD(NOW(), INTERVAL :minutes MINUTE))
            ON DUPLICATE KEY UPDATE expires_at = DATE_ADD(NOW(), INTERVAL :minutes MINUTE), muted_by_id = :mutedById
            """)
    int muteUser(@Bind("roomId") int roomId, @Bind("userId") int userId,
                 @Bind("mutedById") int mutedById, @Bind("minutes") int minutes);

    @SqlUpdate("DELETE FROM room_mutes WHERE room_id = :roomId AND user_id = :userId")
    int unmuteUser(@Bind("roomId") int roomId, @Bind("userId") int userId);
}
