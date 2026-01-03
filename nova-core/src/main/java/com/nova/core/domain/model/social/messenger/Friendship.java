package com.nova.core.domain.model.social.messenger;

import com.nova.core.domain.model.core.user.UserId;

import java.time.Instant;
import java.util.Objects;

/**
 * Domain entity representing a friendship between two users.
 * <p>
 * Corresponds to 'messenger_friendships' table.
 */
public class Friendship {
    private final FriendshipId id;
    private final Instant createdAt;
    private MessengerRelation relationUserOne;
    private MessengerRelation relationUserTwo;

    public Friendship(FriendshipId id, Instant createdAt,
                      MessengerRelation relationUserOne, MessengerRelation relationUserTwo) {
        this.id = Objects.requireNonNull(id, "Friendship ID cannot be null");
        this.createdAt = createdAt != null ? createdAt : Instant.now();
        this.relationUserOne = relationUserOne != null ? relationUserOne : MessengerRelation.NONE;
        this.relationUserTwo = relationUserTwo != null ? relationUserTwo : MessengerRelation.NONE;
    }

    public static Friendship create(UserId userOne, UserId userTwo) {
        return new Friendship(
            FriendshipId.of(userOne, userTwo),
            Instant.now(),
            MessengerRelation.NONE,
            MessengerRelation.NONE
        );
    }

    // ============== Relations ==============

    public void setRelation(UserId userId, MessengerRelation relation) {
        if (id.userOne().equals(userId)) {
            this.relationUserOne = relation;
        } else if (id.userTwo().equals(userId)) {
            this.relationUserTwo = relation;
        }
    }

    public MessengerRelation getRelation(UserId userId) {
        if (id.userOne().equals(userId)) return relationUserOne;
        if (id.userTwo().equals(userId)) return relationUserTwo;
        return MessengerRelation.NONE;
    }

    public MessengerRelation getRelationFrom(UserId fromUser) {
        return getRelation(fromUser);
    }

    // ============== Utility ==============

    public boolean involves(UserId userId) {
        return id.involves(userId);
    }

    public UserId getOther(UserId userId) {
        return id.getOther(userId);
    }

    // ============== Getters ==============

    public FriendshipId getId() { return id; }
    public UserId getUserOne() { return id.userOne(); }
    public UserId getUserTwo() { return id.userTwo(); }
    public Instant getCreatedAt() { return createdAt; }
    public MessengerRelation getRelationUserOne() { return relationUserOne; }
    public MessengerRelation getRelationUserTwo() { return relationUserTwo; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friendship that = (Friendship) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Friendship{" + id.userOne() + " <-> " + id.userTwo() + "}";
    }
}
