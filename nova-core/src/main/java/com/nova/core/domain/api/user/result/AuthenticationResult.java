package com.nova.core.domain.api.user.result;

import com.nova.core.domain.model.User;

import java.util.Optional;

/**
 * Result of an authentication attempt.
 * <p>
 * Uses a sealed interface with pattern matching support for clean handling
 * of success/failure cases without exceptions for control flow.
 */
public sealed interface AuthenticationResult {

    /**
     * Successful authentication.
     *
     * @param user the authenticated user
     */
    record Success(User user) implements AuthenticationResult {}

    /**
     * Failed authentication with reason.
     *
     * @param reason the failure reason
     */
    record Failure(FailureReason reason) implements AuthenticationResult {}

    /**
     * Possible authentication failure reasons.
     */
    enum FailureReason {
        INVALID_TICKET,
        TICKET_EXPIRED,
        USER_BANNED,
        USER_NOT_FOUND
    }

    /**
     * Convenience method to check if authentication succeeded.
     */
    default boolean isSuccess() {
        return this instanceof Success;
    }

    /**
     * Convenience method to get the user if successful.
     */
    default Optional<User> getUser() {
        return this instanceof Success(User user) ? Optional.of(user) : Optional.empty();
    }
}
