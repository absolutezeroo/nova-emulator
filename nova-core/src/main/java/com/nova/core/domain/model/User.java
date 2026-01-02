package com.nova.core.domain.model;

import java.time.Instant;
import java.util.Objects;

/**
 * User domain entity (Aggregate Root).
 * Represents a player in the hotel.
 */
public class User {
    private final UserId id;
    private final String username;
    private String motto;
    private String figure;
    private int credits;
    private final Instant createdAt;
    private Instant lastOnline;

    public User(UserId id, String username, String motto, String figure, int credits, Instant createdAt) {
        this.id = Objects.requireNonNull(id, "User ID cannot be null");
        this.username = Objects.requireNonNull(username, "Username cannot be null");
        this.motto = motto != null ? motto : "";
        this.figure = Objects.requireNonNull(figure, "Figure cannot be null");
        this.credits = credits;
        this.createdAt = Objects.requireNonNull(createdAt, "Created date cannot be null");
        this.lastOnline = createdAt;
    }

    // Domain behavior methods
    public void updateMotto(String newMotto) {
        this.motto = newMotto != null ? newMotto : "";
    }

    public void updateFigure(String newFigure) {
        if (newFigure == null || newFigure.isBlank()) {
            throw new IllegalArgumentException("Figure cannot be empty");
        }
        this.figure = newFigure;
    }

    public void addCredits(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot add negative credits");
        }
        this.credits += amount;
    }

    public boolean spendCredits(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot spend negative credits");
        }
        if (this.credits < amount) {
            return false;
        }
        this.credits -= amount;
        return true;
    }

    public void markOnline() {
        this.lastOnline = Instant.now();
    }

    // Getters (no setters - modifications through behavior methods)
    public UserId getId() { return id; }

    public String getUsername() { return username; }

    public String getMotto() { return motto; }

    public String getFigure() { return figure; }

    public int getCredits() { return credits; }

    public Instant getCreatedAt() { return createdAt; }

    public Instant getLastOnline() { return lastOnline; }

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
}
