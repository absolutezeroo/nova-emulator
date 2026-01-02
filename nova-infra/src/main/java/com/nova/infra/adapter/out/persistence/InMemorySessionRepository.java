package com.nova.infra.adapter.out.persistence;

import com.nova.core.domain.model.User;
import com.nova.core.domain.model.UserId;
import com.nova.core.domain.port.out.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * In-memory implementation of SessionRepository.
 * Manages currently connected users.
 */
public class InMemorySessionRepository implements SessionRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(InMemorySessionRepository.class);

    private final Map<UserId, User> onlineUsers = new ConcurrentHashMap<>();
    private final Map<String, UserId> sessionToUser = new ConcurrentHashMap<>();
    private final Map<UserId, String> userToSession = new ConcurrentHashMap<>();

    @Override
    public void register(User user, String sessionId) {
        onlineUsers.put(user.getId(), user);
        sessionToUser.put(sessionId, user.getId());
        userToSession.put(user.getId(), sessionId);

        LOGGER.info("User {} registered with session {}", user.getUsername(), sessionId);
    }

    @Override
    public void unregister(UserId userId) {
        User removed = onlineUsers.remove(userId);
        String sessionId = userToSession.remove(userId);

        if (sessionId != null) {
            sessionToUser.remove(sessionId);
        }

        if (removed != null) {
            LOGGER.info("User {} unregistered", removed.getUsername());
        }
    }

    @Override
    public Optional<User> findOnline(UserId userId) {
        return Optional.ofNullable(onlineUsers.get(userId));
    }

    @Override
    public Optional<User> findBySessionId(String sessionId) {
        UserId userId = sessionToUser.get(sessionId);
        return userId != null ? Optional.ofNullable(onlineUsers.get(userId)) : Optional.empty();
    }

    @Override
    public Collection<User> getOnlineUsers() {
        return onlineUsers.values();
    }

    @Override
    public int getOnlineCount() {
        return onlineUsers.size();
    }

    @Override
    public boolean isOnline(UserId userId) {
        return onlineUsers.containsKey(userId);
    }
}
