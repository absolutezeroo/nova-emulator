package com.nova.core.domain.model.social.group;

/**
 * Enumeration of group member ranks.
 */
public enum GroupMemberRank {
    /** Pending request */
    PENDING(0),
    /** Regular member */
    MEMBER(1),
    /** Admin/Mod */
    ADMIN(2),
    /** Group owner */
    OWNER(3);

    private final int level;

    GroupMemberRank(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAtLeast(GroupMemberRank rank) {
        return level >= rank.level;
    }

    public boolean isAdmin() {
        return level >= ADMIN.level;
    }

    public boolean isOwner() {
        return this == OWNER;
    }

    public static GroupMemberRank fromLevel(int level) {
        for (GroupMemberRank rank : values()) {
            if (rank.level == level) {
                return rank;
            }
        }
        return MEMBER;
    }
}
