package com.nova.core.domain.model.core.user;

import java.time.Duration;
import java.time.Instant;

/**
 * Value Object representing user's club subscription status.
 * <p>
 * Habbo has two subscription tiers:
 * - Habbo Club (HC): Basic subscription
 * - VIP: Premium subscription with more features
 * <p>
 * Corresponds to 'user_subscriptions' table.
 */
public record UserSubscription(
        SubscriptionType type,
        Instant startedAt,
        Instant expiresAt,
        int memberPeriods,
        int periodsAhead,
        int pastClubDays,
        int pastVipDays
) {
    /**
     * Creates an empty subscription (no club membership).
     */
    public static UserSubscription none() {
        return new UserSubscription(
                SubscriptionType.NONE,
                null,
                null,
                0,
                0,
                0,
                0
        );
    }

    /**
     * Creates a Habbo Club subscription.
     */
    public static UserSubscription habboClub(Instant startedAt, Instant expiresAt,
                                              int memberPeriods, int periodsAhead,
                                              int pastClubDays) {
        return new UserSubscription(
                SubscriptionType.HABBO_CLUB,
                startedAt,
                expiresAt,
                memberPeriods,
                periodsAhead,
                pastClubDays,
                0
        );
    }

    /**
     * Creates a VIP subscription.
     */
    public static UserSubscription vip(Instant startedAt, Instant expiresAt,
                                        int memberPeriods, int periodsAhead,
                                        int pastClubDays, int pastVipDays) {
        return new UserSubscription(
                SubscriptionType.VIP,
                startedAt,
                expiresAt,
                memberPeriods,
                periodsAhead,
                pastClubDays,
                pastVipDays
        );
    }

    // ============== Query Methods ==============

    /**
     * Checks if the user has any active subscription.
     */
    public boolean isActive() {
        return type != SubscriptionType.NONE && expiresAt != null && expiresAt.isAfter(Instant.now());
    }

    /**
     * Checks if the user has Habbo Club (or higher).
     */
    public boolean hasClub() {
        return isActive() && (type == SubscriptionType.HABBO_CLUB || type == SubscriptionType.VIP);
    }

    /**
     * Checks if the user has VIP subscription.
     */
    public boolean isVip() {
        return isActive() && type == SubscriptionType.VIP;
    }

    /**
     * Checks if the user has ever been a member.
     */
    public boolean hasEverBeenMember() {
        return memberPeriods > 0 || pastClubDays > 0 || pastVipDays > 0;
    }

    /**
     * Gets days remaining until subscription expires.
     */
    public int getDaysRemaining() {
        if (expiresAt == null || !isActive()) {
            return 0;
        }

        long days = Duration.between(Instant.now(), expiresAt).toDays();

        return (int) Math.max(0, days);
    }

    /**
     * Gets minutes remaining until subscription expires.
     */
    public int getMinutesRemaining() {
        if (expiresAt == null || !isActive()) {
            return 0;
        }

        long minutes = Duration.between(Instant.now(), expiresAt).toMinutes();

        return (int) Math.max(0, minutes);
    }

    /**
     * Gets the subscription product name for the protocol.
     */
    public String getProductName() {
        return switch (type) {
            case VIP -> "habbo_vip";
            case HABBO_CLUB, NONE -> "habbo_club";
        };
    }

    /**
     * Gets the club level for protocol (0=none, 1=HC, 2=VIP).
     */
    public int getClubLevel() {
        if (!isActive()) return 0;

        return switch (type) {
            case VIP -> 2;
            case HABBO_CLUB -> 1;
            case NONE -> 0;
        };
    }

    /**
     * Subscription types.
     */
    public enum SubscriptionType {
        NONE,
        HABBO_CLUB,
        VIP
    }
}
