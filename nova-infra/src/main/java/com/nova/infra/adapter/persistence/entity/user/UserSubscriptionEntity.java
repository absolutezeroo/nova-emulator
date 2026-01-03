package com.nova.infra.adapter.persistence.entity.user;

import java.time.Instant;

/**
 * Database entity record mapping to the 'user_subscriptions' table.
 * <p>
 * Club subscription data (HC/VIP).
 */
public record UserSubscriptionEntity(
        int userId,
        String subscriptionType,
        Instant startedAt,
        Instant expiresAt,
        int memberPeriods,
        int periodsAhead,
        int pastClubDays,
        int pastVipDays
) {
}
