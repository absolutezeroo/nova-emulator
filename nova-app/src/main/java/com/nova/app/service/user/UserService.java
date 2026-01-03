package com.nova.app.service.user;

import com.google.inject.Inject;
import com.nova.core.domain.api.user.result.AuthenticationResult;
import com.nova.core.domain.api.user.result.AuthenticationResult.Failure;
import com.nova.core.domain.api.user.result.AuthenticationResult.FailureReason;
import com.nova.core.domain.api.user.result.AuthenticationResult.Success;
import com.nova.core.domain.model.User;
import com.nova.core.domain.model.UserId;
import com.nova.core.domain.api.user.UserUseCase;
import com.nova.core.domain.repository.SessionRepository;
import com.nova.core.domain.repository.UserRepository;
import com.nova.core.exception.UserNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * Application Service implementing UserUseCase.
 * <p>
 * Orchestrates domain logic by coordinating between
 * domain entities and output ports (repositories).
 */
public class UserService implements UserUseCase {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;
    private final SessionRepository sessionRepository;

    @Inject
    public UserService(UserRepository userRepository, SessionRepository sessionRepository) {
        this.userRepository = userRepository;
        this.sessionRepository = sessionRepository;
    }

    @Override
    public AuthenticationResult authenticateBySsoTicket(String ssoTicket) {
        LOGGER.debug("Authenticating user with SSO ticket");

        if (ssoTicket == null || ssoTicket.isBlank()) {
            LOGGER.warn("Authentication failed: SSO ticket is null or blank");
            return new Failure(FailureReason.INVALID_TICKET);
        }

        Optional<User> userOpt = userRepository.findBySsoTicket(ssoTicket);

        if (userOpt.isEmpty()) {
            LOGGER.warn("Authentication failed: invalid SSO ticket");
            return new Failure(FailureReason.INVALID_TICKET);
        }

        User user = userOpt.get();

        // Invalidate ticket for security (single use)
        userRepository.invalidateSsoTicket(ssoTicket);

        // Register in session repository
        sessionRepository.register(user);

        // Mark user as online
        user.markOnline();

        LOGGER.info("User {} authenticated successfully", user.getUsername());
        return new Success(user);
    }

    @Override
    public Optional<User> findById(UserId userId) {
        // Check if the user is online first (faster)
        Optional<User> online = sessionRepository.findOnline(userId);

        if (online.isPresent()) {
            return online;
        }

        // Otherwise, fetch from a database
        return userRepository.findById(userId);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void updateMotto(UserId userId, String newMotto) {
        User user = findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));

        user.updateMotto(newMotto);
        userRepository.save(user);

        LOGGER.debug("Updated motto for user {}", userId);
    }

    @Override
    public void updateFigure(UserId userId, String newFigure) {
        User user = findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));

        user.updateFigure(newFigure);
        userRepository.save(user);

        LOGGER.debug("Updated figure for user {}", userId);
    }

    @Override
    public void addCredits(UserId userId, int amount) {
        User user = findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));

        user.addCredits(amount);
        userRepository.save(user);

        LOGGER.debug("Added {} credits to user {}", amount, userId);
    }
}
