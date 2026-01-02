package com.nova.infra.adapter.in.network.packets.headers;

/**
 * Constants for outgoing packet Header IDs.
 * <p>
 * These IDs correspond to packets sent BY the server TO the client.
 * Migrated from Nitro IncomingHeader.ts
 */
public final class Outgoing {

    private Outgoing() {
        // Utility class
    }

    // === Achievement ===
    public static final int ACHIEVEMENT_LIST = 305;
    public static final int ACHIEVEMENT_PROGRESSED = 2107;
    public static final int ACHIEVEMENT_NOTIFICATION = 806;
    public static final int ACHIEVEMENTRESOLUTIONCOMPLETED = 740;
    public static final int ACHIEVEMENTRESOLUTIONPROGRESS = 3370;
    public static final int ACHIEVEMENTRESOLUTIONS = 66;
    public static final int USER_ACHIEVEMENT_SCORE = 1968;

    // === Advertisement ===
    public static final int INTERSTITIAL_MESSAGE = 1808;
    public static final int ROOM_AD_ERROR = 1759;

    // === Authentication ===
    public static final int AUTHENTICATED = 2491;
    public static final int AUTHENTICATION = -1;

    // === Availability ===
    public static final int AVAILABILITY_STATUS = 2033;
    public static final int AVAILABILITY_TIME = 600;
    public static final int HOTEL_CLOSED_AND_OPENS = 3728;
    public static final int HOTEL_CLOSES_AND_OPENS_AT = 2771;
    public static final int HOTEL_WILL_CLOSE_MINUTES = 1050;
    public static final int HOTEL_MAINTENANCE = 1350;

    // === Badge ===
    public static final int BADGE_POINT_LIMITS = 2501;
    public static final int BADGE_REQUEST_FULFILLED = 2998;

    // === Bot ===
    public static final int BOT_COMMAND_CONFIGURATION = 1618;
    public static final int BOT_SKILL_LIST_UPDATE = 69;
    public static final int BOT_FORCE_OPEN_CONTEXT_MENU = 296;
    public static final int BOT_ERROR = 639;
    public static final int BOT_RECEIVED = 3684;
    public static final int USER_BOT_REMOVE = 233;
    public static final int USER_BOTS = 3086;
    public static final int REMOVE_BOT_FROM_INVENTORY = 233;
    public static final int ADD_BOT_TO_INVENTORY = 1352;

    // === Builders Club ===
    public static final int BUILDERS_CLUB_EXPIRED = 1452;
    public static final int BUILDERS_CLUB_FURNI_COUNT = 3828;
    public static final int BUILDERS_CLUB_SUBSCRIPTION = 1452;

    // === Call For Help ===
    public static final int CFH_RESULT_MESSAGE = 3635;
    public static final int CFH_SANCTION = 2782;
    public static final int CFH_TOPICS = 325;
    public static final int CFH_SANCTION_STATUS = 2221;
    public static final int CFH_DISABLED_NOTIFY = 1651;
    public static final int CFH_PENDING_CALLS = 1121;
    public static final int CFH_PENDING_CALLS_DELETED = 77;
    public static final int CFH_REPLY = 3796;
    public static final int CFH_CHATLOG = 607;

    // === Camera ===
    public static final int CAMERA_PUBLISH_STATUS = 2057;
    public static final int CAMERA_PURCHASE_OK = 2783;
    public static final int CAMERA_STORAGE_URL = 3696;
    public static final int CAMERA_SNAPSHOT = 463;
    public static final int INIT_CAMERA = 3878;
    public static final int THUMBNAIL_STATUS = 3595;
    public static final int THUMBNAIL_UPDATE_RESULT = 1927;

    // === Campaign / Calendar ===
    public static final int CAMPAIGN_CALENDAR_DATA = 2531;
    public static final int CAMPAIGN_CALENDAR_DOOR_OPENED = 2551;
    public static final int DESKTOP_CAMPAIGN = 1745;

    // === Catalog ===
    public static final int CATALOG_PAGE = 804;
    public static final int CATALOG_PAGE_LIST = 1032;
    public static final int CATALOG_PURCHASE_OK = 869;
    public static final int CATALOG_PURCHASE_ERROR = 1404;
    public static final int CATALOG_PURCHASE_NOT_ALLOWED = 3770;
    public static final int CATALOG_PUBLISHED = 1866;
    public static final int CATALOG_RECEIVE_PET_BREEDS = 3331;
    public static final int CATALOG_APPROVE_NAME_RESULT = 1503;
    public static final int CATALOG_PAGE_EXPIRATION = 2668;
    public static final int CATALOG_EARLIEST_EXPIRY = 2515;
    public static final int PRODUCT_OFFER = 3388;
    public static final int LIMITED_SOLD_OUT = 377;
    public static final int CLUB_OFFERS = 2405;
    public static final int CLUB_GIFT_INFO = 619;
    public static final int CLUB_GIFT_SELECTED = 659;
    public static final int CLUB_GIFT_NOTIFICATION = 2188;
    public static final int CLUB_EXTENDED_OFFER = 3964;
    public static final int BUNDLE_DISCOUNT_RULESET = 2347;
    public static final int GIFT_WRAPPER_CONFIG = 2234;
    public static final int GIFT_RECEIVER_NOT_FOUND = 1517;
    public static final int GIFT_OPENED = 56;
    public static final int REDEEM_VOUCHER_ERROR = 714;
    public static final int REDEEM_VOUCHER_OK = 3336;
    public static final int TARGET_OFFER_NOT_FOUND = 1237;
    public static final int TARGET_OFFER = 119;
    public static final int DIRECT_SMS_CLUB_BUY = 195;
    public static final int ROOM_AD_PURCHASE = 2468;
    public static final int NOT_ENOUGH_BALANCE = 3914;
    public static final int LIMITED_OFFER_APPEARING_NEXT = 44;
    public static final int IS_OFFER_GIFTABLE = 761;
    public static final int SEASONAL_CALENDAR_OFFER = 1889;
    public static final int BONUS_RARE_INFO = 1533;

    // === Chat Review ===
    public static final int CHAT_REVIEW_SESSION_DETACHED = 30;
    public static final int CHAT_REVIEW_SESSION_OFFERED_TO_GUIDE = 735;
    public static final int CHAT_REVIEW_SESSION_RESULTS = 3276;
    public static final int CHAT_REVIEW_SESSION_STARTED = 143;
    public static final int CHAT_REVIEW_SESSION_VOTING_STATUS = 1829;

    // === Client ===
    public static final int CLIENT_LATENCY = 10;
    public static final int CLIENT_PING = 3928;

    // === Community Goal ===
    public static final int COMMUNITY_GOAL_VOTE_EVENT = 1435;
    public static final int COMMUNITY_GOAL_EARNED_PRIZES = 3319;
    public static final int COMMUNITY_GOAL_PROGRESS = 2525;
    public static final int CONCURRENT_USERS_GOAL_PROGRESS = 2737;
    public static final int COMMUNITY_GOAL_HALL_OF_FAME = 3005;

    // === Competition ===
    public static final int COMPETITION_STATUS = 133;
    public static final int COMPETITION_ENTRY_SUBMIT = 1177;
    public static final int COMPETITION_VOTING_INFO = 3506;
    public static final int COMPETITION_TIMING_CODE = 1745;
    public static final int COMPETITION_USER_PART_OF = 3841;
    public static final int COMPETITION_NO_OWNED_ROOMS = 2064;
    public static final int COMPETITION_SECONDS_UNTIL = 3926;
    public static final int COMPETITION_ROOMS_DATA = 3954;

    // === Connection ===
    public static final int DISCONNECT_REASON = 4000;
    public static final int CONNECTION_ERROR = 1004;

    // === Crafting ===
    public static final int CRAFTABLE_PRODUCTS = 1000;
    public static final int CRAFTING_RECIPE = 2774;
    public static final int CRAFTING_RECIPES_AVAILABLE = 2124;
    public static final int CRAFTING_RESULT = 618;

    // === Desktop ===
    public static final int DESKTOP_NEWS = 286;
    public static final int DESKTOP_VIEW = 122;

    // === Email ===
    public static final int EMAIL_STATUS = 612;
    public static final int CHANGE_EMAIL_RESULT = 1815;
    public static final int WELCOME_GIFT_CHANGE_EMAIL_RESULT = 2293;
    public static final int WELCOME_GIFT_STATUS = 2707;

    // === First Login ===
    public static final int FIRST_LOGIN_OF_DAY = 793;

    // === Flood Control ===
    public static final int FLOOD_CONTROL = 566;
    public static final int REMAINING_MUTE = 826;

    // === Furniture ===
    public static final int FURNITURE_ALIASES = 1723;
    public static final int FURNITURE_DATA = 2547;
    public static final int FURNITURE_FLOOR = 1778;
    public static final int FURNITURE_FLOOR_ADD = 1534;
    public static final int FURNITURE_FLOOR_REMOVE = 2703;
    public static final int FURNITURE_FLOOR_UPDATE = 3776;
    public static final int FURNITURE_ITEMDATA = 2202;
    public static final int FURNITURE_STATE = 2376;
    public static final int FURNITURE_STATE_2 = 3431;
    public static final int FURNITURE_GROUP_CONTEXT_MENU_INFO = 3293;
    public static final int FURNITURE_POSTIT_STICKY_POLE_OPEN = 2366;
    public static final int OBJECTS_DATA_UPDATE = 1453;

    // === Game Center ===
    public static final int GAME_CENTER_ACHIEVEMENTS = 2265;
    public static final int GAME_CENTER_GAME_LIST = 222;
    public static final int GAME_CENTER_STATUS = 2893;
    public static final int GAME_CENTER_IN_ARENA_QUEUE = 872;
    public static final int GAME_CENTER_STOP_COUNTER = 3191;
    public static final int GAME_CENTER_USER_LEFT_GAME = 3138;
    public static final int GAME_CENTER_DIRECTORY_STATUS = 2246;
    public static final int GAME_CENTER_STARTING_GAME_FAILED = 2142;
    public static final int GAME_CENTER_JOINING_FAILED = 1730;
    public static final int GAMESTATUSMESSAGE = 3805;
    public static final int GAMEACHIEVEMENTS = 1689;
    public static final int GAMEINVITE = 904;
    public static final int JOININGQUEUEFAILED = 3035;
    public static final int JOINEDQUEUEMESSAGE = 2260;
    public static final int LEFTQUEUE = 1477;
    public static final int LOAD_GAME_URL = 2624;
    public static final int LOADGAME = 3654;
    public static final int UNLOADGAME = 1715;
    public static final int PLAYING_GAME = 448;
    public static final int WEEKLY_GAME_REWARD = 2641;
    public static final int WEEKLY_GAME_REWARD_WINNERS = 3097;
    public static final int WEEKLY_COMPETITIVE_LEADERBOARD = 3512;
    public static final int WEEKLY_COMPETITIVE_FRIENDS_LEADERBOARD = 3560;
    public static final int WEEKLY_GAME2_FRIENDS_LEADERBOARD = 2270;
    public static final int WEEKLY_GAME2_LEADERBOARD = 2196;

    // === Generic ===
    public static final int GENERIC_ALERT = 3801;
    public static final int GENERIC_ERROR = 1600;

    // === Group ===
    public static final int GROUP_BADGES = 2402;
    public static final int GROUP_CREATE_OPTIONS = 2159;
    public static final int GROUP_INFO = 1702;
    public static final int GROUP_LIST = 420;
    public static final int GROUP_MEMBER = 265;
    public static final int GROUP_MEMBERS = 1200;
    public static final int GROUP_MEMBERS_REFRESH = 2445;
    public static final int GROUP_MEMBER_REMOVE_CONFIRM = 1876;
    public static final int GROUP_PURCHASED = 2808;
    public static final int GROUP_SETTINGS = 3965;
    public static final int GROUP_BADGE_PARTS = 2238;
    public static final int GROUP_MEMBERSHIP_REQUESTED = 1180;
    public static final int GROUP_DETAILS_CHANGED = 1459;
    public static final int GROUP_HABBO_JOIN_FAILED = 762;
    public static final int GROUP_DEACTIVATE = 3129;
    public static final int GUILD_EDIT_FAILED = 3988;
    public static final int GUILD_MEMBER_MGMT_FAILED = 818;
    public static final int FAVORITE_GROUP_UDPATE = 3403;

    // === Group Forum ===
    public static final int GROUP_FORUM_DATA = 3011;
    public static final int GROUP_FORUM_LIST = 3001;
    public static final int GROUP_FORUM_THREADS = 1073;
    public static final int GROUP_FORUM_POST = 2049;
    public static final int GROUP_FORUM_POST_THREAD = 1862;
    public static final int GROUP_FORUM_THREAD_MESSAGES = 509;
    public static final int GROUP_FORUM_UNREAD_COUNT = 2379;
    public static final int GROUP_FORUM_UPDATE_MESSAGE = 324;
    public static final int GROUP_FORUM_UPDATE_THREAD = 2528;

    // === Guide ===
    public static final int GUIDE_ON_DUTY_STATUS = 1548;
    public static final int GUIDE_SESSION_ATTACHED = 1591;
    public static final int GUIDE_SESSION_DETACHED = 138;
    public static final int GUIDE_SESSION_ENDED = 1456;
    public static final int GUIDE_SESSION_ERROR = 673;
    public static final int GUIDE_SESSION_INVITED_TO_GUIDE_ROOM = 219;
    public static final int GUIDE_SESSION_MESSAGE = 841;
    public static final int GUIDE_SESSION_PARTNER_IS_TYPING = 1016;
    public static final int GUIDE_SESSION_REQUESTER_ROOM = 1847;
    public static final int GUIDE_SESSION_STARTED = 3209;
    public static final int GUIDE_TICKET_CREATION_RESULT = 3285;
    public static final int GUIDE_TICKET_RESOLUTION = 2674;
    public static final int GUIDE_REPORTING_STATUS = 3463;

    // === Handshake ===
    public static final int HANDSHAKE_INIT_DIFFIE = 1347;
    public static final int HANDSHAKE_COMPLETE_DIFFIE = 3885;
    public static final int HANDSHAKE_IDENTITY_ACCOUNT = 3523;
    public static final int SECURITY_MACHINE = 1488;

    // === Hotel Merge ===
    public static final int HOTEL_MERGE_NAME_CHANGE = 1663;

    // === In Client Link ===
    public static final int IN_CLIENT_LINK = 2023;

    // === Item / Wall ===
    public static final int ITEM_DIMMER_SETTINGS = 2710;
    public static final int ITEM_STACK_HELPER = 2816;
    public static final int ITEM_WALL = 1369;
    public static final int ITEM_WALL_ADD = 2187;
    public static final int ITEM_WALL_REMOVE = 3208;
    public static final int ITEM_WALL_UPDATE = 2009;

    // === Landing View ===
    public static final int PROMO_ARTICLES = 286;

    // === Lovelock ===
    public static final int LOVELOCK_FURNI_START = 3753;
    public static final int LOVELOCK_FURNI_FRIEND_COMFIRMED = 382;
    public static final int LOVELOCK_FURNI_FINISHED = 770;

    // === Marketplace ===
    public static final int MARKETPLACE_CONFIG = 1823;
    public static final int MARKETPLACE_SELL_ITEM = 54;
    public static final int MARKETPLACE_ITEM_STATS = 725;
    public static final int MARKETPLACE_OWN_ITEMS = 3884;
    public static final int MARKETPLACE_CANCEL_SALE = 3264;
    public static final int MARKETPLACE_ITEM_POSTED = 1359;
    public static final int MARKETPLACE_ITEMS_SEARCHED = 680;
    public static final int MARKETPLACE_AFTER_ORDER_STATUS = 2032;

    // === Messenger ===
    public static final int MESSENGER_ACCEPT_FRIENDS = 896;
    public static final int MESSENGER_CHAT = 1587;
    public static final int MESSENGER_FIND_FRIENDS = 1210;
    public static final int MESSENGER_FOLLOW_FAILED = 3048;
    public static final int MESSENGER_FRIEND_NOTIFICATION = 3082;
    public static final int MESSENGER_FRIENDS = 3130;
    public static final int MESSENGER_INIT = 1605;
    public static final int MESSENGER_INSTANCE_MESSAGE_ERROR = 3359;
    public static final int MESSENGER_INVITE = 3870;
    public static final int MESSENGER_INVITE_ERROR = 462;
    public static final int MESSENGER_MESSAGE_ERROR = 892;
    public static final int MESSENGER_MINIMAIL_COUNT = 2803;
    public static final int MESSENGER_MINIMAIL_NEW = 1911;
    public static final int MESSENGER_RELATIONSHIPS = 2016;
    public static final int MESSENGER_REQUEST = 2219;
    public static final int MESSENGER_REQUEST_ERROR = 892;
    public static final int MESSENGER_REQUESTS = 280;
    public static final int MESSENGER_SEARCH = 973;
    public static final int MESSENGER_UPDATE = 2800;

    // === Moderation ===
    public static final int MODERATOR_MESSAGE = 2030;
    public static final int MODERATION_REPORT_DISABLED = 1651;
    public static final int MODERATION_TOOL = 2696;
    public static final int MODERATION_USER_INFO = 2866;
    public static final int MODERATION_CAUTION = 1890;
    public static final int MODTOOL_ROOM_INFO = 1333;
    public static final int MODTOOL_USER_CHATLOG = 3377;
    public static final int MODTOOL_ROOM_CHATLOG = 3434;
    public static final int MODTOOL_VISITED_ROOMS_USER = 1752;
    public static final int MODERATOR_ACTION_RESULT = 2335;
    public static final int MODERATOR_TOOL_PREFERENCES = 1576;
    public static final int ISSUE_DELETED = 3192;
    public static final int ISSUE_INFO = 3609;
    public static final int ISSUE_PICK_FAILED = 3150;
    public static final int ISSUE_CLOSE_NOTIFICATION = 934;

    // === MOTD ===
    public static final int MOTD_MESSAGES = 2035;

    // === Mystery Box ===
    public static final int MYSTERY_BOX_KEYS = 2833;
    public static final int GOTMYSTERYBOXPRIZEMESSAGE = 3712;
    public static final int CANCELMYSTERYBOXWAITMESSAGE = 596;
    public static final int SHOWMYSTERYBOXWAITMESSAGE = 3201;

    // === Navigator ===
    public static final int NAVIGATOR_CATEGORIES = 1562;
    public static final int NAVIGATOR_COLLAPSED = 1543;
    public static final int NAVIGATOR_EVENT_CATEGORIES = 3244;
    public static final int NAVIGATOR_LIFTED = 3104;
    public static final int NAVIGATOR_METADATA = 3052;
    public static final int NAVIGATOR_OPEN_ROOM_CREATOR = 2064;
    public static final int NAVIGATOR_SEARCH = 2690;
    public static final int NAVIGATOR_SEARCHES = 3984;
    public static final int NAVIGATOR_SETTINGS = 518;
    public static final int CAN_CREATE_ROOM = 378;
    public static final int CATEGORIES_WITH_VISITOR_COUNT = 1455;
    public static final int CONVERTED_ROOM_ID = 1331;
    public static final int GUEST_ROOM_SEARCH_RESULT = 52;

    // === Noobness ===
    public static final int NOOBNESS_LEVEL = 3738;

    // === Notification ===
    public static final int NOTIFICATION_LIST = 1992;
    public static final int NOTIFICATION_OFFER_REWARD_DELIVERED = 2125;
    public static final int NOTIFICATION_SIMPLE_ALERT = 5100;
    public static final int NOTIFICATION_ELEMENT_POINTER = 1787;
    public static final int CUSTOM_USER_NOTIFICATION = 909;

    // === New User Experience ===
    public static final int NEW_USER_EXPERIENCE_GIFT_OFFER = 3575;
    public static final int NEW_USER_EXPERIENCE_NOT_COMPLETE = 3639;

    // === Pet ===
    public static final int PET_FIGURE_UPDATE = 1924;
    public static final int PET_INFO = 2901;
    public static final int PET_TRAINING_PANEL = 1164;
    public static final int PET_LEVEL_UPDATE = 2824;
    public static final int PET_SCRATCH_FAILED = 1130;
    public static final int PET_OPEN_PACKAGE_REQUESTED = 2380;
    public static final int PET_OPEN_PACKAGE_RESULT = 546;
    public static final int PET_BREEDING = 1746;
    public static final int PET_CONFIRM_BREEDING_RESULT = 1625;
    public static final int PET_GO_TO_BREEDING_NEST_FAILURE = 2621;
    public static final int PET_NEST_BREEDING_SUCCESS = 2527;
    public static final int PET_CONFIRM_BREEDING_REQUEST = 634;
    public static final int PET_BREEDING_RESULT = 1553;
    public static final int PET_EXPERIENCE = 2156;
    public static final int PET_PLACING_ERROR = 2913;
    public static final int PET_STATUS = 1907;
    public static final int PET_RESPECTED = 2788;
    public static final int PET_SUPPLEMENT = 3441;
    public static final int PET_LEVEL_NOTIFICATION = 859;
    public static final int PET_RECEIVED = 1111;

    // === Phone ===
    public static final int ACCOUNT_SAFETY_LOCK_STATUS_CHANGE = 1243;
    public static final int PHONE_COLLECTION_STATE = 2890;
    public static final int PHONE_TRY_NUMBER_RESULT = 800;
    public static final int PHONE_TRY_VERIFICATION_CODE_RESULT = 91;

    // === Poll ===
    public static final int QUESTION = 2665;
    public static final int POLL_CONTENTS = 2997;
    public static final int POLL_ERROR = 662;
    public static final int POLL_OFFER = 3785;
    public static final int POLL_ROOM_RESULT = 5201;
    public static final int POLL_START_ROOM = 5200;
    public static final int QUESTION_ANSWERED = 2589;
    public static final int QUESTION_FINISHED = 1066;

    // === Quest ===
    public static final int QUEST_DAILY = 1878;
    public static final int QUEST_CANCELLED = 3027;
    public static final int QUEST_COMPLETED = 949;
    public static final int EPIC_POPUP = 3945;
    public static final int SEASONAL_QUESTS = 1122;
    public static final int QUESTS = 3625;
    public static final int QUEST = 230;

    // === Quiz ===
    public static final int QUIZ_DATA = 2927;
    public static final int QUIZ_RESULTS = 2772;

    // === Recycler ===
    public static final int RECYCLER_PRIZES = 3164;
    public static final int RECYCLER_STATUS = 3433;
    public static final int RECYCLER_FINISHED = 468;

    // === Rentable Space ===
    public static final int RENTABLE_SPACE_RENT_OK = 2046;
    public static final int RENTABLE_SPACE_STATUS = 3559;
    public static final int RENTABLE_SPACE_RENT_FAILED = 1868;
    public static final int RENTABLE_FURNI_RENT_OR_BUYOUT_OFFER = 35;

    // === Restore ===
    public static final int RESTORE_CLIENT = 426;

    // === Room ===
    public static final int ROOM_BAN_LIST = 1869;
    public static final int ROOM_BAN_REMOVE = 3429;
    public static final int ROOM_CREATED = 1304;
    public static final int ROOM_DOORBELL = 2309;
    public static final int ROOM_DOORBELL_ACCEPTED = 3783;
    public static final int ROOM_DOORBELL_REJECTED = 878;
    public static final int ROOM_ENTER = 758;
    public static final int ROOM_ENTER_ERROR = 899;
    public static final int ROOM_FORWARD = 160;
    public static final int ROOM_HEIGHT_MAP = 2753;
    public static final int ROOM_HEIGHT_MAP_UPDATE = 558;
    public static final int ROOM_INFO = 687;
    public static final int ROOM_INFO_OWNER = 749;
    public static final int ROOM_MODEL = 1301;
    public static final int ROOM_MODEL_BLOCKED_TILES = 3990;
    public static final int ROOM_MODEL_DOOR = 1664;
    public static final int ROOM_MODEL_NAME = 2031;
    public static final int ROOM_MUTED = 2533;
    public static final int ROOM_MUTE_USER = 826;
    public static final int ROOM_PAINT = 2454;
    public static final int ROOM_PROMOTION = 2274;
    public static final int ROOM_QUEUE_STATUS = 2208;
    public static final int ROOM_RIGHTS = 780;
    public static final int ROOM_RIGHTS_CLEAR = 2392;
    public static final int ROOM_RIGHTS_LIST = 1284;
    public static final int ROOM_RIGHTS_LIST_ADD = 2088;
    public static final int ROOM_RIGHTS_LIST_REMOVE = 1327;
    public static final int ROOM_RIGHTS_OWNER = 339;
    public static final int ROOM_ROLLING = 3207;
    public static final int ROOM_SCORE = 482;
    public static final int ROOM_SETTINGS = 1498;
    public static final int ROOM_SETTINGS_CHAT = 1191;
    public static final int ROOM_SETTINGS_SAVE = 948;
    public static final int ROOM_SETTINGS_SAVE_ERROR = 1555;
    public static final int ROOM_INFO_UPDATED = 3297;
    public static final int ROOM_SPECTATOR = 1033;
    public static final int ROOM_THICKNESS = 3547;
    public static final int ROOM_GET_FILTER_WORDS = 2937;
    public static final int ROOM_MESSAGE_NOTIFICATION = 1634;
    public static final int ROOM_POPULAR_TAGS_RESULT = 2012;
    public static final int ROOM_SETTINGS_ERROR = 2897;
    public static final int SHOW_ENFORCE_ROOM_CATEGORY = 3896;
    public static final int NO_SUCH_FLAT = 84;
    public static final int INFO_FEED_ENABLE = 3284;
    public static final int CAN_CREATE_ROOM_EVENT = 2599;

    // === Room Event ===
    public static final int ROOM_EVENT_CANCEL = 3479;
    public static final int ROOM_EVENT = 1840;

    // === SCR ===
    public static final int SCR_SEND_KICKBACK_INFO = 3277;

    // === Sound / Jukebox ===
    public static final int JUKEBOX_PLAYLIST_FULL = 105;
    public static final int JUKEBOX_SONG_DISKS = 34;
    public static final int NOW_PLAYING = 469;
    public static final int OFFICIAL_SONG_ID = 1381;
    public static final int PLAYLIST = 1748;
    public static final int PLAYLIST_SONG_ADDED = 1140;
    public static final int TRAX_SONG_INFO = 3365;
    public static final int USER_SONG_DISKS_INVENTORY = 2602;

    // === Talent ===
    public static final int HELPER_TALENT_TRACK = 3406;
    public static final int TALENT_TRACK_LEVEL = 1203;
    public static final int TALENT_TRACK_LEVEL_UP = 638;

    // === Trade ===
    public static final int TRADE_ACCEPTED = 2568;
    public static final int TRADE_CLOSED = 1373;
    public static final int TRADE_COMPLETED = 1001;
    public static final int TRADE_CONFIRMATION = 2720;
    public static final int TRADE_LIST_ITEM = 2024;
    public static final int TRADE_NOT_OPEN = 3128;
    public static final int TRADE_OPEN = 2505;
    public static final int TRADE_OPEN_FAILED = 217;
    public static final int TRADE_OTHER_NOT_ALLOWED = 1254;
    public static final int TRADE_YOU_NOT_ALLOWED = 3058;
    public static final int TRADE_NO_SUCH_ITEM = 2873;

    // === Unit ===
    public static final int UNIT = 374;
    public static final int UNIT_CHANGE_NAME = 2182;
    public static final int UNIT_CHAT = 1446;
    public static final int UNIT_CHAT_SHOUT = 1036;
    public static final int UNIT_CHAT_WHISPER = 2704;
    public static final int UNIT_DANCE = 2233;
    public static final int UNIT_EFFECT = 1167;
    public static final int UNIT_EXPRESSION = 1631;
    public static final int UNIT_HAND_ITEM = 1474;
    public static final int UNIT_IDLE = 1797;
    public static final int UNIT_INFO = 3920;
    public static final int UNIT_NUMBER = 2324;
    public static final int UNIT_REMOVE = 2661;
    public static final int UNIT_STATUS = 1640;
    public static final int UNIT_TYPING = 1717;
    public static final int HAND_ITEM_RECEIVED = 354;

    // === Unseen Items ===
    public static final int UNSEEN_ITEMS = 2103;

    // === User ===
    public static final int USER_BADGES = 717;
    public static final int USER_BADGES_ADD = 2493;
    public static final int USER_BADGES_CURRENT = 1087;
    public static final int USER_CHANGE_NAME = 118;
    public static final int USER_CLOTHING = 1450;
    public static final int USER_CREDITS = 3475;
    public static final int USER_CURRENCY = 2018;
    public static final int ACTIVITY_POINT_NOTIFICATION = 2275;
    public static final int USER_EFFECTS = 340;
    public static final int USER_EFFECT_LIST = 340;
    public static final int USER_EFFECT_LIST_ADD = 2867;
    public static final int USER_EFFECT_LIST_REMOVE = 2228;
    public static final int USER_EFFECT_ACTIVATE = 1959;
    public static final int AVATAR_EFFECT_SELECTED = 3473;
    public static final int USER_FAVORITE_ROOM = 2524;
    public static final int USER_FAVORITE_ROOM_COUNT = 151;
    public static final int USER_FIGURE = 2429;
    public static final int USER_FURNITURE = 994;
    public static final int USER_FURNITURE_ADD = 104;
    public static final int USER_FURNITURE_POSTIT_PLACED = 1501;
    public static final int USER_FURNITURE_REFRESH = 3151;
    public static final int USER_FURNITURE_REMOVE = 159;
    public static final int USER_HOME_ROOM = 2875;
    public static final int USER_IGNORED = 126;
    public static final int USER_IGNORED_RESULT = 207;
    public static final int USER_INFO = 2725;
    public static final int USER_OUTFITS = 3315;
    public static final int USER_PERKS = 2586;
    public static final int USER_PERMISSIONS = 411;
    public static final int USER_PET_ADD = 2101;
    public static final int USER_PET_REMOVE = 3253;
    public static final int USER_PETS = 3522;
    public static final int USER_PROFILE = 3898;
    public static final int USER_RESPECT = 2815;
    public static final int USER_SANCTION_STATUS = 3679;
    public static final int USER_SETTINGS = 513;
    public static final int USER_SUBSCRIPTION = 954;
    public static final int USER_WARDROBE_PAGE = 3315;
    public static final int USER_BANNED = 1683;
    public static final int CHECK_USER_NAME = 563;
    public static final int GET_USER_TAGS = 1255;
    public static final int EXTENDED_PROFILE_CHANGED = 876;

    // === User Classification ===
    public static final int USER_CLASSIFICATION = 966;

    // === Wired ===
    public static final int WIRED_ACTION = 1434;
    public static final int WIRED_CONDITION = 1108;
    public static final int WIRED_ERROR = 156;
    public static final int WIRED_OPEN = 1830;
    public static final int WIRED_REWARD = 178;
    public static final int WIRED_SAVE = 1155;
    public static final int WIRED_TRIGGER = 383;

    // === YouTube ===
    public static final int YOUTUBE_CONTROL_VIDEO = 1554;
    public static final int YOUTUBE_DISPLAY_PLAYLISTS = 1112;
    public static final int YOUTUBE_DISPLAY_VIDEO = 1411;

    // === Firework ===
    public static final int FIREWORK_CHARGE_DATA = 5210;
}
