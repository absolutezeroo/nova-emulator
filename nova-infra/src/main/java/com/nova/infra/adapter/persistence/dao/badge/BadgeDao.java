package com.nova.infra.adapter.persistence.dao.badge;

import com.nova.infra.adapter.persistence.entity.badge.BadgeDefinitionEntity;
import com.nova.infra.adapter.persistence.entity.badge.UserBadgeEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.Optional;

/**
 * Jdbi DAO for 'badge_definitions' and 'user_badges' tables.
 */
public interface BadgeDao {

    // ==================== BADGE DEFINITIONS ====================

    @SqlQuery("""
            SELECT code, title, description, is_rare AS isRare
            FROM badge_definitions WHERE code = :code
            """)
    @RegisterConstructorMapper(BadgeDefinitionEntity.class)
    Optional<BadgeDefinitionEntity> findDefinitionByCode(@Bind("code") String code);

    @SqlQuery("""
            SELECT code, title, description, is_rare AS isRare
            FROM badge_definitions ORDER BY code
            """)
    @RegisterConstructorMapper(BadgeDefinitionEntity.class)
    List<BadgeDefinitionEntity> findAllDefinitions();

    // ==================== USER BADGES ====================

    @SqlQuery("""
            SELECT id, user_id AS userId, badge_code AS badgeCode, slot_id AS slotId, created_at AS createdAt
            FROM user_badges WHERE user_id = :userId ORDER BY slot_id, id
            """)
    @RegisterConstructorMapper(UserBadgeEntity.class)
    List<UserBadgeEntity> findUserBadges(@Bind("userId") int userId);

    @SqlQuery("""
            SELECT id, user_id AS userId, badge_code AS badgeCode, slot_id AS slotId, created_at AS createdAt
            FROM user_badges WHERE user_id = :userId AND slot_id > 0 ORDER BY slot_id
            """)
    @RegisterConstructorMapper(UserBadgeEntity.class)
    List<UserBadgeEntity> findEquippedBadges(@Bind("userId") int userId);

    @SqlQuery("SELECT EXISTS(SELECT 1 FROM user_badges WHERE user_id = :userId AND badge_code = :badgeCode)")
    boolean hasBadge(@Bind("userId") int userId, @Bind("badgeCode") String badgeCode);

    @SqlQuery("SELECT COUNT(*) FROM user_badges WHERE user_id = :userId")
    int countUserBadges(@Bind("userId") int userId);

    @SqlUpdate("INSERT IGNORE INTO user_badges (user_id, badge_code, slot_id) VALUES (:userId, :badgeCode, :slotId)")
    int giveBadge(@Bind("userId") int userId, @Bind("badgeCode") String badgeCode, @Bind("slotId") int slotId);

    @SqlUpdate("UPDATE user_badges SET slot_id = :slotId WHERE user_id = :userId AND badge_code = :badgeCode")
    int updateSlot(@Bind("userId") int userId, @Bind("badgeCode") String badgeCode, @Bind("slotId") int slotId);

    @SqlUpdate("UPDATE user_badges SET slot_id = 0 WHERE user_id = :userId")
    int unequipAllBadges(@Bind("userId") int userId);

    @SqlUpdate("DELETE FROM user_badges WHERE user_id = :userId AND badge_code = :badgeCode")
    int removeBadge(@Bind("userId") int userId, @Bind("badgeCode") String badgeCode);
}
