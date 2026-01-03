package com.nova.core.domain.model.hotel.room;

import com.nova.core.domain.model.core.user.UserId;

import java.time.Instant;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Room domain entity (Aggregate Root).
 * Represents a Habbo room in the hotel.
 * <p>
 * Composed of Value Objects for clean separation:
 * - RoomSettings: access, chat, trade, moderation settings
 * - RoomDecoration: wallpaper, floor, landscape, mood light
 */
public class Room {
    // Identity (immutable)
    private final RoomId id;
    private final UserId ownerId;
    private final String ownerName;
    private final Instant createdAt;

    // Core properties
    private String name;
    private String description;
    private String modelName;
    private RoomCategory category;
    private int score;
    private String tags;

    // Composed Value Objects
    private RoomSettings settings;
    private RoomDecoration decoration;

    // Rights management
    private final Set<UserId> usersWithRights;
    private int groupId;

    // Runtime state (not persisted)
    private boolean loaded;
    private int userCount;

    public Room(RoomId id, UserId ownerId, String ownerName, String name, String description,
                String modelName, RoomCategory category, int score, String tags,
                RoomSettings settings, RoomDecoration decoration,
                Set<UserId> usersWithRights, int groupId, Instant createdAt) {
        this.id = Objects.requireNonNull(id, "Room ID cannot be null");
        this.ownerId = Objects.requireNonNull(ownerId, "Owner ID cannot be null");
        this.ownerName = ownerName != null ? ownerName : "";
        this.name = Objects.requireNonNull(name, "Room name cannot be null");
        this.description = description != null ? description : "";
        this.modelName = modelName != null ? modelName : "model_a";
        this.category = category != null ? category : RoomCategory.NONE;
        this.score = Math.max(0, score);
        this.tags = tags != null ? tags : "";
        this.settings = settings != null ? settings : RoomSettings.defaultSettings();
        this.decoration = decoration != null ? decoration : RoomDecoration.defaultDecoration();
        this.usersWithRights = usersWithRights != null ? new HashSet<>(usersWithRights) : new HashSet<>();
        this.groupId = groupId;
        this.createdAt = createdAt != null ? createdAt : Instant.now();
        this.loaded = false;
        this.userCount = 0;
    }

    /**
     * Simple constructor for creating new rooms.
     */
    public static Room create(int id, UserId ownerId, String ownerName, String name, String modelName) {
        return new Room(
            RoomId.of(id), ownerId, ownerName, name, "",
            modelName, RoomCategory.NONE, 0, "",
            RoomSettings.defaultSettings(), RoomDecoration.defaultDecoration(),
            new HashSet<>(), 0, Instant.now()
        );
    }

    // ============== Domain Behavior Methods ==============

    public void updateName(String newName) {
        if (newName == null || newName.isBlank()) {
            throw new IllegalArgumentException("Room name cannot be empty");
        }
        this.name = newName;
    }

    public void updateDescription(String newDescription) {
        this.description = newDescription != null ? newDescription : "";
    }

    public void updateCategory(RoomCategory newCategory) {
        this.category = newCategory != null ? newCategory : RoomCategory.NONE;
    }

    public void updateTags(String newTags) {
        this.tags = newTags != null ? newTags : "";
    }

    public void incrementScore() {
        this.score++;
    }

    public void decrementScore() {
        this.score = Math.max(0, score - 1);
    }

    // ============== Settings Management ==============

    public void updateSettings(RoomSettings newSettings) {
        this.settings = newSettings != null ? newSettings : RoomSettings.defaultSettings();
    }

    public void updateDecoration(RoomDecoration newDecoration) {
        this.decoration = newDecoration != null ? newDecoration : RoomDecoration.defaultDecoration();
    }

    public void setWallpaper(int wallpaper) {
        this.decoration = decoration.withWallpaper(wallpaper);
    }

    public void setFloor(int floor) {
        this.decoration = decoration.withFloor(floor);
    }

    public void setLandscape(int landscape) {
        this.decoration = decoration.withLandscape(landscape);
    }

    // ============== Rights Management ==============

    public boolean giveRights(UserId userId) {
        if (userId.equals(ownerId)) return false; // Owner always has rights
        return usersWithRights.add(userId);
    }

    public boolean removeRights(UserId userId) {
        return usersWithRights.remove(userId);
    }

    public void clearAllRights() {
        usersWithRights.clear();
    }

    public boolean hasRights(UserId userId) {
        if (userId.equals(ownerId)) return true;
        return usersWithRights.contains(userId);
    }

    public boolean isOwner(UserId userId) {
        return ownerId.equals(userId);
    }

    // ============== Group Management ==============

    public void setGroup(int groupId) {
        this.groupId = groupId;
    }

    public void removeGroup() {
        this.groupId = 0;
    }

    public boolean hasGroup() {
        return groupId > 0;
    }

    // ============== Access Checks ==============

    public boolean isPublic() {
        return settings.state() == RoomState.OPEN;
    }

    public boolean requiresDoorbell() {
        return settings.state() == RoomState.DOORBELL;
    }

    public boolean requiresPassword() {
        return settings.state() == RoomState.PASSWORD;
    }

    public boolean isInvisible() {
        return settings.state() == RoomState.INVISIBLE;
    }

    public boolean checkPassword(String password) {
        if (!requiresPassword()) return true;
        return settings.password().equals(password);
    }

    public boolean isFull() {
        return userCount >= settings.maxUsers();
    }

    // ============== Runtime State ==============

    public void markLoaded() {
        this.loaded = true;
    }

    public void markUnloaded() {
        this.loaded = false;
        this.userCount = 0;
    }

    public void incrementUserCount() {
        this.userCount++;
    }

    public void decrementUserCount() {
        this.userCount = Math.max(0, userCount - 1);
    }

    // ============== Identity Getters ==============

    public RoomId getId() { return id; }
    public UserId getOwnerId() { return ownerId; }
    public String getOwnerName() { return ownerName; }
    public Instant getCreatedAt() { return createdAt; }

    // ============== Property Getters ==============

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getModelName() { return modelName; }
    public RoomCategory getCategory() { return category; }
    public int getScore() { return score; }
    public String getTags() { return tags; }

    // ============== Value Object Getters ==============

    public RoomSettings getSettings() { return settings; }
    public RoomDecoration getDecoration() { return decoration; }
    public Set<UserId> getUsersWithRights() { return Collections.unmodifiableSet(usersWithRights); }
    public int getGroupId() { return groupId; }

    // ============== Runtime State Getters ==============

    public boolean isLoaded() { return loaded; }
    public int getUserCount() { return userCount; }

    // ============== Convenience Getters ==============

    public RoomState getState() { return settings.state(); }
    public int getMaxUsers() { return settings.maxUsers(); }
    public int getWallpaper() { return decoration.wallpaper(); }
    public int getFloor() { return decoration.floor(); }
    public int getLandscape() { return decoration.landscape(); }

    // ============== Equality ==============

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(id, room.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Room{id=" + id + ", name='" + name + "', owner='" + ownerName + "'}";
    }
}
