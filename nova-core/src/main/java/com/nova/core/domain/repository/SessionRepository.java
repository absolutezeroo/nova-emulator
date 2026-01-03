package com.nova.core.domain.repository;

import com.nova.core.domain.model.User;
import com.nova.core.domain.model.UserId;

import java.util.Collection;
import java.util.Optional;

/**
 * Output Port - Session/Online User management.
 *
 * Manages currently connected users (in-memory).
 * Implemented by infrastructure adapters.
 */
public interface SessionRepository {

    /**
     * Registers a user as online (session ID will be assigned later).
     *
     * @param user The user to register
     */
    void register(User user);

    /**
     * Registers a user as online with a specific session ID.
     *
     * @param user The user to register
     * @param sessionId The network session ID
     */
    void register(User user, String sessionId);

    /**
     * Unregisters a user (disconnect).
     *
     * @param userId The user's ID
     */
    void unregister(UserId userId);

    /**
     * Finds an online user by ID.
     *
     * @param userId The user's ID
     * @return The user if online
     */
    Optional<User> findOnline(UserId userId);

    /**
     * Finds an online user by their session ID.
     *
     * @param sessionId The network session ID
     * @return The user if found
     */
    Optional<User> findBySessionId(String sessionId);

    /**
     * Gets all currently online users.
     *
     * @return Collection of online users
     */
    Collection<User> getOnlineUsers();

    /**
     * Gets the count of online users.
     *
     * @return Number of online users
     */
    int getOnlineCount();

    /**
     * Checks if a user is online.
     *
     * @param userId The user's ID
     * @return true if online
     */
    boolean isOnline(UserId userId);
}
