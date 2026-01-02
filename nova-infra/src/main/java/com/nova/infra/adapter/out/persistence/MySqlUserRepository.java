package com.nova.infra.adapter.out.persistence;

import com.nova.core.domain.model.User;
import com.nova.core.domain.model.UserId;
import com.nova.core.domain.port.out.UserRepository;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.time.Instant;
import java.util.Optional;

/**
 * MySQL implementation of UserRepository (Output Adapter).
 */
public class MySqlUserRepository implements UserRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(MySqlUserRepository.class);

    private final HikariDataSource dataSource;

    public MySqlUserRepository(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Optional<User> findBySsoTicket(String ssoTicket) {
        String sql = "SELECT id, username, motto, look, credits, account_created FROM users WHERE auth_ticket = ? LIMIT 1";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, ssoTicket);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapToUser(rs));
                }
            }
        } catch (SQLException e) {
            LOGGER.error("Error finding user by SSO ticket", e);
        }

        return Optional.empty();
    }

    @Override
    public Optional<User> findById(UserId userId) {
        String sql = "SELECT id, username, motto, look, credits, account_created FROM users WHERE id = ? LIMIT 1";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, userId.value());

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapToUser(rs));
                }
            }
        } catch (SQLException e) {
            LOGGER.error("Error finding user by ID: {}", userId, e);
        }

        return Optional.empty();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        String sql = "SELECT id, username, motto, look, credits, account_created FROM users WHERE username = ? LIMIT 1";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapToUser(rs));
                }
            }
        } catch (SQLException e) {
            LOGGER.error("Error finding user by username: {}", username, e);
        }

        return Optional.empty();
    }

    @Override
    public User save(User user) {
        String sql = "UPDATE users SET motto = ?, look = ?, credits = ? WHERE id = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getMotto());
            stmt.setString(2, user.getFigure());
            stmt.setInt(3, user.getCredits());
            stmt.setInt(4, user.getId().value());

            stmt.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error saving user: {}", user.getId(), e);
        }

        return user;
    }

    @Override
    public void invalidateSsoTicket(String ssoTicket) {
        String sql = "UPDATE users SET auth_ticket = NULL WHERE auth_ticket = ?";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, ssoTicket);
            stmt.executeUpdate();
        } catch (SQLException e) {
            LOGGER.error("Error invalidating SSO ticket", e);
        }
    }

    private User mapToUser(ResultSet rs) throws SQLException {
        return new User(
                UserId.of(rs.getInt("id")),
                rs.getString("username"),
                rs.getString("motto"),
                rs.getString("look"),
                rs.getInt("credits"),
                Instant.ofEpochSecond(rs.getLong("account_created"))
        );
    }
}
