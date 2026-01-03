package com.nova.infra.adapter.persistence.dao.user;

import com.nova.infra.adapter.persistence.entity.user.UserTicketEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.time.Instant;
import java.util.Optional;

/**
 * Jdbi DAO for 'user_tickets' table (SSO authentication).
 */
@RegisterConstructorMapper(UserTicketEntity.class)
public interface UserTicketDao {

    @SqlQuery("""
            SELECT id, user_id AS userId, ticket, ip_address AS ipAddress,
                   created_at AS createdAt, expires_at AS expiresAt,
                   used_at AS usedAt, is_used AS isUsed
            FROM user_tickets
            WHERE ticket = :ticket AND is_used = FALSE
              AND (expires_at IS NULL OR expires_at > NOW())
            """)
    Optional<UserTicketEntity> findValidTicket(@Bind("ticket") String ticket);

    @SqlQuery("""
            SELECT id, user_id AS userId, ticket, ip_address AS ipAddress,
                   created_at AS createdAt, expires_at AS expiresAt,
                   used_at AS usedAt, is_used AS isUsed
            FROM user_tickets WHERE ticket = :ticket
            """)
    Optional<UserTicketEntity> findByTicket(@Bind("ticket") String ticket);

    @SqlUpdate("UPDATE user_tickets SET is_used = TRUE, used_at = :usedAt WHERE ticket = :ticket AND is_used = FALSE")
    int markAsUsed(@Bind("ticket") String ticket, @Bind("usedAt") Instant usedAt);

    @SqlUpdate("UPDATE user_tickets SET is_used = TRUE, used_at = NOW() WHERE user_id = :userId AND is_used = FALSE")
    int invalidateAllForUser(@Bind("userId") int userId);

    @SqlUpdate("DELETE FROM user_tickets WHERE expires_at < NOW() AND is_used = TRUE")
    int deleteExpiredUsedTickets();

    @SqlUpdate("DELETE FROM user_tickets WHERE is_used = TRUE AND used_at < :before")
    int deleteUsedTicketsBefore(@Bind("before") Instant before);
}
