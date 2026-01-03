package com.nova.core.domain.repository;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.social.messenger.FriendRequest;
import com.nova.core.domain.model.social.messenger.Friendship;
import com.nova.core.domain.model.social.messenger.MessengerMessage;

import java.util.List;
import java.util.Optional;

/**
 * Output Port (Secondary/Driven Port) - Repository interface.
 * <p>
 * Defines persistence operations for Messenger (friends and messages).
 * Implemented by infrastructure adapters (MySQL repository).
 */
public interface MessengerRepository {

    // ============== Friendship Operations ==============

    /**
     * Finds a friendship between two users.
     *
     * @param userOne First user ID
     * @param userTwo Second user ID
     * @return The friendship if exists
     */
    Optional<Friendship> findFriendship(UserId userOne, UserId userTwo);

    /**
     * Gets all friends of a user.
     *
     * @param userId The user ID
     * @return List of friendships
     */
    List<Friendship> findFriendsByUserId(UserId userId);

    /**
     * Counts friends of a user.
     *
     * @param userId The user ID
     * @return Number of friends
     */
    int countFriends(UserId userId);

    /**
     * Checks if two users are friends.
     *
     * @param userOne First user ID
     * @param userTwo Second user ID
     * @return true if friends
     */
    boolean areFriends(UserId userOne, UserId userTwo);

    /**
     * Creates a new friendship.
     *
     * @param friendship The friendship to create
     * @return The created friendship
     */
    Friendship saveFriendship(Friendship friendship);

    /**
     * Deletes a friendship.
     *
     * @param userOne First user ID
     * @param userTwo Second user ID
     * @return true if deleted
     */
    boolean deleteFriendship(UserId userOne, UserId userTwo);

    // ============== Friend Request Operations ==============

    /**
     * Gets pending friend requests for a user.
     *
     * @param userId The user ID receiving the requests
     * @return List of pending requests
     */
    List<FriendRequest> findPendingRequests(UserId userId);

    /**
     * Gets friend request sent by a user.
     *
     * @param userId The user ID who sent the requests
     * @return List of sent requests
     */
    List<FriendRequest> findSentRequests(UserId userId);

    /**
     * Finds a specific friend request.
     *
     * @param fromUserId Sender user ID
     * @param toUserId Receiver user ID
     * @return The request if exists
     */
    Optional<FriendRequest> findRequest(UserId fromUserId, UserId toUserId);

    /**
     * Creates a friend request.
     *
     * @param request The request to create
     * @return The created request
     */
    FriendRequest saveRequest(FriendRequest request);

    /**
     * Deletes a friend request.
     *
     * @param fromUserId Sender user ID
     * @param toUserId Receiver user ID
     * @return true if deleted
     */
    boolean deleteRequest(UserId fromUserId, UserId toUserId);

    // ============== Message Operations ==============

    /**
     * Gets offline messages for a user.
     *
     * @param userId The user ID
     * @return List of unread messages
     */
    List<MessengerMessage> findOfflineMessages(UserId userId);

    /**
     * Saves a message.
     *
     * @param message The message to save
     * @return The saved message
     */
    MessengerMessage saveMessage(MessengerMessage message);

    /**
     * Marks messages as read.
     *
     * @param userId The user who read the messages
     */
    void markMessagesAsRead(UserId userId);
}
