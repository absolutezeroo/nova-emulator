-- ============================================================================
-- NovaEmulator Database Schema
-- Version: 1.0.0
--
-- A properly normalized database with real foreign key relationships.
-- Designed for MySQL 8.0+ / MariaDB 10.5+
-- ============================================================================

SET FOREIGN_KEY_CHECKS = 0;
SET NAMES utf8mb4;

-- ============================================================================
-- CORE: Users & Authentication
-- ============================================================================

-- Users: Core identity (immutable data)
CREATE TABLE IF NOT EXISTS users (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    username            VARCHAR(25) NOT NULL,
    email               VARCHAR(100) NOT NULL,
    password_hash       CHAR(60) NOT NULL COMMENT 'bcrypt hash',
    rank_id             TINYINT UNSIGNED NOT NULL DEFAULT 1,
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    UNIQUE INDEX uq_username (username),
    UNIQUE INDEX uq_email (email),
    INDEX idx_rank (rank_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Core user identity - immutable data';

-- User Data: Profile & mutable data
CREATE TABLE IF NOT EXISTS user_data (
    user_id             INT UNSIGNED PRIMARY KEY,
    motto               VARCHAR(127) NOT NULL DEFAULT '',
    figure              VARCHAR(255) NOT NULL DEFAULT 'hr-115-42.hd-190-1.ch-215-62.lg-285-91.sh-290-62',
    gender              ENUM('M', 'F') NOT NULL DEFAULT 'M',
    home_room_id        INT UNSIGNED NULL,
    respect_received    INT UNSIGNED NOT NULL DEFAULT 0,
    respect_given       INT UNSIGNED NOT NULL DEFAULT 0,
    daily_respect_points TINYINT UNSIGNED NOT NULL DEFAULT 3,
    daily_pet_respect   TINYINT UNSIGNED NOT NULL DEFAULT 3,
    achievement_score   INT UNSIGNED NOT NULL DEFAULT 0,
    online              BOOLEAN NOT NULL DEFAULT FALSE,
    last_login_at       TIMESTAMP NULL,
    last_online_at      TIMESTAMP NULL,
    ip_register         VARCHAR(45) NULL COMMENT 'IPv4 or IPv6',
    ip_current          VARCHAR(45) NULL,
    machine_id          VARCHAR(255) NULL,

    FOREIGN KEY fk_user_data_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_online (online),
    INDEX idx_last_online (last_online_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='User profile and mutable data';

-- User Tickets: SSO Authentication tokens
CREATE TABLE IF NOT EXISTS user_tickets (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    user_id             INT UNSIGNED NOT NULL,
    ticket              VARCHAR(255) NOT NULL,
    ip_address          VARCHAR(45) NULL COMMENT 'IP that requested the ticket',
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    expires_at          TIMESTAMP NOT NULL,
    used_at             TIMESTAMP NULL,
    is_used             BOOLEAN NOT NULL DEFAULT FALSE,

    FOREIGN KEY fk_ticket_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    UNIQUE INDEX uq_ticket (ticket),
    INDEX idx_user_tickets (user_id),
    INDEX idx_expires (expires_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='SSO authentication tickets (single-use)';

-- User Currencies: Flexible multi-currency system
CREATE TABLE IF NOT EXISTS user_currencies (
    user_id             INT UNSIGNED NOT NULL,
    currency_type       TINYINT UNSIGNED NOT NULL COMMENT '0=credits, 5=pixels, 101=diamonds',
    amount              INT UNSIGNED NOT NULL DEFAULT 0,

    PRIMARY KEY (user_id, currency_type),
    FOREIGN KEY fk_currency_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='User currencies (credits, pixels, diamonds, etc.)';

-- Currency Types Reference
CREATE TABLE IF NOT EXISTS currency_types (
    id                  TINYINT UNSIGNED PRIMARY KEY,
    name                VARCHAR(50) NOT NULL,
    display_name        VARCHAR(50) NOT NULL,
    icon                VARCHAR(100) NULL,

    UNIQUE INDEX uq_name (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Currency type definitions';

-- Insert default currency types
INSERT INTO currency_types (id, name, display_name) VALUES
    (0, 'credits', 'Credits'),
    (5, 'pixels', 'Duckets'),
    (101, 'diamonds', 'Diamonds'),
    (102, 'seasonal', 'Seasonal Currency')
ON DUPLICATE KEY UPDATE name = VALUES(name);

-- User Settings: Preferences
CREATE TABLE IF NOT EXISTS user_settings (
    user_id                     INT UNSIGNED PRIMARY KEY,
    volume_system               TINYINT UNSIGNED NOT NULL DEFAULT 100,
    volume_furni                TINYINT UNSIGNED NOT NULL DEFAULT 100,
    volume_trax                 TINYINT UNSIGNED NOT NULL DEFAULT 100,
    chat_preference             BOOLEAN NOT NULL DEFAULT FALSE,
    room_invites_enabled        BOOLEAN NOT NULL DEFAULT TRUE,
    camera_follow_enabled       BOOLEAN NOT NULL DEFAULT TRUE,
    friend_requests_enabled     BOOLEAN NOT NULL DEFAULT TRUE,
    offline_messaging_enabled   BOOLEAN NOT NULL DEFAULT TRUE,
    friend_bar_open             BOOLEAN NOT NULL DEFAULT TRUE,
    navigator_x                 SMALLINT NOT NULL DEFAULT 100,
    navigator_y                 SMALLINT NOT NULL DEFAULT 100,
    navigator_width             SMALLINT NOT NULL DEFAULT 425,
    navigator_height            SMALLINT NOT NULL DEFAULT 535,
    navigator_search_open       BOOLEAN NOT NULL DEFAULT FALSE,
    ignore_room_invite          BOOLEAN NOT NULL DEFAULT FALSE,
    talent_track_citizenship    TINYINT UNSIGNED NOT NULL DEFAULT 0,
    talent_track_helper         TINYINT UNSIGNED NOT NULL DEFAULT 0,

    FOREIGN KEY fk_settings_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='User preferences and settings';

-- User Subscriptions: Club membership (HC/VIP)
CREATE TABLE IF NOT EXISTS user_subscriptions (
    user_id             INT UNSIGNED PRIMARY KEY,
    subscription_type   ENUM('NONE', 'HABBO_CLUB', 'VIP') NOT NULL DEFAULT 'NONE',
    started_at          TIMESTAMP NULL COMMENT 'When subscription started',
    expires_at          TIMESTAMP NULL COMMENT 'When subscription expires',
    member_periods      SMALLINT UNSIGNED NOT NULL DEFAULT 0 COMMENT 'Number of subscription periods',
    periods_ahead       SMALLINT UNSIGNED NOT NULL DEFAULT 0 COMMENT 'Periods paid in advance',
    past_club_days      INT UNSIGNED NOT NULL DEFAULT 0 COMMENT 'Total days as HC member',
    past_vip_days       INT UNSIGNED NOT NULL DEFAULT 0 COMMENT 'Total days as VIP member',

    FOREIGN KEY fk_subscription_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_expires (expires_at),
    INDEX idx_type (subscription_type)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='User club subscriptions (HC/VIP)';

-- ============================================================================
-- CORE: Ranks & Permissions (Flexible System)
-- ============================================================================

-- Ranks: Basic rank definition
CREATE TABLE IF NOT EXISTS ranks (
    id                  TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name                VARCHAR(50) NOT NULL,
    badge               VARCHAR(50) NULL,
    level               TINYINT UNSIGNED NOT NULL DEFAULT 1 COMMENT 'Hierarchy level for comparison',
    prefix              VARCHAR(20) NULL COMMENT 'Chat prefix [MOD], [ADMIN]...',
    prefix_color        VARCHAR(7) NULL COMMENT 'Hex color #FF0000',
    is_hidden           BOOLEAN NOT NULL DEFAULT FALSE COMMENT 'Hidden from public rank list',
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    UNIQUE INDEX uq_rank_name (name),
    INDEX idx_level (level)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='User ranks/roles';

-- Permission Categories
CREATE TABLE IF NOT EXISTS permission_categories (
    id                  SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    name                VARCHAR(50) NOT NULL,
    description         VARCHAR(255) NULL,
    order_num           SMALLINT UNSIGNED NOT NULL DEFAULT 0,

    UNIQUE INDEX uq_category_name (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Permission grouping categories';

-- Permissions: All available permissions
CREATE TABLE IF NOT EXISTS permissions (
    id                  SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    category_id         SMALLINT UNSIGNED NULL,
    permission_key      VARCHAR(100) NOT NULL COMMENT 'Unique key: mod.kick, admin.catalog.edit',
    name                VARCHAR(100) NOT NULL,
    description         VARCHAR(255) NULL,
    is_dangerous        BOOLEAN NOT NULL DEFAULT FALSE COMMENT 'Requires extra confirmation',
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY fk_perm_category (category_id)
        REFERENCES permission_categories(id) ON DELETE SET NULL ON UPDATE CASCADE,
    UNIQUE INDEX uq_permission_key (permission_key),
    INDEX idx_category (category_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Available permissions definition';

-- Rank Permissions: Many-to-many link
CREATE TABLE IF NOT EXISTS rank_permissions (
    rank_id             TINYINT UNSIGNED NOT NULL,
    permission_id       SMALLINT UNSIGNED NOT NULL,

    PRIMARY KEY (rank_id, permission_id),
    FOREIGN KEY fk_rp_rank (rank_id)
        REFERENCES ranks(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_rp_permission (permission_id)
        REFERENCES permissions(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_permission (permission_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Permissions assigned to ranks';

-- User Permission Overrides: Individual exceptions
CREATE TABLE IF NOT EXISTS user_permissions (
    user_id             INT UNSIGNED NOT NULL,
    permission_id       SMALLINT UNSIGNED NOT NULL,
    granted             BOOLEAN NOT NULL DEFAULT TRUE COMMENT 'TRUE=grant, FALSE=revoke',
    granted_by_id       INT UNSIGNED NULL,
    reason              VARCHAR(255) NULL,
    expires_at          TIMESTAMP NULL COMMENT 'NULL = permanent',
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (user_id, permission_id),
    FOREIGN KEY fk_up_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_up_permission (permission_id)
        REFERENCES permissions(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_up_granted_by (granted_by_id)
        REFERENCES users(id) ON DELETE SET NULL ON UPDATE CASCADE,
    INDEX idx_expires (expires_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Individual user permission overrides (grant or revoke)';

-- Insert default ranks
INSERT INTO ranks (id, name, level, prefix, prefix_color) VALUES
    (1, 'Normal', 1, NULL, NULL),
    (2, 'Bronze VIP', 2, '[VIP]', '#CD7F32'),
    (3, 'Silver VIP', 3, '[VIP]', '#C0C0C0'),
    (4, 'Gold VIP', 4, '[VIP]', '#FFD700'),
    (5, 'Guide', 5, '[GUIDE]', '#00CED1'),
    (6, 'Moderator', 6, '[MOD]', '#32CD32'),
    (7, 'Senior Moderator', 7, '[SMOD]', '#228B22'),
    (8, 'Administrator', 8, '[ADMIN]', '#FF4500'),
    (9, 'Owner', 9, '[OWNER]', '#8B0000')
ON DUPLICATE KEY UPDATE name = VALUES(name);

-- Insert permission categories
INSERT INTO permission_categories (id, name, description, order_num) VALUES
    (1, 'general', 'General user permissions', 10),
    (2, 'room', 'Room-related permissions', 20),
    (3, 'moderation', 'Moderation tools', 30),
    (4, 'administration', 'Administrative actions', 40),
    (5, 'debug', 'Debug and development', 50)
ON DUPLICATE KEY UPDATE name = VALUES(name);

-- Insert default permissions
INSERT INTO permissions (category_id, permission_key, name, description, is_dangerous) VALUES
    -- General
    (1, 'general.trade', 'Can Trade', 'Ability to trade with other users', FALSE),
    (1, 'general.change_name', 'Can Change Name', 'Ability to change username', FALSE),
    (1, 'general.change_motto', 'Can Change Motto', 'Ability to change motto', FALSE),
    (1, 'general.unlimited_friends', 'Unlimited Friends', 'No friend list limit', FALSE),

    -- Room
    (2, 'room.create', 'Can Create Rooms', 'Ability to create rooms', FALSE),
    (2, 'room.unlimited_rooms', 'Unlimited Rooms', 'No room creation limit', FALSE),
    (2, 'room.effect', 'Room Effects', 'Can use effects in any room', FALSE),
    (2, 'room.thumbnail', 'Room Thumbnails', 'Can set room thumbnails', FALSE),
    (2, 'room.enter_full', 'Enter Full Rooms', 'Can enter rooms at max capacity', FALSE),
    (2, 'room.enter_invisible', 'Enter Invisible Rooms', 'Can see and enter invisible rooms', FALSE),
    (2, 'room.bypass_rights', 'Bypass Room Rights', 'Has rights in all rooms', FALSE),
    (2, 'room.bypass_ban', 'Bypass Room Bans', 'Cannot be banned from rooms', FALSE),
    (2, 'room.bypass_mute', 'Bypass Room Mutes', 'Cannot be muted in rooms', FALSE),

    -- Moderation
    (3, 'mod.tool', 'Moderation Tool Access', 'Can open moderation tool', FALSE),
    (3, 'mod.alert', 'Send Alerts', 'Can send alert messages', FALSE),
    (3, 'mod.kick', 'Kick Users', 'Can kick users from rooms', FALSE),
    (3, 'mod.mute', 'Mute Users', 'Can mute users', FALSE),
    (3, 'mod.ban', 'Ban Users', 'Can ban users', TRUE),
    (3, 'mod.super_ban', 'Super Ban', 'Can IP/Machine ban', TRUE),
    (3, 'mod.trade_lock', 'Trade Lock', 'Can lock user trading', FALSE),
    (3, 'mod.room_info', 'View Room Info', 'Can view detailed room info', FALSE),
    (3, 'mod.room_logs', 'View Room Logs', 'Can view room chat logs', FALSE),
    (3, 'mod.user_info', 'View User Info', 'Can view detailed user info', FALSE),
    (3, 'mod.user_logs', 'View User Logs', 'Can view user chat history', FALSE),
    (3, 'mod.tickets', 'Handle Tickets', 'Can handle support tickets', FALSE),

    -- Administration
    (4, 'admin.catalog', 'Manage Catalog', 'Can edit catalog pages/items', TRUE),
    (4, 'admin.items', 'Manage Items', 'Can create/edit item definitions', TRUE),
    (4, 'admin.rooms', 'Manage Rooms', 'Can edit any room settings', TRUE),
    (4, 'admin.users', 'Manage Users', 'Can edit user accounts', TRUE),
    (4, 'admin.ranks', 'Manage Ranks', 'Can edit ranks and permissions', TRUE),
    (4, 'admin.news', 'Manage News', 'Can edit news/articles', FALSE),
    (4, 'admin.settings', 'Server Settings', 'Can edit emulator settings', TRUE),
    (4, 'admin.give_currency', 'Give Currency', 'Can give credits/pixels to users', TRUE),
    (4, 'admin.give_badge', 'Give Badges', 'Can give badges to users', FALSE),
    (4, 'admin.give_item', 'Give Items', 'Can give items to users', TRUE),

    -- Debug
    (5, 'debug.commands', 'Debug Commands', 'Access to debug commands', TRUE),
    (5, 'debug.packets', 'Packet Logging', 'Can enable packet logging', FALSE),
    (5, 'debug.queries', 'Query Logging', 'Can view SQL queries', FALSE)
ON DUPLICATE KEY UPDATE name = VALUES(name);

-- Assign permissions to ranks
-- Moderator (rank 6)
INSERT INTO rank_permissions (rank_id, permission_id)
SELECT 6, id FROM permissions WHERE permission_key IN (
    'general.trade', 'general.unlimited_friends',
    'room.create', 'room.unlimited_rooms', 'room.enter_full', 'room.enter_invisible',
    'mod.tool', 'mod.alert', 'mod.kick', 'mod.mute', 'mod.room_info', 'mod.room_logs', 'mod.user_info', 'mod.tickets'
) ON DUPLICATE KEY UPDATE rank_id = rank_id;

-- Administrator (rank 8)
INSERT INTO rank_permissions (rank_id, permission_id)
SELECT 8, id FROM permissions WHERE category_id IN (1, 2, 3, 4)
ON DUPLICATE KEY UPDATE rank_id = rank_id;

-- Owner (rank 9) - All permissions
INSERT INTO rank_permissions (rank_id, permission_id)
SELECT 9, id FROM permissions
ON DUPLICATE KEY UPDATE rank_id = rank_id;

-- Add FK to users after ranks exists
ALTER TABLE users
    ADD CONSTRAINT fk_user_rank
    FOREIGN KEY (rank_id) REFERENCES ranks(id) ON UPDATE CASCADE;

-- ============================================================================
-- SOCIAL: Messenger & Relationships
-- ============================================================================

-- Messenger Friendships
CREATE TABLE IF NOT EXISTS messenger_friendships (
    user_id             INT UNSIGNED NOT NULL,
    friend_id           INT UNSIGNED NOT NULL,
    relation            TINYINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '0=none, 1=heart, 2=smile, 3=skull',
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (user_id, friend_id),
    FOREIGN KEY fk_friendship_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_friendship_friend (friend_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_friend_lookup (friend_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Bidirectional friendships';

-- Messenger Friend Requests
CREATE TABLE IF NOT EXISTS messenger_requests (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    sender_id           INT UNSIGNED NOT NULL,
    receiver_id         INT UNSIGNED NOT NULL,
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    UNIQUE INDEX uq_request (sender_id, receiver_id),
    FOREIGN KEY fk_request_sender (sender_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_request_receiver (receiver_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Pending friend requests';

-- Messenger Offline Messages
CREATE TABLE IF NOT EXISTS messenger_messages (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    sender_id           INT UNSIGNED NOT NULL,
    receiver_id         INT UNSIGNED NOT NULL,
    message             TEXT NOT NULL,
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    is_read             BOOLEAN NOT NULL DEFAULT FALSE,

    FOREIGN KEY fk_message_sender (sender_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_message_receiver (receiver_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_receiver_unread (receiver_id, is_read)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Offline messenger messages';

-- ============================================================================
-- ROOMS: Core Room System
-- ============================================================================

-- Room Categories (Navigator)
CREATE TABLE IF NOT EXISTS room_categories (
    id                  SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    parent_id           SMALLINT UNSIGNED NULL,
    name                VARCHAR(100) NOT NULL,
    name_key            VARCHAR(100) NOT NULL COMMENT 'Localization key',
    icon_id             SMALLINT UNSIGNED NOT NULL DEFAULT 0,
    min_rank            TINYINT UNSIGNED NOT NULL DEFAULT 1,
    is_public           BOOLEAN NOT NULL DEFAULT FALSE,
    order_num           SMALLINT UNSIGNED NOT NULL DEFAULT 0,

    FOREIGN KEY fk_category_parent (parent_id)
        REFERENCES room_categories(id) ON DELETE SET NULL ON UPDATE CASCADE,
    INDEX idx_parent (parent_id),
    INDEX idx_order (order_num)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Navigator room categories';

-- Rooms: Core room data
CREATE TABLE IF NOT EXISTS rooms (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    owner_id            INT UNSIGNED NOT NULL,
    category_id         SMALLINT UNSIGNED NULL,
    name                VARCHAR(50) NOT NULL,
    description         VARCHAR(255) NOT NULL DEFAULT '',
    model_name          VARCHAR(50) NOT NULL,
    password            VARCHAR(50) NULL,
    state               ENUM('open', 'locked', 'password', 'invisible') NOT NULL DEFAULT 'open',

    -- Statistics
    score               INT UNSIGNED NOT NULL DEFAULT 0,
    users_count         SMALLINT UNSIGNED NOT NULL DEFAULT 0,

    -- Timestamps
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    FOREIGN KEY fk_room_owner (owner_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_room_category (category_id)
        REFERENCES room_categories(id) ON DELETE SET NULL ON UPDATE CASCADE,
    INDEX idx_owner (owner_id),
    INDEX idx_category (category_id),
    INDEX idx_score (score DESC),
    INDEX idx_users (users_count DESC),
    INDEX idx_name (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='User rooms - core data';

-- Room Settings: All configurable options
CREATE TABLE IF NOT EXISTS room_settings (
    room_id             INT UNSIGNED PRIMARY KEY,

    -- Capacity
    max_users           SMALLINT UNSIGNED NOT NULL DEFAULT 25,

    -- Access & Security
    trade_state         ENUM('disabled', 'owner_only', 'enabled') NOT NULL DEFAULT 'enabled',
    who_can_mute        ENUM('nobody', 'owner', 'rights', 'everyone') NOT NULL DEFAULT 'rights',
    who_can_kick        ENUM('nobody', 'owner', 'rights', 'everyone') NOT NULL DEFAULT 'rights',
    who_can_ban         ENUM('nobody', 'owner', 'rights') NOT NULL DEFAULT 'owner',

    -- Movement & Interaction
    allow_pets          BOOLEAN NOT NULL DEFAULT TRUE,
    allow_pets_eat      BOOLEAN NOT NULL DEFAULT FALSE,
    allow_walkthrough   BOOLEAN NOT NULL DEFAULT TRUE,
    allow_pulling       BOOLEAN NOT NULL DEFAULT TRUE COMMENT 'Pull users with arrow',
    allow_pushing       BOOLEAN NOT NULL DEFAULT TRUE COMMENT 'Push users',
    allow_effects       BOOLEAN NOT NULL DEFAULT TRUE COMMENT 'Enable effects in room',
    allow_respect       BOOLEAN NOT NULL DEFAULT TRUE COMMENT 'Give respect',
    diagonal_move       BOOLEAN NOT NULL DEFAULT TRUE COMMENT 'Diagonal movement allowed',

    -- Theming
    wallpaper           VARCHAR(20) NOT NULL DEFAULT '0.0',
    floorpaper          VARCHAR(20) NOT NULL DEFAULT '0.0',
    landscape           VARCHAR(20) NOT NULL DEFAULT '0.0',
    wall_thickness      TINYINT NOT NULL DEFAULT 0 COMMENT '-2 to 1',
    floor_thickness     TINYINT NOT NULL DEFAULT 0 COMMENT '-2 to 1',
    wall_height         TINYINT NOT NULL DEFAULT -1 COMMENT '-1 = auto',
    hide_walls          BOOLEAN NOT NULL DEFAULT FALSE,

    -- Chat Settings
    chat_mode           ENUM('free_flow', 'line_by_line') NOT NULL DEFAULT 'free_flow',
    chat_weight         ENUM('normal', 'thin', 'fat') NOT NULL DEFAULT 'normal',
    chat_speed          ENUM('fast', 'normal', 'slow') NOT NULL DEFAULT 'normal',
    chat_distance       TINYINT UNSIGNED NOT NULL DEFAULT 50 COMMENT '0-99 tiles',
    chat_flood          ENUM('strict', 'normal', 'loose') NOT NULL DEFAULT 'normal',

    -- Roller & Wired
    roller_speed        TINYINT UNSIGNED NOT NULL DEFAULT 4 COMMENT 'Ticks between moves',
    wired_security      BOOLEAN NOT NULL DEFAULT FALSE,

    FOREIGN KEY fk_room_settings (room_id)
        REFERENCES rooms(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Room configuration settings';

-- Room Decoration: Visual customization
CREATE TABLE IF NOT EXISTS room_decoration (
    room_id             INT UNSIGNED PRIMARY KEY,

    -- Mood Light / Toner
    background_color    VARCHAR(7) NULL COMMENT 'Hex color',
    mood_light_data     JSON NULL COMMENT 'Mood light configuration',

    -- Audio
    jukebox_enabled     BOOLEAN NOT NULL DEFAULT FALSE,
    jukebox_volume      TINYINT UNSIGNED NOT NULL DEFAULT 50,

    -- Custom Model
    custom_heightmap    TEXT NULL COMMENT 'Override default heightmap',
    custom_door_x       TINYINT UNSIGNED NULL,
    custom_door_y       TINYINT UNSIGNED NULL,
    custom_door_dir     TINYINT UNSIGNED NULL,

    FOREIGN KEY fk_room_decoration (room_id)
        REFERENCES rooms(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Room visual decoration';

-- Room Models (Heightmaps)
CREATE TABLE IF NOT EXISTS room_models (
    name                VARCHAR(50) PRIMARY KEY,
    heightmap           TEXT NOT NULL,
    door_x              TINYINT UNSIGNED NOT NULL DEFAULT 0,
    door_y              TINYINT UNSIGNED NOT NULL DEFAULT 0,
    door_dir            TINYINT UNSIGNED NOT NULL DEFAULT 2,
    is_custom           BOOLEAN NOT NULL DEFAULT FALSE,
    is_club_only        BOOLEAN NOT NULL DEFAULT FALSE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Room floor models with heightmaps';

-- Room Rights
CREATE TABLE IF NOT EXISTS room_rights (
    room_id             INT UNSIGNED NOT NULL,
    user_id             INT UNSIGNED NOT NULL,

    PRIMARY KEY (room_id, user_id),
    FOREIGN KEY fk_rights_room (room_id)
        REFERENCES rooms(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_rights_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_user_rights (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Users with rights in rooms';

-- Room Bans
CREATE TABLE IF NOT EXISTS room_bans (
    room_id             INT UNSIGNED NOT NULL,
    user_id             INT UNSIGNED NOT NULL,
    banned_by_id        INT UNSIGNED NOT NULL,
    expires_at          TIMESTAMP NOT NULL,

    PRIMARY KEY (room_id, user_id),
    FOREIGN KEY fk_ban_room (room_id)
        REFERENCES rooms(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_ban_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_ban_by (banned_by_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_expires (expires_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Users banned from rooms';

-- Room Mutes
CREATE TABLE IF NOT EXISTS room_mutes (
    room_id             INT UNSIGNED NOT NULL,
    user_id             INT UNSIGNED NOT NULL,
    muted_by_id         INT UNSIGNED NOT NULL,
    expires_at          TIMESTAMP NOT NULL,

    PRIMARY KEY (room_id, user_id),
    FOREIGN KEY fk_mute_room (room_id)
        REFERENCES rooms(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_mute_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_mute_by (muted_by_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Users muted in rooms';

-- ============================================================================
-- ITEMS: Catalog & Furniture
-- ============================================================================

-- Item Definitions (Catalog base items)
CREATE TABLE IF NOT EXISTS item_definitions (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    sprite_id           INT UNSIGNED NOT NULL,
    item_name           VARCHAR(100) NOT NULL,
    public_name         VARCHAR(100) NOT NULL,
    type                ENUM('s', 'i', 'e', 'b', 'r', 'p') NOT NULL DEFAULT 's' COMMENT 's=floor, i=wall, e=effect, b=badge, r=robot, p=pet',
    width               TINYINT UNSIGNED NOT NULL DEFAULT 1,
    length              TINYINT UNSIGNED NOT NULL DEFAULT 1,
    height              DECIMAL(5,2) NOT NULL DEFAULT 0.00,
    stack_height        DECIMAL(5,2) NOT NULL DEFAULT 0.00,
    can_stack           BOOLEAN NOT NULL DEFAULT TRUE,
    can_sit             BOOLEAN NOT NULL DEFAULT FALSE,
    is_walkable         BOOLEAN NOT NULL DEFAULT FALSE,
    can_lay             BOOLEAN NOT NULL DEFAULT FALSE,
    can_recycle         BOOLEAN NOT NULL DEFAULT TRUE,
    can_trade           BOOLEAN NOT NULL DEFAULT TRUE,
    can_sell            BOOLEAN NOT NULL DEFAULT TRUE,
    can_gift            BOOLEAN NOT NULL DEFAULT TRUE,
    can_inventory_stack BOOLEAN NOT NULL DEFAULT TRUE,
    interaction_type    VARCHAR(50) NOT NULL DEFAULT 'default',
    interaction_modes   TINYINT UNSIGNED NOT NULL DEFAULT 1,
    vending_ids         VARCHAR(255) NULL COMMENT 'Comma-separated item IDs',
    effect_id           INT UNSIGNED NULL,
    wired_id            INT UNSIGNED NULL,
    is_rare             BOOLEAN NOT NULL DEFAULT FALSE,
    clothing_on_walk    VARCHAR(255) NULL,

    INDEX idx_sprite (sprite_id),
    INDEX idx_type (type),
    INDEX idx_name (item_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Base item definitions from catalog';

-- User Items (Inventory + Placed)
CREATE TABLE IF NOT EXISTS items (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    owner_id            INT UNSIGNED NOT NULL,
    definition_id       INT UNSIGNED NOT NULL,
    room_id             INT UNSIGNED NULL COMMENT 'NULL = in inventory',

    -- Position (only if in room)
    x                   SMALLINT NULL,
    y                   SMALLINT NULL,
    z                   DECIMAL(10,6) NULL,
    rotation            TINYINT UNSIGNED NOT NULL DEFAULT 0,
    wall_pos            VARCHAR(50) NULL COMMENT 'Wall items position string',

    -- State
    extra_data          JSON NULL COMMENT 'JSON extra data',
    limited_number      INT UNSIGNED NULL,
    limited_stack       INT UNSIGNED NULL,

    -- Gift data
    gift_sender_id      INT UNSIGNED NULL,
    gift_message        VARCHAR(255) NULL,
    gift_sprite_id      INT UNSIGNED NULL,
    gift_color          INT UNSIGNED NULL,
    gift_ribbon         INT UNSIGNED NULL,
    gift_show_name      BOOLEAN NOT NULL DEFAULT TRUE,

    -- Timestamps
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY fk_item_owner (owner_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_item_definition (definition_id)
        REFERENCES item_definitions(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_item_room (room_id)
        REFERENCES rooms(id) ON DELETE SET NULL ON UPDATE CASCADE,
    FOREIGN KEY fk_item_gift_sender (gift_sender_id)
        REFERENCES users(id) ON DELETE SET NULL ON UPDATE CASCADE,
    INDEX idx_owner_room (owner_id, room_id),
    INDEX idx_room (room_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='User-owned items (inventory and placed)';

-- ============================================================================
-- CATALOG: Shop System
-- ============================================================================

-- Catalog Pages
CREATE TABLE IF NOT EXISTS catalog_pages (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    parent_id           INT UNSIGNED NULL,
    name                VARCHAR(100) NOT NULL,
    caption             VARCHAR(100) NOT NULL,
    icon_image          INT NOT NULL DEFAULT 1,
    page_layout         VARCHAR(50) NOT NULL DEFAULT 'default_3x3',
    min_rank            TINYINT UNSIGNED NOT NULL DEFAULT 1,
    is_visible          BOOLEAN NOT NULL DEFAULT TRUE,
    is_enabled          BOOLEAN NOT NULL DEFAULT TRUE,
    is_club_only        BOOLEAN NOT NULL DEFAULT FALSE,
    order_num           INT NOT NULL DEFAULT 0,

    -- Page content
    header_image        VARCHAR(100) NULL,
    teaser_image        VARCHAR(100) NULL,
    special_image       VARCHAR(100) NULL,
    page_text_1         TEXT NULL,
    page_text_2         TEXT NULL,
    page_text_details   TEXT NULL,

    FOREIGN KEY fk_page_parent (parent_id)
        REFERENCES catalog_pages(id) ON DELETE SET NULL ON UPDATE CASCADE,
    INDEX idx_parent (parent_id),
    INDEX idx_order (order_num)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Catalog navigation pages';

-- Catalog Items (Products)
CREATE TABLE IF NOT EXISTS catalog_items (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    page_id             INT UNSIGNED NOT NULL,
    definition_id       INT UNSIGNED NOT NULL,
    catalog_name        VARCHAR(100) NOT NULL,
    cost_credits        INT UNSIGNED NOT NULL DEFAULT 0,
    cost_pixels         INT UNSIGNED NOT NULL DEFAULT 0,
    cost_diamonds       INT UNSIGNED NOT NULL DEFAULT 0,
    amount              SMALLINT UNSIGNED NOT NULL DEFAULT 1,
    is_limited          BOOLEAN NOT NULL DEFAULT FALSE,
    limited_total       INT UNSIGNED NOT NULL DEFAULT 0,
    limited_sold        INT UNSIGNED NOT NULL DEFAULT 0,
    is_club_only        BOOLEAN NOT NULL DEFAULT FALSE,
    is_offer            BOOLEAN NOT NULL DEFAULT FALSE,
    offer_id            INT UNSIGNED NULL,
    order_num           INT NOT NULL DEFAULT 0,

    FOREIGN KEY fk_catalog_page (page_id)
        REFERENCES catalog_pages(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_catalog_definition (definition_id)
        REFERENCES item_definitions(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_page (page_id),
    INDEX idx_order (order_num)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Catalog purchasable items';

-- ============================================================================
-- BADGES: Achievement & Collection
-- ============================================================================

-- Badge Definitions
CREATE TABLE IF NOT EXISTS badge_definitions (
    code                VARCHAR(50) PRIMARY KEY,
    is_rare             BOOLEAN NOT NULL DEFAULT FALSE,
    description         VARCHAR(255) NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Available badge codes';

-- User Badges
CREATE TABLE IF NOT EXISTS user_badges (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    user_id             INT UNSIGNED NOT NULL,
    badge_code          VARCHAR(50) NOT NULL,
    slot                TINYINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '0=not worn, 1-5=slot position',
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    UNIQUE INDEX uq_user_badge (user_id, badge_code),
    FOREIGN KEY fk_badge_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_slot (user_id, slot)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='User badge collection';

-- ============================================================================
-- FAVORITES: User Preferences
-- ============================================================================

-- Favorite Rooms
CREATE TABLE IF NOT EXISTS user_favorite_rooms (
    user_id             INT UNSIGNED NOT NULL,
    room_id             INT UNSIGNED NOT NULL,
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    PRIMARY KEY (user_id, room_id),
    FOREIGN KEY fk_fav_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_fav_room (room_id)
        REFERENCES rooms(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='User favorite rooms';

-- User Wardrobe (Saved Looks)
CREATE TABLE IF NOT EXISTS user_wardrobe (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    user_id             INT UNSIGNED NOT NULL,
    slot                TINYINT UNSIGNED NOT NULL,
    figure              VARCHAR(255) NOT NULL,
    gender              ENUM('M', 'F') NOT NULL,

    UNIQUE INDEX uq_user_slot (user_id, slot),
    FOREIGN KEY fk_wardrobe_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Saved outfit slots';

-- ============================================================================
-- MODERATION: Logs & Bans
-- ============================================================================

-- Global Bans
CREATE TABLE IF NOT EXISTS bans (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    user_id             INT UNSIGNED NULL,
    ip_address          VARCHAR(45) NULL,
    machine_id          VARCHAR(255) NULL,
    reason              VARCHAR(255) NOT NULL,
    banned_by_id        INT UNSIGNED NOT NULL,
    ban_type            ENUM('user', 'ip', 'machine', 'super') NOT NULL,
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    expires_at          TIMESTAMP NULL COMMENT 'NULL = permanent',

    FOREIGN KEY fk_ban_user2 (user_id)
        REFERENCES users(id) ON DELETE SET NULL ON UPDATE CASCADE,
    FOREIGN KEY fk_ban_by2 (banned_by_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_user (user_id),
    INDEX idx_ip (ip_address),
    INDEX idx_machine (machine_id),
    INDEX idx_expires2 (expires_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Global bans (user, IP, machine)';

-- Moderation Logs
CREATE TABLE IF NOT EXISTS mod_logs (
    id                  INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    staff_id            INT UNSIGNED NOT NULL,
    target_user_id      INT UNSIGNED NULL,
    target_room_id      INT UNSIGNED NULL,
    action              VARCHAR(50) NOT NULL,
    details             TEXT NULL,
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY fk_mod_staff (staff_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_mod_target_user (target_user_id)
        REFERENCES users(id) ON DELETE SET NULL ON UPDATE CASCADE,
    FOREIGN KEY fk_mod_target_room (target_room_id)
        REFERENCES rooms(id) ON DELETE SET NULL ON UPDATE CASCADE,
    INDEX idx_staff (staff_id),
    INDEX idx_target_user (target_user_id),
    INDEX idx_created (created_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Moderation action logs';

-- Chat Logs
CREATE TABLE IF NOT EXISTS chat_logs (
    id                  BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    user_id             INT UNSIGNED NOT NULL,
    room_id             INT UNSIGNED NOT NULL,
    message             VARCHAR(500) NOT NULL,
    chat_type           ENUM('say', 'shout', 'whisper') NOT NULL DEFAULT 'say',
    created_at          TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY fk_chat_user (user_id)
        REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY fk_chat_room (room_id)
        REFERENCES rooms(id) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX idx_room_time (room_id, created_at),
    INDEX idx_user_time (user_id, created_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Room chat logs for moderation';

-- ============================================================================
-- EMULATOR: Settings & Configuration
-- ============================================================================

CREATE TABLE IF NOT EXISTS emulator_settings (
    `key`               VARCHAR(100) PRIMARY KEY,
    `value`             TEXT NOT NULL,
    description         VARCHAR(255) NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Server configuration settings';

CREATE TABLE IF NOT EXISTS emulator_texts (
    `key`               VARCHAR(100) PRIMARY KEY,
    `value`             TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci
COMMENT='Server text/localization strings';

SET FOREIGN_KEY_CHECKS = 1;

-- ============================================================================
-- END OF SCHEMA
-- ============================================================================
