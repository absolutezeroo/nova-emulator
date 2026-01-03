package com.nova.core.domain.repository;

import com.nova.core.domain.model.User;
import com.nova.core.domain.model.UserId;

import java.util.Optional;

/**
 * Output Port (Secondary/Driven Port) - Repository interface.
 *
 * Defines persistence operations for Users.
 * Implemented by infrastructure adapters (MySQL repository).
 */
public interface UserRepository {

    /**
     * Finds a user by their SSO ticket.
     *
     * @param ssoTicket The SSO authentication ticket
     * @return The user if found and ticket is valid
     */
    Optional<User> findBySsoTicket(String ssoTicket);

    /**
     * Finds a user by their ID.
     *
     * @param userId The user's ID
     * @return The user if found
     */
    Optional<User> findById(UserId userId);

    /**
     * Finds a user by their username.
     *
     * @param username The username
     * @return The user if found
     */
    Optional<User> findByUsername(String username);

    /**
     * Saves a user (insert or update).
     *
     * @param user The user to save
     * @return The saved user
     */
    User save(User user);

    /**
     * Clears an SSO ticket after use (for security).
     *
     * @param ssoTicket The ticket to invalidate
     */
    void invalidateSsoTicket(String ssoTicket);
}
