package com.nova.core.domain.model.social.messenger;

import com.nova.core.domain.model.core.user.UserId;

import java.time.Instant;
import java.util.Objects;

/**
 * Domain entity representing a pending friend request.
 * <p>
 * Corresponds to 'messenger_requests' table.
 */
public record FriendRequest(
        UserId fromUserId,
        UserId toUserId,
        Instant createdAt
) {
    public FriendRequest {
        Objects.requireNonNull(fromUserId, "From user ID cannot be null");
        Objects.requireNonNull(toUserId, "To user ID cannot be null");
        if (fromUserId.equals(toUserId)) {
            throw new IllegalArgumentException("Cannot send friend request to self");
        }
        createdAt = createdAt != null ? createdAt : Instant.now();
    }

    public static FriendRequest create(UserId from, UserId to) {
        return new FriendRequest(from, to, Instant.now());
    }

    public boolean isFrom(UserId userId) {
        return fromUserId.equals(userId);
    }

    public boolean isTo(UserId userId) {
        return toUserId.equals(userId);
    }

    public boolean involves(UserId userId) {
        return isFrom(userId) || isTo(userId);
    }
}
