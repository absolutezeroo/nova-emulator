package com.nova.core.domain.model.social.group;

import com.nova.core.domain.model.core.user.UserId;

import java.time.Instant;
import java.util.Objects;

/**
 * Value Object representing a group membership.
 */
public record GroupMember(
        GroupId groupId,
        UserId userId,
        GroupMemberRank rank,
        Instant joinedAt
) {
    public GroupMember {
        Objects.requireNonNull(groupId, "Group ID cannot be null");
        Objects.requireNonNull(userId, "User ID cannot be null");
        rank = rank != null ? rank : GroupMemberRank.MEMBER;
        joinedAt = joinedAt != null ? joinedAt : Instant.now();
    }

    public static GroupMember create(GroupId groupId, UserId userId, GroupMemberRank rank) {
        return new GroupMember(groupId, userId, rank, Instant.now());
    }

    public static GroupMember pending(GroupId groupId, UserId userId) {
        return new GroupMember(groupId, userId, GroupMemberRank.PENDING, Instant.now());
    }

    public GroupMember promote() {
        if (rank == GroupMemberRank.MEMBER) {
            return new GroupMember(groupId, userId, GroupMemberRank.ADMIN, joinedAt);
        }
        return this;
    }

    public GroupMember demote() {
        if (rank == GroupMemberRank.ADMIN) {
            return new GroupMember(groupId, userId, GroupMemberRank.MEMBER, joinedAt);
        }
        return this;
    }

    public GroupMember accept() {
        if (rank == GroupMemberRank.PENDING) {
            return new GroupMember(groupId, userId, GroupMemberRank.MEMBER, Instant.now());
        }
        return this;
    }

    public boolean isPending() { return rank == GroupMemberRank.PENDING; }
    public boolean isMember() { return rank.isAtLeast(GroupMemberRank.MEMBER); }
    public boolean isAdmin() { return rank.isAdmin(); }
    public boolean isOwner() { return rank.isOwner(); }
}
