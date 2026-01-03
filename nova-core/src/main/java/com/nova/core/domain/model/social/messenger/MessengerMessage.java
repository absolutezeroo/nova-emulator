package com.nova.core.domain.model.social.messenger;

import com.nova.core.domain.model.core.user.UserId;

import java.time.Instant;
import java.util.Objects;

/**
 * Domain entity representing a private message.
 * <p>
 * Corresponds to 'messenger_messages' table.
 */
public record MessengerMessage(
        int id,
        UserId fromUserId,
        UserId toUserId,
        String message,
        Instant sentAt,
        boolean read
) {
    public MessengerMessage {
        Objects.requireNonNull(fromUserId, "From user ID cannot be null");
        Objects.requireNonNull(toUserId, "To user ID cannot be null");
        message = message != null ? message : "";
        sentAt = sentAt != null ? sentAt : Instant.now();
    }

    public static MessengerMessage create(UserId from, UserId to, String message) {
        return new MessengerMessage(0, from, to, message, Instant.now(), false);
    }

    public MessengerMessage markAsRead() {
        return new MessengerMessage(id, fromUserId, toUserId, message, sentAt, true);
    }

    public boolean isFrom(UserId userId) {
        return fromUserId.equals(userId);
    }

    public boolean isTo(UserId userId) {
        return toUserId.equals(userId);
    }
}
