package com.nova.core.domain.port.in;

import com.nova.core.application.command.AuthenticateCommand;
import com.nova.core.application.result.AuthenticationResult;
import com.nova.core.domain.model.User;
import com.nova.core.domain.model.UserId;

import java.util.Optional;

/**
 * Input Port (Primary/Driving Port) - Use Case interface.
 * <p>
 * Defines what the application can do with Users.
 * Implemented by application services, called by inbound adapters (network handlers).
 */
public interface UserUseCase {

    /**
     * Authenticates a user using a command object.
     * <p>
     * This is the preferred method for authentication, using the Command Pattern
     * to decouple infrastructure concerns from domain logic.
     *
     * @param command the authentication command containing the SSO ticket
     * @return the authentication result (success with user, or failure with reason)
     */
    AuthenticationResult authenticate(AuthenticateCommand command);

    /**
     * Authenticates a user and returns their profile.
     *
     * @param ssoTicket The SSO ticket for authentication
     * @return The authenticated user, or empty if authentication failed
     * @deprecated Use {@link #authenticate(AuthenticateCommand)} instead
     */
    @Deprecated(forRemoval = true)
    Optional<User> authenticate(String ssoTicket);

    /**
     * Finds a user by their ID.
     *
     * @param userId The user's ID
     * @return The user, or empty if not found
     */
    Optional<User> findById(UserId userId);

    /**
     * Finds a user by their username.
     *
     * @param username The username to search for
     * @return The user, or empty if not found
     */
    Optional<User> findByUsername(String username);

    /**
     * Updates a user's motto.
     *
     * @param userId The user's ID
     * @param newMotto The new motto
     */
    void updateMotto(UserId userId, String newMotto);

    /**
     * Updates a user's figure/look.
     *
     * @param userId The user's ID
     * @param newFigure The new figure string
     */
    void updateFigure(UserId userId, String newFigure);

    /**
     * Adds credits to a user's account.
     *
     * @param userId The user's ID
     * @param amount The amount to add
     */
    void addCredits(UserId userId, int amount);
}
