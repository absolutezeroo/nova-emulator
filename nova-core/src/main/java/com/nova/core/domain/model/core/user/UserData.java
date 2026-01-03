package com.nova.core.domain.model.core.user;

import java.util.Objects;

/**
 * Value Object representing user profile/mutable data.
 * <p>
 * Corresponds to 'user_data' table.
 */
public record UserData(
        String motto,
        String figure,
        String gender,
        Integer homeRoomId,
        int respectReceived,
        int respectGiven,
        int dailyRespectPoints,
        int dailyPetRespect,
        int achievementScore
) {
    public static final String DEFAULT_FIGURE = "hr-115-42.hd-190-1.ch-215-62.lg-285-91.sh-290-62";

    public UserData {
        motto = motto != null ? motto : "";
        figure = figure != null ? figure : DEFAULT_FIGURE;
        gender = gender != null ? gender : "M";
    }

    public static UserData defaultData() {
        return new UserData("", DEFAULT_FIGURE, "M", null, 0, 0, 3, 3, 0);
    }

    public UserData withMotto(String newMotto) {
        return new UserData(newMotto, figure, gender, homeRoomId, respectReceived, respectGiven, dailyRespectPoints, dailyPetRespect, achievementScore);
    }

    public UserData withFigure(String newFigure) {
        Objects.requireNonNull(newFigure, "Figure cannot be null");

        return new UserData(motto, newFigure, gender, homeRoomId, respectReceived, respectGiven, dailyRespectPoints, dailyPetRespect, achievementScore);
    }

    public UserData withGender(String newGender) {
        return new UserData(motto, figure, newGender, homeRoomId, respectReceived, respectGiven, dailyRespectPoints, dailyPetRespect, achievementScore);
    }

    public UserData withHomeRoom(Integer roomId) {
        return new UserData(motto, figure, gender, roomId, respectReceived, respectGiven, dailyRespectPoints, dailyPetRespect, achievementScore);
    }

    public UserData withRespectGiven() {
        int newRemaining = Math.max(0, dailyRespectPoints - 1);

        return new UserData(motto, figure, gender, homeRoomId, respectReceived, respectGiven + 1, newRemaining, dailyPetRespect, achievementScore);
    }

    public UserData withRespectReceived() {
        return new UserData(motto, figure, gender, homeRoomId, respectReceived + 1, respectGiven, dailyRespectPoints, dailyPetRespect, achievementScore);
    }

    public UserData withAchievementScore(int score) {
        return new UserData(motto, figure, gender, homeRoomId, respectReceived, respectGiven, dailyRespectPoints, dailyPetRespect, score);
    }

    public UserData resetDailyRespect() {
        return new UserData(motto, figure, gender, homeRoomId, respectReceived, respectGiven, 3, 3, achievementScore);
    }
}
