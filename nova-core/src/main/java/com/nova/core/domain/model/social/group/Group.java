package com.nova.core.domain.model.social.group;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.room.RoomId;

import java.time.Instant;
import java.util.*;

/**
 * Domain entity representing a group (guild).
 * <p>
 * Corresponds to 'groups' table.
 */
public class Group {
    // Identity
    private final GroupId id;
    private final UserId ownerId;
    private final Instant createdAt;

    // Info
    private String name;
    private String description;
    private GroupBadge badge;
    private GroupType type;

    // Room association
    private RoomId baseRoomId;

    // Colors
    private int colorOne;
    private int colorTwo;

    // Settings
    private boolean membersFurniAccess;
    private boolean forumEnabled;

    // Members (managed collection)
    private final Map<UserId, GroupMember> members;

    public Group(GroupId id, UserId ownerId, String name, String description,
                 GroupBadge badge, GroupType type, RoomId baseRoomId,
                 int colorOne, int colorTwo, boolean membersFurniAccess,
                 boolean forumEnabled, Instant createdAt) {
        this.id = Objects.requireNonNull(id, "Group ID cannot be null");
        this.ownerId = Objects.requireNonNull(ownerId, "Owner ID cannot be null");
        this.name = Objects.requireNonNull(name, "Group name cannot be null");
        this.description = description != null ? description : "";
        this.badge = badge != null ? badge : GroupBadge.defaultBadge();
        this.type = type != null ? type : GroupType.OPEN;
        this.baseRoomId = baseRoomId;
        this.colorOne = colorOne;
        this.colorTwo = colorTwo;
        this.membersFurniAccess = membersFurniAccess;
        this.forumEnabled = forumEnabled;
        this.createdAt = createdAt != null ? createdAt : Instant.now();
        this.members = new HashMap<>();

        // Owner is always a member
        members.put(ownerId, GroupMember.create(id, ownerId, GroupMemberRank.OWNER));
    }

    public static Group create(int id, UserId ownerId, String name, RoomId baseRoomId) {
        return new Group(
            GroupId.of(id), ownerId, name, "",
            GroupBadge.defaultBadge(), GroupType.OPEN, baseRoomId,
            1, 1, true, true, Instant.now()
        );
    }

    // ============== Info Management ==============

    public void updateName(String newName) {
        if (newName == null || newName.isBlank()) {
            throw new IllegalArgumentException("Group name cannot be empty");
        }
        this.name = newName;
    }

    public void updateDescription(String newDescription) {
        this.description = newDescription != null ? newDescription : "";
    }

    public void updateBadge(GroupBadge newBadge) {
        this.badge = newBadge != null ? newBadge : GroupBadge.defaultBadge();
    }

    public void updateType(GroupType newType) {
        this.type = newType != null ? newType : GroupType.OPEN;
    }

    public void updateColors(int colorOne, int colorTwo) {
        this.colorOne = colorOne;
        this.colorTwo = colorTwo;
    }

    public void setMembersFurniAccess(boolean access) {
        this.membersFurniAccess = access;
    }

    public void setForumEnabled(boolean enabled) {
        this.forumEnabled = enabled;
    }

    // ============== Member Management ==============

    public boolean addMember(UserId userId) {
        if (members.containsKey(userId)) return false;

        GroupMember member;
        if (type == GroupType.LOCKED) {
            member = GroupMember.pending(id, userId);
        } else {
            member = GroupMember.create(id, userId, GroupMemberRank.MEMBER);
        }
        members.put(userId, member);
        return true;
    }

    public boolean removeMember(UserId userId) {
        if (userId.equals(ownerId)) return false; // Can't remove owner
        return members.remove(userId) != null;
    }

    public boolean acceptMember(UserId userId) {
        GroupMember member = members.get(userId);
        if (member == null || !member.isPending()) return false;
        members.put(userId, member.accept());
        return true;
    }

    public boolean promoteMember(UserId userId) {
        GroupMember member = members.get(userId);
        if (member == null || member.isOwner()) return false;
        members.put(userId, member.promote());
        return true;
    }

    public boolean demoteMember(UserId userId) {
        GroupMember member = members.get(userId);
        if (member == null || member.isOwner()) return false;
        members.put(userId, member.demote());
        return true;
    }

    public void declinePendingRequest(UserId userId) {
        GroupMember member = members.get(userId);
        if (member != null && member.isPending()) {
            members.remove(userId);
        }
    }

    // ============== Member Queries ==============

    public boolean isMember(UserId userId) {
        GroupMember member = members.get(userId);
        return member != null && member.isMember();
    }

    public boolean isPending(UserId userId) {
        GroupMember member = members.get(userId);
        return member != null && member.isPending();
    }

    public boolean isAdmin(UserId userId) {
        GroupMember member = members.get(userId);
        return member != null && member.isAdmin();
    }

    public boolean isOwner(UserId userId) {
        return ownerId.equals(userId);
    }

    public boolean canManageRoom(UserId userId) {
        if (isOwner(userId) || isAdmin(userId)) return true;
        return membersFurniAccess && isMember(userId);
    }

    public GroupMember getMember(UserId userId) {
        return members.get(userId);
    }

    public Collection<GroupMember> getMembers() {
        return Collections.unmodifiableCollection(members.values());
    }

    public int getMemberCount() {
        return (int) members.values().stream()
            .filter(m -> !m.isPending())
            .count();
    }

    public int getPendingCount() {
        return (int) members.values().stream()
            .filter(GroupMember::isPending)
            .count();
    }

    // ============== Getters ==============

    public GroupId getId() { return id; }
    public UserId getOwnerId() { return ownerId; }
    public Instant getCreatedAt() { return createdAt; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public GroupBadge getBadge() { return badge; }
    public String getBadgeCode() { return badge.toCode(); }
    public GroupType getType() { return type; }
    public RoomId getBaseRoomId() { return baseRoomId; }
    public int getColorOne() { return colorOne; }
    public int getColorTwo() { return colorTwo; }
    public boolean isMembersFurniAccess() { return membersFurniAccess; }
    public boolean isForumEnabled() { return forumEnabled; }

    // ============== Equality ==============

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Group{id=" + id + ", name='" + name + "', members=" + getMemberCount() + "}";
    }
}
