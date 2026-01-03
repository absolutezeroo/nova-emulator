package com.nova.infra.adapter.persistence.repository;

import com.nova.core.domain.model.core.user.*;
import com.nova.core.domain.repository.UserRepository;
import com.nova.infra.adapter.persistence.dao.permission.RankDao;
import com.nova.infra.adapter.persistence.dao.user.UserCurrencyDao;
import com.nova.infra.adapter.persistence.dao.user.UserDao;
import com.nova.infra.adapter.persistence.dao.user.UserDataDao;
import com.nova.infra.adapter.persistence.dao.user.UserSettingsDao;
import com.nova.infra.adapter.persistence.dao.user.UserSubscriptionDao;
import com.nova.infra.adapter.persistence.dao.user.UserTicketDao;
import com.nova.infra.adapter.persistence.entity.permission.RankEntity;
import com.nova.infra.adapter.persistence.entity.user.UserDataEntity;
import com.nova.infra.adapter.persistence.entity.user.UserEntity;
import com.nova.infra.adapter.persistence.entity.user.UserSettingsEntity;
import com.nova.infra.adapter.persistence.entity.user.UserSubscriptionEntity;
import com.nova.infra.adapter.persistence.entity.user.UserTicketEntity;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.Optional;

/**
 * Jdbi implementation of UserRepository (Output Adapter).
 * <p>
 * This adapter bridges the domain layer (UserRepository port) with
 * the infrastructure layer (Jdbi/MySQL).
 * <p>
 * Works with normalized schema:
 * - users: Core identity (immutable)
 * - user_data: Profile/mutable data
 * - user_tickets: SSO authentication tokens
 * - user_currencies: Credits, pixels, diamonds, etc.
 */
@Singleton
public class JdbiUserRepository implements UserRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdbiUserRepository.class);

    private final Jdbi jdbi;

    @Inject
    public JdbiUserRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    @Override
    public Optional<User> findBySsoTicket(String ssoTicket) {
        try {
            // 1. Find valid ticket
            Optional<UserTicketEntity> ticketOpt = jdbi.withExtension(
                    UserTicketDao.class,
                    dao -> dao.findValidTicket(ssoTicket)
            );

            if (ticketOpt.isEmpty()) {
                LOGGER.debug("No valid SSO ticket found: {}", ssoTicket);
                return Optional.empty();
            }

            int userId = ticketOpt.get().userId();

            // 2. Load user by ID
            return findById(UserId.of(userId));
        } catch (Exception e) {
            LOGGER.error("Error finding user by SSO ticket", e);
            return Optional.empty();
        }
    }

    @Override
    public Optional<User> findById(UserId userId) {
        try {
            // Load from users table
            Optional<UserEntity> userOpt = jdbi.withExtension(
                    UserDao.class,
                    dao -> dao.findById(userId.value())
            );

            if (userOpt.isEmpty()) {
                return Optional.empty();
            }

            UserEntity userEntity = userOpt.get();

            // Load profile data from user_data table
            Optional<UserDataEntity> dataOpt = jdbi.withExtension(
                    UserDataDao.class,
                    dao -> dao.findByUserId(userId.value())
            );

            // Load rank from ranks table
            Optional<RankEntity> rankOpt = jdbi.withExtension(
                    RankDao.class,
                    dao -> dao.findById(userEntity.rankId())
            );

            // Load all currencies from user_currencies table
            int credits = jdbi.withExtension(UserCurrencyDao.class, dao -> dao.getCredits(userId.value()));
            int pixels = jdbi.withExtension(UserCurrencyDao.class, dao -> dao.getPixels(userId.value()));
            int diamonds = jdbi.withExtension(UserCurrencyDao.class, dao -> dao.getDiamonds(userId.value()));

            // Load subscription from user_subscriptions table
            Optional<UserSubscriptionEntity> subscriptionOpt = jdbi.withExtension(
                    UserSubscriptionDao.class,
                    dao -> dao.findByUserId(userId.value())
            );

            // Load settings from user_settings table
            Optional<UserSettingsEntity> settingsOpt = jdbi.withExtension(
                    UserSettingsDao.class,
                    dao -> dao.findByUserId(userId.value())
            );

            return Optional.of(toDomainModel(userEntity, dataOpt.orElse(null), rankOpt.orElse(null),
                    credits, pixels, diamonds, settingsOpt.orElse(null), subscriptionOpt.orElse(null)));
        } catch (Exception e) {
            LOGGER.error("Error finding user by ID: {}", userId, e);
            return Optional.empty();
        }
    }

    @Override
    public Optional<User> findByUsername(String username) {
        try {
            Optional<UserEntity> userOpt = jdbi.withExtension(
                    UserDao.class,
                    dao -> dao.findByUsername(username)
            );

            if (userOpt.isEmpty()) {
                return Optional.empty();
            }

            UserEntity userEntity = userOpt.get();
            int userId = userEntity.id();

            // Load profile data
            Optional<UserDataEntity> dataOpt = jdbi.withExtension(
                    UserDataDao.class,
                    dao -> dao.findByUserId(userId)
            );

            // Load rank
            Optional<RankEntity> rankOpt = jdbi.withExtension(
                    RankDao.class,
                    dao -> dao.findById(userEntity.rankId())
            );

            // Load all currencies
            int credits = jdbi.withExtension(UserCurrencyDao.class, dao -> dao.getCredits(userId));
            int pixels = jdbi.withExtension(UserCurrencyDao.class, dao -> dao.getPixels(userId));
            int diamonds = jdbi.withExtension(UserCurrencyDao.class, dao -> dao.getDiamonds(userId));

            // Load subscription
            Optional<UserSubscriptionEntity> subscriptionOpt = jdbi.withExtension(
                    UserSubscriptionDao.class,
                    dao -> dao.findByUserId(userId)
            );

            // Load settings
            Optional<UserSettingsEntity> settingsOpt = jdbi.withExtension(
                    UserSettingsDao.class,
                    dao -> dao.findByUserId(userId)
            );

            return Optional.of(toDomainModel(userEntity, dataOpt.orElse(null), rankOpt.orElse(null),
                    credits, pixels, diamonds, settingsOpt.orElse(null), subscriptionOpt.orElse(null)));
        } catch (Exception e) {
            LOGGER.error("Error finding user by username: {}", username, e);
            return Optional.empty();
        }
    }

    @Override
    public User save(User user) {
        try {
            int userId = user.getId().value();

            // Update profile in user_data table
            jdbi.useExtension(UserDataDao.class, dao -> {
                int updated = dao.updateProfile(
                        userId,
                        user.getMotto(),
                        user.getFigure()
                );

                if (updated == 0) {
                    LOGGER.warn("No user_data rows updated for user: {}", userId);
                }
            });

            // Update credits in user_currencies table
            jdbi.useExtension(UserCurrencyDao.class, dao ->
                    dao.setCurrency(userId, UserCurrencyDao.CREDITS, user.getCredits())
            );

        } catch (Exception e) {
            LOGGER.error("Error saving user: {}", user.getId(), e);
        }
        return user;
    }

    @Override
    public void invalidateSsoTicket(String ssoTicket) {
        try {
            jdbi.useExtension(UserTicketDao.class, dao -> {
                int updated = dao.markAsUsed(ssoTicket, Instant.now());
                LOGGER.debug("Invalidated {} SSO ticket(s)", updated);
            });
        } catch (Exception e) {
            LOGGER.error("Error invalidating SSO ticket", e);
        }
    }

    // ========================
    // Entity ↔ Domain Mapping
    // ========================

    /**
     * Converts normalized database entities to domain Value Objects and assembles User.
     * <p>
     * Maps from:
     * - UserEntity → identity (id, username, createdAt)
     * - UserDataEntity → UserData (motto, figure, gender, homeRoomId, respect, etc.)
     * - RankEntity → UserRank (rankId, level, name)
     * - Currencies → UserCurrencies (credits, pixels, diamonds)
     * - UserSettingsEntity → UserSettings (preferences, navigator, privacy)
     * - UserSubscriptionEntity → UserSubscription (club membership)
     */
    private User toDomainModel(UserEntity userEntity, UserDataEntity dataEntity,
                               RankEntity rankEntity, int credits, int pixels, int diamonds,
                               UserSettingsEntity settingsEntity, UserSubscriptionEntity subscriptionEntity) {
        // Map UserDataEntity → UserData Value Object
        UserData userData = mapToUserData(dataEntity);

        // Map RankEntity → UserRank Value Object
        UserRank userRank = mapToUserRank(userEntity.rankId(), rankEntity);

        // Create UserCurrencies Value Object
        UserCurrencies currencies = UserCurrencies.of(credits, pixels, diamonds);

        // Map UserSettingsEntity → UserSettings Value Object
        UserSettings settings = mapToUserSettings(settingsEntity, dataEntity);

        // Map UserSubscriptionEntity → UserSubscription Value Object
        UserSubscription subscription = mapToUserSubscription(subscriptionEntity);

        // Determine lastOnline
        Instant lastOnline = userEntity.createdAt();
        if (dataEntity != null && dataEntity.lastOnlineAt() != null) {
            lastOnline = dataEntity.lastOnlineAt();
        }

        return new User(
                UserId.of(userEntity.id()),
                userEntity.username(),
                userData,
                userRank,
                currencies,
                settings,
                subscription,
                userEntity.createdAt(),
                lastOnline
        );
    }

    private UserData mapToUserData(UserDataEntity entity) {
        if (entity == null) {
            return UserData.defaultData();
        }
        return new UserData(
                entity.motto(),
                entity.figure(),
                entity.gender(),
                entity.homeRoomId(),
                entity.respectReceived(),
                entity.respectGiven(),
                entity.dailyRespectPoints(),
                entity.dailyPetRespect(),
                entity.achievementScore()
        );
    }

    private UserRank mapToUserRank(int rankId, RankEntity entity) {
        if (entity == null) {
            return new UserRank(rankId, "Normal", 1);
        }
        return new UserRank(entity.id(), entity.name(), entity.level());
    }

    private UserSettings mapToUserSettings(UserSettingsEntity entity, UserDataEntity dataEntity) {
        if (entity == null) {
            return UserSettings.defaultSettings();
        }

        // Get homeRoomId from user_data if available
        int homeRoomId = dataEntity != null && dataEntity.homeRoomId() != null
                ? dataEntity.homeRoomId() : 0;

        return new UserSettings(
                entity.offlineMessagingEnabled(),         // allowDirectMail
                false,                                     // canChangeName (not in DB, default false)
                false,                                     // safetyLocked (not in DB, default false)
                entity.navigatorX(),
                entity.navigatorY(),
                entity.navigatorWidth(),
                entity.navigatorHeight(),
                entity.navigatorSearchOpen(),
                homeRoomId,
                entity.chatPreference(),                   // chatPreferOldBubbles
                entity.ignoreRoomInvite(),                 // chatIgnoreInvites
                entity.cameraFollowEnabled(),              // chatCameraFollow
                entity.volumeFurni(),
                entity.volumeTrax(),
                false,                                     // nuxCompleted (not in DB)
                true,                                      // allowMimic (default true)
                true,                                      // allowFollow (default true)
                entity.friendRequestsEnabled(),            // allowFriendRequests
                true                                       // allowTrade (default true)
        );
    }

    private UserSubscription mapToUserSubscription(UserSubscriptionEntity entity) {
        if (entity == null) {
            return UserSubscription.none();
        }

        UserSubscription.SubscriptionType type = switch (entity.subscriptionType()) {
            case "VIP" -> UserSubscription.SubscriptionType.VIP;
            case "HABBO_CLUB" -> UserSubscription.SubscriptionType.HABBO_CLUB;
            default -> UserSubscription.SubscriptionType.NONE;
        };

        return new UserSubscription(
                type,
                entity.startedAt(),
                entity.expiresAt(),
                entity.memberPeriods(),
                entity.periodsAhead(),
                entity.pastClubDays(),
                entity.pastVipDays()
        );
    }
}
