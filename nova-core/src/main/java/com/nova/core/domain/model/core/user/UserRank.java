package com.nova.core.domain.model.core.user;

/**
 * Value Object representing user rank/permission level.
 * <p>
 * Corresponds to 'ranks' table.
 */
public record UserRank(
        int id,
        String name,
        int level
) {
    public static UserRank defaultRank() {
        return new UserRank(1, "Normal", 1);
    }

    /**
     * Determines if the user has Habbo Club membership.
     * Rank level >= 2 is considered HC.
     */
    public boolean hasClub() { return level >= 2; }

    /**
     * Determines if user is VIP (higher club tier).
     * Rank level >= 3 is considered VIP.
     */
    public boolean isVip() { return level >= 3; }

    /**
     * Determines if user is a staff member.
     * Rank level >= 4 is considered staff.
     */
    public boolean isStaff() { return level >= 4; }

    /**
     * Determines if user is an ambassador.
     * Rank level >= 5 is ambassador.
     */
    public boolean isAmbassador() { return level >= 5; }

    /**
     * Gets the club level for protocol (0=none, 1=HC, 2=VIP).
     */
    public int getClubLevel() {
        if (isVip()) return 2;

        if (hasClub()) return 1;

        return 0;
    }
}
