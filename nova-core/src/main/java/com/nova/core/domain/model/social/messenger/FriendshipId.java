package com.nova.core.domain.model.social.messenger;

import com.nova.core.domain.model.core.user.UserId;

import java.util.Objects;

/**
 * Value Object representing a Friendship's unique identifier.
 * A friendship is identified by the pair of user IDs (order-independent).
 */
public record FriendshipId(UserId userOne, UserId userTwo) {

    public FriendshipId {
        Objects.requireNonNull(userOne, "User one cannot be null");
        Objects.requireNonNull(userTwo, "User two cannot be null");
        // Normalize order so (1,2) == (2,1)
        if (userOne.value() > userTwo.value()) {
            UserId temp = userOne;
            userOne = userTwo;
            userTwo = temp;
        }
    }

    public static FriendshipId of(UserId userOne, UserId userTwo) {
        return new FriendshipId(userOne, userTwo);
    }

    public static FriendshipId of(int userOneId, int userTwoId) {
        return new FriendshipId(UserId.of(userOneId), UserId.of(userTwoId));
    }

    public boolean involves(UserId userId) {
        return userOne.equals(userId) || userTwo.equals(userId);
    }

    public UserId getOther(UserId userId) {
        if (userOne.equals(userId)) return userTwo;
        if (userTwo.equals(userId)) return userOne;
        throw new IllegalArgumentException("User is not part of this friendship");
    }
}
