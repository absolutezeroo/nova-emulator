package com.nova.core.domain.model.core.permission;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Domain entity representing a rank with its permissions.
 * <p>
 * Ranks define user privilege levels and group permissions.
 * Examples: Normal, VIP, Moderator, Admin
 */
public class Rank {
    private final RankId id;
    private final String name;
    private final String badge;
    private final int level;
    private final Set<Permission> permissions;

    public Rank(RankId id, String name, String badge, int level, Set<Permission> permissions) {
        this.id = Objects.requireNonNull(id, "Rank ID cannot be null");
        this.name = Objects.requireNonNull(name, "Rank name cannot be null");
        this.badge = badge != null ? badge : "";
        this.level = level;
        this.permissions = permissions != null ? new HashSet<>(permissions) : new HashSet<>();
    }

    public static Rank of(int id, String name, int level) {
        return new Rank(RankId.of(id), name, "", level, Collections.emptySet());
    }

    public static Rank defaultRank() {
        return new Rank(RankId.of(1), "Normal", "", 1, Collections.emptySet());
    }

    // ============== Permission Checks ==============

    /**
     * Check if this rank has a specific permission.
     */
    public boolean hasPermission(String permissionKey) {
        return permissions.stream().anyMatch(p -> p.matches(permissionKey));
    }

    /**
     * Check if this rank has a specific permission.
     */
    public boolean hasPermission(Permission permission) {
        return permissions.contains(permission);
    }

    /**
     * Get all permissions in a category.
     */
    public Set<Permission> getPermissionsInCategory(String category) {
        Set<Permission> result = new HashSet<>();
        for (Permission p : permissions) {
            if (p.inCategory(category)) {
                result.add(p);
            }
        }
        return Collections.unmodifiableSet(result);
    }

    // ============== Rank Level Checks ==============

    public boolean hasClub() { return level >= 2; }
    public boolean isVip() { return level >= 3; }
    public boolean isStaff() { return level >= 4; }
    public boolean isModerator() { return level >= 5; }
    public boolean isAdmin() { return level >= 6; }

    public int getClubLevel() {
        if (isVip()) return 2;
        if (hasClub()) return 1;
        return 0;
    }

    // ============== Getters ==============

    public RankId getId() { return id; }
    public String getName() { return name; }
    public String getBadge() { return badge; }
    public int getLevel() { return level; }
    public Set<Permission> getPermissions() { return Collections.unmodifiableSet(permissions); }

    // ============== Equality ==============

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rank rank = (Rank) o;
        return Objects.equals(id, rank.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Rank{id=" + id + ", name='" + name + "', level=" + level + "}";
    }
}
