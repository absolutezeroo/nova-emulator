package com.nova.infra.adapter.persistence.dao.user;

import com.nova.infra.adapter.persistence.entity.user.UserSubscriptionEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.time.Instant;
import java.util.Optional;

/**
 * Jdbi DAO for 'user_subscriptions' table (club membership).
 */
@RegisterConstructorMapper(UserSubscriptionEntity.class)
public interface UserSubscriptionDao {

    @SqlQuery("""
            SELECT user_id AS userId,
                   subscription_type AS subscriptionType,
                   started_at AS startedAt,
                   expires_at AS expiresAt,
                   member_periods AS memberPeriods,
                   periods_ahead AS periodsAhead,
                   past_club_days AS pastClubDays,
                   past_vip_days AS pastVipDays
            FROM user_subscriptions WHERE user_id = :userId
            """)
    Optional<UserSubscriptionEntity> findByUserId(@Bind("userId") int userId);

    @SqlUpdate("""
            INSERT INTO user_subscriptions (user_id, subscription_type, started_at, expires_at,
                                            member_periods, periods_ahead, past_club_days, past_vip_days)
            VALUES (:userId, :subscriptionType, :startedAt, :expiresAt,
                    :memberPeriods, :periodsAhead, :pastClubDays, :pastVipDays)
            ON DUPLICATE KEY UPDATE
                subscription_type = :subscriptionType,
                started_at = :startedAt,
                expires_at = :expiresAt,
                member_periods = :memberPeriods,
                periods_ahead = :periodsAhead,
                past_club_days = :pastClubDays,
                past_vip_days = :pastVipDays
            """)
    int upsert(@Bind("userId") int userId,
               @Bind("subscriptionType") String subscriptionType,
               @Bind("startedAt") Instant startedAt,
               @Bind("expiresAt") Instant expiresAt,
               @Bind("memberPeriods") int memberPeriods,
               @Bind("periodsAhead") int periodsAhead,
               @Bind("pastClubDays") int pastClubDays,
               @Bind("pastVipDays") int pastVipDays);

    @SqlUpdate("""
            UPDATE user_subscriptions
            SET expires_at = :expiresAt, periods_ahead = periods_ahead + :additionalPeriods
            WHERE user_id = :userId
            """)
    int extendSubscription(@Bind("userId") int userId,
                           @Bind("expiresAt") Instant expiresAt,
                           @Bind("additionalPeriods") int additionalPeriods);

    @SqlUpdate("UPDATE user_subscriptions SET past_club_days = past_club_days + :days WHERE user_id = :userId")
    int addPastClubDays(@Bind("userId") int userId, @Bind("days") int days);

    @SqlUpdate("UPDATE user_subscriptions SET past_vip_days = past_vip_days + :days WHERE user_id = :userId")
    int addPastVipDays(@Bind("userId") int userId, @Bind("days") int days);
}
