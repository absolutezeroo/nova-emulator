package com.nova.infra.adapter.database.dao.messenger;

import com.nova.infra.adapter.database.entity.messenger.FriendRequestEntity;
import com.nova.infra.adapter.database.entity.messenger.FriendshipEntity;
import com.nova.infra.adapter.database.entity.messenger.MessengerMessageEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

/**
 * Jdbi DAO for messenger tables (friendships, requests, messages).
 */
public interface MessengerDao {

    // ==================== FRIENDSHIPS ====================

    @SqlQuery("""
            SELECT user_id AS userId, friend_id AS friendId, relation, created_at AS createdAt
            FROM messenger_friendships WHERE user_id = :userId
            """)
    @RegisterConstructorMapper(FriendshipEntity.class)
    List<FriendshipEntity> findFriendships(@Bind("userId") int userId);

    @SqlQuery("SELECT COUNT(*) FROM messenger_friendships WHERE user_id = :userId")
    int countFriends(@Bind("userId") int userId);

    @SqlQuery("SELECT EXISTS(SELECT 1 FROM messenger_friendships WHERE user_id = :userId AND friend_id = :friendId)")
    boolean areFriends(@Bind("userId") int userId, @Bind("friendId") int friendId);

    @SqlUpdate("INSERT IGNORE INTO messenger_friendships (user_id, friend_id) VALUES (:userId, :friendId)")
    int addFriendship(@Bind("userId") int userId, @Bind("friendId") int friendId);

    @SqlUpdate("DELETE FROM messenger_friendships WHERE user_id = :userId AND friend_id = :friendId")
    int removeFriendship(@Bind("userId") int userId, @Bind("friendId") int friendId);

    @SqlUpdate("UPDATE messenger_friendships SET relation = :relation WHERE user_id = :userId AND friend_id = :friendId")
    int updateRelation(@Bind("userId") int userId, @Bind("friendId") int friendId, @Bind("relation") int relation);

    // ==================== FRIEND REQUESTS ====================

    @SqlQuery("""
            SELECT id, sender_id AS senderId, receiver_id AS receiverId, created_at AS createdAt
            FROM messenger_requests WHERE receiver_id = :userId
            """)
    @RegisterConstructorMapper(FriendRequestEntity.class)
    List<FriendRequestEntity> findPendingRequests(@Bind("userId") int userId);

    @SqlQuery("SELECT EXISTS(SELECT 1 FROM messenger_requests WHERE sender_id = :senderId AND receiver_id = :receiverId)")
    boolean hasRequest(@Bind("senderId") int senderId, @Bind("receiverId") int receiverId);

    @SqlUpdate("INSERT IGNORE INTO messenger_requests (sender_id, receiver_id) VALUES (:senderId, :receiverId)")
    int createRequest(@Bind("senderId") int senderId, @Bind("receiverId") int receiverId);

    @SqlUpdate("DELETE FROM messenger_requests WHERE sender_id = :senderId AND receiver_id = :receiverId")
    int deleteRequest(@Bind("senderId") int senderId, @Bind("receiverId") int receiverId);

    @SqlUpdate("DELETE FROM messenger_requests WHERE receiver_id = :userId")
    int deleteAllRequestsFor(@Bind("userId") int userId);

    // ==================== OFFLINE MESSAGES ====================

    @SqlQuery("""
            SELECT id, sender_id AS senderId, receiver_id AS receiverId,
                   message, created_at AS createdAt, is_read AS isRead
            FROM messenger_messages WHERE receiver_id = :userId AND is_read = FALSE
            ORDER BY created_at
            """)
    @RegisterConstructorMapper(MessengerMessageEntity.class)
    List<MessengerMessageEntity> findUnreadMessages(@Bind("userId") int userId);

    @SqlUpdate("INSERT INTO messenger_messages (sender_id, receiver_id, message) VALUES (:senderId, :receiverId, :message)")
    int saveMessage(@Bind("senderId") int senderId, @Bind("receiverId") int receiverId, @Bind("message") String message);

    @SqlUpdate("UPDATE messenger_messages SET is_read = TRUE WHERE receiver_id = :userId")
    int markAllAsRead(@Bind("userId") int userId);

    @SqlUpdate("DELETE FROM messenger_messages WHERE receiver_id = :userId AND is_read = TRUE")
    int deleteReadMessages(@Bind("userId") int userId);
}
