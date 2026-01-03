-- ============================================
-- Test User Creation for NovaEmulator
-- ============================================
-- Execute this after schema.sql

-- 1. Create the user (immutable identity)
INSERT INTO users (id, username, email, password_hash, rank_id, created_at)
VALUES (1, 'TestUser', 'test@nova.local', 'not_used_with_sso', 1, NOW())
ON DUPLICATE KEY UPDATE username = username;

-- 2. Create user data (mutable profile)
INSERT INTO user_data (user_id, motto, figure, gender, home_room_id, respect_received, respect_given, daily_respect_points, daily_pet_respect, achievement_score, online, last_online_at)
VALUES (1, 'Hello Nova!', 'hr-115-42.hd-190-1.ch-215-62.lg-285-91.sh-290-62', 'M', NULL, 0, 0, 3, 3, 0, 0, NOW())
ON DUPLICATE KEY UPDATE motto = VALUES(motto);

-- 3. Create SSO ticket for authentication
-- Ticket expires in 5 minutes, single-use
INSERT INTO user_tickets (ticket, user_id, expires_at, is_used)
VALUES ('sso_test_ticket_123', 1, DATE_ADD(NOW(), INTERVAL 5 MINUTE), 0)
ON DUPLICATE KEY UPDATE expires_at = DATE_ADD(NOW(), INTERVAL 5 MINUTE), is_used = 0;

-- 4. Create user currencies (credits, pixels, diamonds)
INSERT INTO user_currencies (user_id, currency_type, amount)
VALUES
    (1, 0, 5000),    -- Credits (type 0)
    (1, 5, 1000),    -- Pixels (type 5)
    (1, 101, 50)     -- Diamonds (type 101)
ON DUPLICATE KEY UPDATE amount = VALUES(amount);

-- 5. Create user settings (preferences - optional, uses defaults)
INSERT INTO user_settings (user_id)
VALUES (1)
ON DUPLICATE KEY UPDATE user_id = user_id;

-- ============================================
-- Verification queries
-- ============================================
-- SELECT * FROM users WHERE id = 1;
-- SELECT * FROM user_data WHERE user_id = 1;
-- SELECT * FROM user_tickets WHERE user_id = 1 AND used = 0;
-- SELECT * FROM user_currencies WHERE user_id = 1;
-- SELECT * FROM ranks WHERE id = 1;
