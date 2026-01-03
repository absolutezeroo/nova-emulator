package com.nova.infra.adapter.persistence.entity.user;

import java.time.Instant;

/**
 * Database entity record mapping to the 'user_data' table.
 * <p>
 * Contains user profile and mutable data (motto, figure, online status, etc.).
 */
public record UserDataEntity(
        int userId,
        String motto,
        String figure,
        String gender,
        Integer homeRoomId,
        int respectReceived,
        int respectGiven,
        int dailyRespectPoints,
        int dailyPetRespect,
        int achievementScore,
        boolean online,
        Instant lastLoginAt,
        Instant lastOnlineAt,
        String ipRegister,
        String ipCurrent,
        String machineId
) {
    public static UserDataEntity defaultForUser(int userId) {
        return new UserDataEntity(
                userId, "", "hr-115-42.hd-190-1.ch-215-62.lg-285-91.sh-290-62",
                "M", null, 0, 0, 3, 3, 0, false, null, null, null, null, null
        );
    }
}
