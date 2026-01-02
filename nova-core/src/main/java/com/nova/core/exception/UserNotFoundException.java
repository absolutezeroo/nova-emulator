package com.nova.core.exception;

import com.nova.core.domain.model.UserId;

/**
 * Thrown when a requested user cannot be found.
 */
public class UserNotFoundException extends DomainException {

    public UserNotFoundException(UserId userId) {
        super("User not found with ID: " + userId);
    }

    public UserNotFoundException(String username) {
        super("User not found with username: " + username);
    }
}
