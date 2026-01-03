package com.nova.core.domain.model;

import com.nova.core.domain.model.user.UserCurrencies;
import com.nova.core.domain.model.user.UserData;
import com.nova.core.domain.model.user.UserRank;

import java.time.Instant;
import java.util.Objects;

/**
 * User domain entity (Aggregate Root).
 * Represents a player in the hotel.
 * <p>
 * Composed of Value Objects for clean separation:
 * - UserData: motto, figure, gender, homeRoomId, respect, achievement
 * - UserRank: rankId, level, name, permissions
 * - UserCurrencies: credits, pixels, diamonds
 */
public class User {
    // Identity (immutable)
    private final UserId id;
    private final String username;
    private final Instant createdAt;

    // Composed Value Objects
    private UserData data;
    private final UserRank rank;
    private UserCurrencies currencies;

    // Status
    private Instant lastOnline;
    private boolean online;

    /**
     * Full constructor for loading from database.
     */
    public User(UserId id, String username, UserData data, UserRank rank,
                UserCurrencies currencies, Instant createdAt, Instant lastOnline) {
        this.id = Objects.requireNonNull(id, "User ID cannot be null");
        this.username = Objects.requireNonNull(username, "Username cannot be null");
        this.data = data != null ? data : UserData.defaultData();
        this.rank = rank != null ? rank : UserRank.defaultRank();
        this.currencies = currencies != null ? currencies : UserCurrencies.empty();
        this.createdAt = Objects.requireNonNull(createdAt, "Created date cannot be null");
        this.lastOnline = lastOnline != null ? lastOnline : createdAt;
        this.online = false;
    }

    /**
     * Simplified constructor for backward compatibility.
     */
    public User(UserId id, String username, String motto, String figure, int credits, Instant createdAt) {
        this(id, username,
             new UserData(motto, figure, "M", null, 0, 0, 3, 3, 0),
             UserRank.defaultRank(),
             UserCurrencies.of(credits, 0, 0),
             createdAt, createdAt);
    }

    // ============== Domain Behavior Methods ==============

    public void updateMotto(String newMotto) {
        this.data = data.withMotto(newMotto);
    }

    public void updateFigure(String newFigure) {
        if (newFigure == null || newFigure.isBlank()) {
            throw new IllegalArgumentException("Figure cannot be empty");
        }

        this.data = data.withFigure(newFigure);
    }

    public void setHomeRoom(Integer roomId) {
        this.data = data.withHomeRoom(roomId);
    }

    public void addCredits(int amount) {
        this.currencies = currencies.addCredits(amount);
    }

    public boolean spendCredits(int amount) {
        if (!currencies.canAffordCredits(amount)) return false;

        this.currencies = currencies.spendCredits(amount);

        return true;
    }

    public void addPixels(int amount) {
        this.currencies = currencies.addPixels(amount);
    }

    public boolean spendPixels(int amount) {
        if (!currencies.canAffordPixels(amount)) return false;

        this.currencies = currencies.spendPixels(amount);

        return true;
    }

    public void addDiamonds(int amount) {
        this.currencies = currencies.addDiamonds(amount);
    }

    public boolean spendDiamonds(int amount) {
        if (!currencies.canAffordDiamonds(amount)) return false;

        this.currencies = currencies.spendDiamonds(amount);

        return true;
    }

    public void giveRespect() {
        this.data = data.withRespectGiven();
    }

    public void receiveRespect() {
        this.data = data.withRespectReceived();
    }

    public void markOnline() {
        this.lastOnline = Instant.now();
        this.online = true;
    }

    public void markOffline() {
        this.lastOnline = Instant.now();
        this.online = false;
    }

    // ============== Identity Getters ==============

    public UserId getId() { return id; }
    public String getUsername() { return username; }
    public Instant getCreatedAt() { return createdAt; }
    public Instant getLastOnline() { return lastOnline; }
    public boolean isOnline() { return online; }

    // ============== Value Object Getters ==============

    public UserData getData() { return data; }
    public UserRank getRank() { return rank; }
    public UserCurrencies getCurrencies() { return currencies; }

    // ============== Convenience Getters (delegate to Value Objects) ==============

    public String getMotto() { return data.motto(); }
    public String getFigure() { return data.figure(); }
    public String getGender() { return data.gender(); }
    public Integer getHomeRoomId() { return data.homeRoomId(); }
    public int getRespectReceived() { return data.respectReceived(); }
    public int getDailyRespectPoints() { return data.dailyRespectPoints(); }
    public int getDailyPetRespect() { return data.dailyPetRespect(); }
    public int getAchievementScore() { return data.achievementScore(); }

    public int getRankId() { return rank.id(); }
    public int getRankLevel() { return rank.level(); }
    public String getRankName() { return rank.name(); }
    public boolean hasClub() { return rank.hasClub(); }
    public boolean isVip() { return rank.isVip(); }
    public boolean isStaff() { return rank.isStaff(); }
    public boolean isAmbassador() { return rank.isAmbassador(); }

    public int getCredits() { return currencies.credits(); }
    public int getPixels() { return currencies.pixels(); }
    public int getDiamonds() { return currencies.diamonds(); }

    // ============== Equality ==============

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", username='" + username + "', rank=" + rank.name() + "}";
    }
}
