package com.nova.infra.adapter.database.dao.moderation;

import com.nova.infra.adapter.database.entity.moderation.BanEntity;
import com.nova.infra.adapter.database.entity.moderation.ChatLogEntity;
import com.nova.infra.adapter.database.entity.moderation.ModLogEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.Optional;

/**
 * Jdbi DAO for 'bans', 'moderation_logs', and 'chat_logs' tables.
 */
public interface ModerationDao {

    // ==================== BANS ====================

    @SqlQuery("""
            SELECT id, user_id AS userId, ip_address AS ipAddress, machine_id AS machineId,
                   ban_type AS banType, reason, banned_by_id AS bannedById,
                   created_at AS createdAt, expires_at AS expiresAt
            FROM bans WHERE id = :id
            """)
    @RegisterConstructorMapper(BanEntity.class)
    Optional<BanEntity> findBanById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, user_id AS userId, ip_address AS ipAddress, machine_id AS machineId,
                   ban_type AS banType, reason, banned_by_id AS bannedById,
                   created_at AS createdAt, expires_at AS expiresAt
            FROM bans WHERE user_id = :userId AND (expires_at IS NULL OR expires_at > NOW())
            ORDER BY created_at DESC LIMIT 1
            """)
    @RegisterConstructorMapper(BanEntity.class)
    Optional<BanEntity> findActiveBanByUserId(@Bind("userId") int userId);

    @SqlQuery("""
            SELECT id, user_id AS userId, ip_address AS ipAddress, machine_id AS machineId,
                   ban_type AS banType, reason, banned_by_id AS bannedById,
                   created_at AS createdAt, expires_at AS expiresAt
            FROM bans WHERE ip_address = :ipAddress AND (expires_at IS NULL OR expires_at > NOW())
            ORDER BY created_at DESC LIMIT 1
            """)
    @RegisterConstructorMapper(BanEntity.class)
    Optional<BanEntity> findActiveBanByIp(@Bind("ipAddress") String ipAddress);

    @SqlQuery("""
            SELECT id, user_id AS userId, ip_address AS ipAddress, machine_id AS machineId,
                   ban_type AS banType, reason, banned_by_id AS bannedById,
                   created_at AS createdAt, expires_at AS expiresAt
            FROM bans WHERE machine_id = :machineId AND (expires_at IS NULL OR expires_at > NOW())
            ORDER BY created_at DESC LIMIT 1
            """)
    @RegisterConstructorMapper(BanEntity.class)
    Optional<BanEntity> findActiveBanByMachineId(@Bind("machineId") String machineId);

    @SqlQuery("""
            SELECT id, user_id AS userId, ip_address AS ipAddress, machine_id AS machineId,
                   ban_type AS banType, reason, banned_by_id AS bannedById,
                   created_at AS createdAt, expires_at AS expiresAt
            FROM bans ORDER BY created_at DESC LIMIT :limit
            """)
    @RegisterConstructorMapper(BanEntity.class)
    List<BanEntity> findRecentBans(@Bind("limit") int limit);

    @SqlUpdate("""
            INSERT INTO bans (user_id, ip_address, machine_id, ban_type, reason, banned_by_id, expires_at)
            VALUES (:userId, :ipAddress, :machineId, :banType, :reason, :bannedById, :expiresAt)
            """)
    @GetGeneratedKeys
    int createBan(@Bind("userId") Integer userId, @Bind("ipAddress") String ipAddress,
                  @Bind("machineId") String machineId, @Bind("banType") String banType,
                  @Bind("reason") String reason, @Bind("bannedById") int bannedById,
                  @Bind("expiresAt") java.time.LocalDateTime expiresAt);

    @SqlUpdate("DELETE FROM bans WHERE id = :id")
    int deleteBan(@Bind("id") int id);

    @SqlUpdate("DELETE FROM bans WHERE user_id = :userId")
    int deleteBansByUserId(@Bind("userId") int userId);

    // ==================== MOD LOGS ====================

    @SqlQuery("""
            SELECT id, mod_id AS modId, target_user_id AS targetUserId, action, description,
                   created_at AS createdAt
            FROM moderation_logs WHERE id = :id
            """)
    @RegisterConstructorMapper(ModLogEntity.class)
    Optional<ModLogEntity> findModLogById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, mod_id AS modId, target_user_id AS targetUserId, action, description,
                   created_at AS createdAt
            FROM moderation_logs WHERE mod_id = :modId ORDER BY created_at DESC LIMIT :limit
            """)
    @RegisterConstructorMapper(ModLogEntity.class)
    List<ModLogEntity> findModLogsByModId(@Bind("modId") int modId, @Bind("limit") int limit);

    @SqlQuery("""
            SELECT id, mod_id AS modId, target_user_id AS targetUserId, action, description,
                   created_at AS createdAt
            FROM moderation_logs WHERE target_user_id = :targetUserId ORDER BY created_at DESC LIMIT :limit
            """)
    @RegisterConstructorMapper(ModLogEntity.class)
    List<ModLogEntity> findModLogsByTargetUserId(@Bind("targetUserId") int targetUserId, @Bind("limit") int limit);

    @SqlQuery("""
            SELECT id, mod_id AS modId, target_user_id AS targetUserId, action, description,
                   created_at AS createdAt
            FROM moderation_logs ORDER BY created_at DESC LIMIT :limit
            """)
    @RegisterConstructorMapper(ModLogEntity.class)
    List<ModLogEntity> findRecentModLogs(@Bind("limit") int limit);

    @SqlUpdate("""
            INSERT INTO moderation_logs (mod_id, target_user_id, action, description)
            VALUES (:modId, :targetUserId, :action, :description)
            """)
    @GetGeneratedKeys
    int createModLog(@Bind("modId") int modId, @Bind("targetUserId") Integer targetUserId,
                     @Bind("action") String action, @Bind("description") String description);

    // ==================== CHAT LOGS ====================

    @SqlQuery("""
            SELECT id, user_id AS userId, room_id AS roomId, message, created_at AS createdAt
            FROM chat_logs WHERE room_id = :roomId ORDER BY created_at DESC LIMIT :limit
            """)
    @RegisterConstructorMapper(ChatLogEntity.class)
    List<ChatLogEntity> findChatLogsByRoomId(@Bind("roomId") int roomId, @Bind("limit") int limit);

    @SqlQuery("""
            SELECT id, user_id AS userId, room_id AS roomId, message, created_at AS createdAt
            FROM chat_logs WHERE user_id = :userId ORDER BY created_at DESC LIMIT :limit
            """)
    @RegisterConstructorMapper(ChatLogEntity.class)
    List<ChatLogEntity> findChatLogsByUserId(@Bind("userId") int userId, @Bind("limit") int limit);

    @SqlUpdate("INSERT INTO chat_logs (user_id, room_id, message) VALUES (:userId, :roomId, :message)")
    @GetGeneratedKeys
    int createChatLog(@Bind("userId") int userId, @Bind("roomId") int roomId, @Bind("message") String message);

    @SqlUpdate("DELETE FROM chat_logs WHERE created_at < DATE_SUB(NOW(), INTERVAL :days DAY)")
    int deleteOldChatLogs(@Bind("days") int days);
}
