package com.nova.infra.adapter.network.packets.headers;

/**
 * Constants for incoming packet Header IDs.
 * <p>
 * These IDs correspond to packets sent BY the client TO the server.
 * Migrated from Nitro OutgoingHeader.ts
 */
public final class Incoming {

    private Incoming() {
        // Utility class
    }

    // === Achievement ===
    public static final int ACHIEVEMENT_LIST = 219;

    // === Authentication ===
    public static final int AUTHENTICATION = -1;

    // === Bot ===
    public static final int BOT_CONFIGURATION = 1986;
    public static final int BOT_PICKUP = 3323;
    public static final int BOT_PLACE = 1592;
    public static final int BOT_SKILL_SAVE = 2624;

    // === Catalog ===
    public static final int GET_CLUB_OFFERS = 3285;
    public static final int GET_CLUB_GIFT_INFO = 487;
    public static final int GET_CATALOG_INDEX = 1195;
    public static final int GET_CATALOG_PAGE = 412;
    public static final int CATALOG_PURCHASE = 3492;
    public static final int CATALOG_PURCHASE_GIFT = 1411;
    public static final int GET_PRODUCT_OFFER = 2594;
    public static final int CATALOG_REDEEM_VOUCHER = 339;
    public static final int CATALOG_SELECT_VIP_GIFT = 2276;
    public static final int CATALOG_REQUESET_PET_BREEDS = 1756;
    public static final int APPROVE_NAME = 2109;
    public static final int GET_GIFT_WRAPPING_CONFIG = 418;
    public static final int GET_CATALOG_PAGE_EXPIRATION = 742;
    public static final int GET_CATALOG_PAGE_WITH_EARLIEST_EXP = 3135;
    public static final int GET_DIRECT_CLUB_BUY_AVAILABLE = 801;
    public static final int GET_HABBO_BASIC_MEMBERSHIP_EXTEND_OFFER = 603;
    public static final int GET_HABBO_CLUB_EXTEND_OFFER = 2462;
    public static final int GET_IS_OFFER_GIFTABLE = 1347;
    public static final int GET_LIMITED_OFFER_APPEARING_NEXT = 410;
    public static final int GET_NEXT_TARGETED_OFFER = 596;
    public static final int GET_ROOM_AD_PURCHASE_INFO = 1075;
    public static final int GET_SEASONAL_CALENDAR_DAILY_OFFER = 3257;
    public static final int GET_TARGETED_OFFER = 2487;
    public static final int MARK_CATALOG_NEW_ADDITIONS_PAGE_OPENED = 2150;
    public static final int PURCHASE_BASIC_MEMBERSHIP_EXTENSION = 2735;
    public static final int PURCHASE_ROOM_AD = 777;
    public static final int PURCHASE_TARGETED_OFFER = 1826;
    public static final int PURCHASE_VIP_MEMBERSHIP_EXTENSION = 3407;
    public static final int ROOM_AD_PURCHASE_INITIATED = 2283;
    public static final int SET_TARGETTED_OFFER_STATE = 2041;
    public static final int SHOP_TARGETED_OFFER_VIEWED = 3483;

    // === Client ===
    public static final int CLIENT_LATENCY = 295;
    public static final int CLIENT_LATENCY_MEASURE = 96;
    public static final int CLIENT_POLICY = 26979;
    public static final int CLIENT_PONG = 2596;
    public static final int CLIENT_TOOLBAR_TOGGLE = 2313;
    public static final int CLIENT_VARIABLES = 1053;
    public static final int RELEASE_VERSION = 4000;
    public static final int DISCONNECT = 2445;

    // === Competition ===
    public static final int GET_CURRENT_TIMING_CODE = 2912;
    public static final int FORWARD_TO_A_COMPETITION_ROOM = 172;
    public static final int FORWARD_TO_A_SUBMITTABLE_ROOM = 1450;
    public static final int FORWARD_TO_RANDOM_COMPETITION_ROOM = 865;
    public static final int GET_IS_USER_PART_OF_COMPETITION = 2077;
    public static final int GET_SECONDS_UNTIL = 271;
    public static final int ROOM_COMPETITION_INIT = 1334;
    public static final int SUBMIT_ROOM_TO_COMPETITION = 2595;
    public static final int VOTE_FOR_ROOM = 143;

    // === Crafting ===
    public static final int CRAFT = 3591;
    public static final int CRAFT_SECRET = 1251;
    public static final int GET_CRAFTABLE_PRODUCTS = 633;
    public static final int GET_CRAFTING_RECIPE = 1173;
    public static final int GET_CRAFTING_RECIPES_AVAILABLE = 3086;

    // === Desktop ===
    public static final int DESKTOP_NEWS = 1827;
    public static final int DESKTOP_VIEW = 105;
    public static final int GET_BUNDLE_DISCOUNT_RULESET = 223;

    // === Event Tracker ===
    public static final int EVENT_TRACKER = 3457;

    // === Friend Furni ===
    public static final int FRIEND_FURNI_CONFIRM_LOCK = 3775;

    // === Friendlist / Messenger ===
    public static final int FIND_NEW_FRIENDS = 516;
    public static final int ACCEPT_FRIEND = 137;
    public static final int MESSENGER_CHAT = 3567;
    public static final int DECLINE_FRIEND = 2890;
    public static final int FOLLOW_FRIEND = 3997;
    public static final int MESSENGER_FRIENDS = 1523;
    public static final int MESSENGER_INIT = 2781;
    public static final int MESSENGER_RELATIONSHIPS = 2138;
    public static final int SET_RELATIONSHIP_STATUS = 3768;
    public static final int REMOVE_FRIEND = 1689;
    public static final int REQUEST_FRIEND = 3157;
    public static final int GET_FRIEND_REQUESTS = 2448;
    public static final int SEND_ROOM_INVITE = 1276;
    public static final int HABBO_SEARCH = 1210;
    public static final int FRIEND_LIST_UPDATE = 1419;

    // === Furniture ===
    public static final int FURNITURE_ALIASES = 3898;
    public static final int FURNITURE_FLOOR_UPDATE = 248;
    public static final int FURNITURE_MULTISTATE = 99;
    public static final int FURNITURE_PICKUP = 3456;
    public static final int FURNITURE_PLACE = 1258;
    public static final int FURNITURE_POSTIT_PLACE = 2248;
    public static final int FURNITURE_POSTIT_SAVE_STICKY_POLE = 3283;
    public static final int FURNITURE_RANDOMSTATE = 3617;
    public static final int FURNITURE_WALL_MULTISTATE = 210;
    public static final int FURNITURE_WALL_UPDATE = 168;
    public static final int FURNITURE_GROUP_INFO = 2651;
    public static final int GET_ITEM_DATA = 3964;
    public static final int ONE_WAY_DOOR_CLICK = 2765;
    public static final int REMOVE_WALL_ITEM = 3336;
    public static final int SET_ITEM_DATA = 3666;
    public static final int SET_OBJECT_DATA = 3608;

    // === Game ===
    public static final int GAMES_INIT = 2914;
    public static final int GAMES_LIST = 741;
    public static final int ACCEPTGAMEINVITE = 3802;
    public static final int GAMEUNLOADEDMESSAGE = 3207;
    public static final int GETGAMEACHIEVEMENTSMESSAGE = 2399;
    public static final int GETGAMESTATUSMESSAGE = 3171;
    public static final int GETUSERGAMEACHIEVEMENTSMESSAGE = 389;
    public static final int JOINQUEUEMESSAGE = 1458;
    public static final int LEAVEQUEUEMESSAGE = 2384;
    public static final int RESETRESOLUTIONACHIEVEMENTMESSAGE = 3144;
    public static final int GETWEEKLYGAMEREWARDWINNERS = 1054;
    public static final int GAME2GETACCOUNTGAMESTATUSMESSAGE = 11;
    public static final int GAME2CHECKGAMEDIRECTORYSTATUSMESSAGE = 3259;
    public static final int GAME2EXITGAMEMESSAGE = 1445;
    public static final int GAME2GAMECHATMESSAGE = 2502;
    public static final int GAME2LOADSTAGEREADYMESSAGE = 2415;
    public static final int GAME2PLAYAGAINMESSAGE = 3196;
    public static final int GAME2REQUESTFULLSTATUSUPDATEMESSAGE = 1598;
    public static final int GAME2GETWEEKLYFRIENDSLEADERBOARD = 1232;
    public static final int GAME2GETWEEKLYLEADERBOARD = 2565;

    // === Gifts ===
    public static final int GET_GIFT = 2436;
    public static final int RESET_PHONE_NUMBER_STATE = 2741;
    public static final int SET_PHONE_NUMBER_VERIFICATION_STATUS = 1379;
    public static final int TRY_PHONE_NUMBER = 790;
    public static final int VERIFY_CODE = 2721;

    // === Group ===
    public static final int GROUP_ADMIN_ADD = 2894;
    public static final int GROUP_ADMIN_REMOVE = 722;
    public static final int GROUP_CREATE_OPTIONS = 798;
    public static final int GROUP_FAVORITE = 3549;
    public static final int GROUP_UNFAVORITE = 1820;
    public static final int GROUP_INFO = 2991;
    public static final int GROUP_DELETE = 1134;
    public static final int GROUP_MEMBER_REMOVE_CONFIRM = 3593;
    public static final int GROUP_MEMBER_REMOVE = 593;
    public static final int GROUP_MEMBERS = 312;
    public static final int GROUP_MEMBERSHIPS = 367;
    public static final int GROUP_REQUEST = 998;
    public static final int GROUP_REQUEST_ACCEPT = 3386;
    public static final int GROUP_REQUEST_DECLINE = 1894;
    public static final int GROUP_SETTINGS = 1004;
    public static final int GROUP_PARTS = 813;
    public static final int GROUP_BUY = 230;
    public static final int GROUP_SAVE_INFORMATION = 3137;
    public static final int GROUP_SAVE_BADGE = 1991;
    public static final int GROUP_SAVE_COLORS = 1764;
    public static final int GROUP_SAVE_PREFERENCES = 3435;
    public static final int GROUP_BADGES = 21;
    public static final int GROUP_UNBLOCK_MEMBER = 2864;
    public static final int GET_BADGE_POINTS_LIMITS = 1371;
    public static final int REQUESTABADGE = 3077;
    public static final int GETISBADGEREQUESTFULFILLED = 1364;
    public static final int APPROVE_ALL_MEMBERSHIP_REQUESTS = 882;

    // === Group Forums ===
    public static final int GET_FORUM_STATS = 3149;
    public static final int GET_FORUM_THREADS = 873;
    public static final int GET_FORUMS_LIST = 436;
    public static final int GET_FORUM_MESSAGES = 232;
    public static final int GET_FORUM_THREAD = 3900;
    public static final int GET_UNREAD_FORUMS_COUNT = 2908;
    public static final int FORUM_MODERATE_MESSAGE = 286;
    public static final int FORUM_MODERATE_THREAD = 1397;
    public static final int FORUM_POST_MESSAGE = 3529;
    public static final int UPDATE_FORUM_READ_MARKER = 1855;
    public static final int UPDATE_FORUM_SETTINGS = 2214;
    public static final int FORUM_UPDATE_THREAD = 3045;

    // === Handshake ===
    public static final int HANDSHAKE_INIT_DIFFIE = 3110;
    public static final int HANDSHAKE_COMPLETE_DIFFIE = 773;

    // === Help / Call for Help ===
    public static final int CALL_FOR_HELP = 1691;
    public static final int CALL_FOR_HELP_FROM_FORUM_MESSAGE = 1412;
    public static final int CALL_FOR_HELP_FROM_FORUM_THREAD = 534;
    public static final int CALL_FOR_HELP_FROM_IM = 2950;
    public static final int CALL_FOR_HELP_FROM_PHOTO = 2492;
    public static final int CALL_FOR_HELP_FROM_SELFIE = 2755;
    public static final int CHAT_REVIEW_GUIDE_DECIDES = 3365;
    public static final int CHAT_REVIEW_GUIDE_DETACHED = 2501;
    public static final int CHAT_REVIEW_GUIDE_VOTE = 3961;
    public static final int CHAT_REVIEW_SESSION_CREATE = 3060;
    public static final int DELETE_PENDING_CALLS_FOR_HELP = 3605;
    public static final int GET_CFH_STATUS = 2746;
    public static final int GET_FAQ_CATEGORY = 3445;
    public static final int GET_FAQ_TEXT = 1849;
    public static final int GET_GUIDE_REPORTING_STATUS = 3786;
    public static final int GET_PENDING_CALLS_FOR_HELP = 3267;
    public static final int GET_QUIZ_QUESTIONS = 1296;
    public static final int GUIDE_SESSION_CREATE = 3338;
    public static final int GUIDE_SESSION_FEEDBACK = 477;
    public static final int GUIDE_SESSION_GET_REQUESTER_ROOM = 1052;
    public static final int GUIDE_SESSION_GUIDE_DECIDES = 1424;
    public static final int GUIDE_SESSION_INVITE_REQUESTER = 234;
    public static final int GUIDE_SESSION_IS_TYPING = 519;
    public static final int GUIDE_SESSION_MESSAGE = 3899;
    public static final int GUIDE_SESSION_ON_DUTY_UPDATE = 1922;
    public static final int GUIDE_SESSION_REPORT = 3969;
    public static final int GUIDE_SESSION_REQUESTER_CANCELS = 291;
    public static final int GUIDE_SESSION_RESOLVED = 887;
    public static final int POST_QUIZ_ANSWERS = 3720;
    public static final int SEARCH_FAQS = 2031;

    // === Inventory ===
    public static final int USER_FURNITURE = 3150;
    public static final int REQUESTFURNIINVENTORYWHENNOTINROOM = 3500;
    public static final int USER_BOTS = 3848;
    public static final int USER_PETS = 3095;
    public static final int USER_BADGES = 2769;
    public static final int USER_BADGES_CURRENT = 2091;
    public static final int USER_BADGES_CURRENT_UPDATE = 644;
    public static final int USER_EFFECT_ACTIVATE = 2959;
    public static final int USER_EFFECT_ENABLE = 1752;
    public static final int UNSEEN_RESET_CATEGORY = 3493;
    public static final int UNSEEN_RESET_ITEMS = 2343;

    // === Item ===
    public static final int ITEM_CLOTHING_REDEEM = 3374;
    public static final int ITEM_COLOR_WHEEL_CLICK = 2144;
    public static final int ITEM_DICE_CLICK = 1990;
    public static final int ITEM_DICE_CLOSE = 1533;
    public static final int ITEM_DIMMER_SAVE = 1648;
    public static final int ITEM_DIMMER_SETTINGS = 2813;
    public static final int ITEM_DIMMER_TOGGLE = 2296;
    public static final int ITEM_EXCHANGE_REDEEM = 3115;
    public static final int ITEM_PAINT = 711;
    public static final int ITEM_STACK_HELPER = 3839;
    public static final int ITEM_WALL_CLICK = 210;
    public static final int ITEM_WALL_UPDATE = 168;

    // === Landing View ===
    public static final int GET_PROMO_ARTICLES = 1827;
    public static final int COMMUNITY_GOAL_VOTE_COMPOSER = 3536;

    // === Mannequin ===
    public static final int MANNEQUIN_SAVE_NAME = 2850;
    public static final int MANNEQUIN_SAVE_LOOK = 2209;

    // === Marketplace ===
    public static final int MARKETPLACE_CONFIG = 2597;
    public static final int REQUEST_SELL_ITEM = 848;
    public static final int REQUEST_MARKETPLACE_ITEM_STATS = 3288;
    public static final int MARKETPLACE_SELL_ITEM = 3447;
    public static final int MARKETPLACE_REQUEST_OWN_ITEMS = 2105;
    public static final int MARKETPLACE_TAKE_BACK_ITEM = 434;
    public static final int MARKETPLACE_REDEEM_CREDITS = 2650;
    public static final int MARKETPLACE_REQUEST_OFFERS = 2407;
    public static final int MARKETPLACE_BUY_OFFER = 1603;
    public static final int MARKETPLACE_BUY_TOKENS = 1866;

    // === Moderation ===
    public static final int MOD_TOOL_USER_INFO = 3295;
    public static final int MODTOOL_REQUEST_ROOM_INFO = 707;
    public static final int MODTOOL_CHANGE_ROOM_SETTINGS = 3260;
    public static final int MODTOOL_REQUEST_USER_CHATLOG = 1391;
    public static final int MODTOOL_REQUEST_ROOM_CHATLOG = 2587;
    public static final int MODTOOL_SANCTION_ALERT = 229;
    public static final int MODTOOL_SANCTION_BAN = 2766;
    public static final int MODTOOL_SANCTION_KICK = 2582;
    public static final int MODTOOL_SANCTION_TRADELOCK = 3742;
    public static final int MODTOOL_ALERTEVENT = 1840;
    public static final int MODTOOL_SANCTION_MUTE = 1945;
    public static final int MODTOOL_REQUEST_USER_ROOMS = 3526;
    public static final int MODTOOL_ROOM_ALERT = 3842;
    public static final int MODTOOL_PREFERENCES = 31;
    public static final int CLOSE_ISSUE_DEFAULT_ACTION = 2717;
    public static final int CLOSE_ISSUES = 2067;
    public static final int DEFAULT_SANCTION = 1681;
    public static final int GET_CFH_CHATLOG = 211;
    public static final int MODTOOL_SANCTION = 1392;
    public static final int PICK_ISSUES = 15;
    public static final int RELEASE_ISSUES = 1572;
    public static final int CONVERT_GLOBAL_ROOM_ID = 314;

    // === Mystery Box ===
    public static final int MYSTERYBOXWAITINGCANCELEDMESSAGE = 2012;
    public static final int MYSTERYBOX_OPEN_TROPHY = 3074;

    // === Navigator ===
    public static final int GET_USER_FLAT_CATS = 3027;
    public static final int NAVIGATOR_INIT = 2110;
    public static final int NAVIGATOR_SEARCH = 249;
    public static final int NAVIGATOR_SEARCH_CLOSE = 1834;
    public static final int NAVIGATOR_SEARCH_OPEN = 637;
    public static final int NAVIGATOR_SEARCH_SAVE = 2226;
    public static final int GET_USER_EVENT_CATS = 1782;
    public static final int NAVIGATOR_SETTINGS_SAVE = 3159;
    public static final int NAVIGATOR_CATEGORY_LIST_MODE = 1202;
    public static final int NAVIGATOR_DELETE_SAVED_SEARCH = 1954;

    // === New User Experience ===
    public static final int NEW_USER_EXPERIENCE_GET_GIFTS = 1822;
    public static final int NEW_USER_EXPERIENCE_SCRIPT_PROCEED = 1299;

    // === Pet ===
    public static final int PET_INFO = 2934;
    public static final int PET_PICKUP = 1581;
    public static final int PET_PLACE = 2647;
    public static final int PET_RESPECT = 3202;
    public static final int PET_RIDE = 1036;
    public static final int PET_MOVE = 3449;
    public static final int PET_OPEN_PACKAGE = 3698;
    public static final int PET_SELECTED = 549;
    public static final int PETS_BREED = 1638;
    public static final int PET_CANCEL_BREEDING = 2713;
    public static final int PET_CONFIRM_BREEDING = 3382;
    public static final int GET_PET_TRAINING_PANEL = 2161;
    public static final int UNIT_GIVE_HANDITEM_PET = 2768;
    public static final int PET_MOUNT = 1036;
    public static final int PET_SUPPLEMENT = 749;
    public static final int USE_PET_PRODUCT = 1328;
    public static final int REMOVE_PET_SADDLE = 186;
    public static final int TOGGLE_PET_RIDING = 1472;
    public static final int TOGGLE_PET_BREEDING = 3379;
    public static final int COMPOST_PLANT = 3835;
    public static final int HARVEST_PET = 1521;

    // === Poll ===
    public static final int POLL_ANSWER = 3505;
    public static final int POLL_REJECT = 1773;
    public static final int POLL_START = 109;
    public static final int POLL_VOTE_COUNTER = 6200;

    // === Present ===
    public static final int PRESENT_OPEN_PRESENT = 3558;

    // === Quest ===
    public static final int ACCEPT_QUEST = 3604;
    public static final int ACTIVATE_QUEST = 793;
    public static final int CANCEL_QUEST = 3133;
    public static final int FRIEND_REQUEST_QUEST_COMPLETE = 1148;
    public static final int GET_COMMUNITY_GOAL_EARNED_PRIZES = 2688;
    public static final int GET_COMMUNITY_GOAL_HALL_OF_FAME = 2167;
    public static final int GET_COMMUNITY_GOAL_PROGRESS = 1145;
    public static final int GET_CONCURRENT_USERS_GOAL_PROGRESS = 1343;
    public static final int GET_CONCURRENT_USERS_REWARD = 3872;
    public static final int GET_DAILY_QUEST = 2486;
    public static final int GET_QUESTS = 3333;
    public static final int GET_SEASONAL_QUESTS_ONLY = 1190;
    public static final int OPEN_QUEST_TRACKER = 2750;
    public static final int REDEEM_COMMUNITY_GOAL_PRIZE = 90;
    public static final int REJECT_QUEST = 2397;
    public static final int START_CAMPAIGN = 1697;
    public static final int GET_BONUS_RARE_INFO = 957;

    // === Recycler ===
    public static final int RECYCLER_PRIZES = 398;
    public static final int RECYCLER_STATUS = 1342;
    public static final int RECYCLER_ITEMS = 2771;

    // === Rentable Space ===
    public static final int RENTABLE_SPACE_CANCEL_RENT = 1667;
    public static final int RENTABLE_SPACE_RENT = 2946;
    public static final int RENTABLE_SPACE_STATUS = 872;
    public static final int RENTABLE_EXTEND_RENT_OR_BUYOUT_STRIP_ITEM = 2115;
    public static final int RENTABLE_EXTEND_RENT_OR_BUYOUT_FURNI = 1071;
    public static final int RENTABLE_GET_RENT_OR_BUYOUT_OFFER = 2518;

    // === Room ===
    public static final int ROOM_AMBASSADOR_ALERT = 2996;
    public static final int ROOM_BAN_GIVE = 1477;
    public static final int ROOM_BAN_LIST = 2267;
    public static final int ROOM_BAN_REMOVE = 992;
    public static final int ROOM_CREATE = 2752;
    public static final int ROOM_DELETE = 532;
    public static final int ROOM_DOORBELL = 1644;
    public static final int ROOM_ENTER = 2312;
    public static final int ROOM_FAVORITE = 3817;
    public static final int ROOM_FAVORITE_REMOVE = 309;
    public static final int CAN_CREATE_ROOM = 2128;
    public static final int CANCEL_ROOM_EVENT = 2725;
    public static final int EDIT_ROOM_EVENT = 3991;
    public static final int COMPETITION_ROOM_SEARCH = 433;
    public static final int FORWARD_TO_RANDOM_PROMOTED_ROOM = 10;
    public static final int FORWARD_TO_SOME_ROOM = 1703;
    public static final int GET_CATEGORIES_WITH_USER_COUNT = 3782;
    public static final int GET_GUEST_ROOM = 2230;
    public static final int GET_OFFICIAL_ROOMS = 1229;
    public static final int GET_POPULAR_ROOM_TAGS = 826;
    public static final int GUILD_BASE_SEARCH = 2930;
    public static final int MY_FAVOURITE_ROOMS_SEARCH = 2578;
    public static final int MY_FREQUENT_ROOM_HISTORY_SEARCH = 1002;
    public static final int MY_FRIENDS_ROOM_SEARCH = 2266;
    public static final int MY_GUILD_BASES_SEARCH = 39;
    public static final int MY_RECOMMENDED_ROOMS = 2537;
    public static final int MY_ROOM_HISTORY_SEARCH = 2264;
    public static final int MY_ROOM_RIGHTS_SEARCH = 272;
    public static final int MY_ROOMS_SEARCH = 2277;
    public static final int POPULAR_ROOMS_SEARCH = 2758;
    public static final int ROOM_AD_EVENT_TAB_CLICKED = 2412;
    public static final int ROOM_AD_EVENT_TAB_VIEWED = 2668;
    public static final int ROOM_AD_SEARCH = 2809;
    public static final int ROOM_TEXT_SEARCH = 3943;
    public static final int ROOMS_WHERE_MY_FRIENDS_ARE = 1786;
    public static final int ROOMS_WITH_HIGHEST_SCORE_SEARCH = 2939;
    public static final int SET_ROOM_SESSION_TAGS = 3305;
    public static final int UPDATE_ROOM_THUMBNAIL = 2468;
    public static final int ROOM_KICK = 1320;
    public static final int ROOM_LIKE = 3582;
    public static final int ROOM_MODEL = 2300;
    public static final int GET_OCCUPIED_TILES = 1687;
    public static final int GET_ROOM_ENTRY_TILE = 3559;
    public static final int ROOM_MODEL_SAVE = 875;
    public static final int ROOM_MUTE = 3637;
    public static final int ROOM_MUTE_USER = 3485;
    public static final int ROOM_RIGHTS_GIVE = 808;
    public static final int ROOM_RIGHTS_LIST = 3385;
    public static final int ROOM_RIGHTS_REMOVE = 2064;
    public static final int ROOM_RIGHTS_REMOVE_ALL = 2683;
    public static final int ROOM_RIGHTS_REMOVE_OWN = 3182;
    public static final int ROOM_SETTINGS = 3129;
    public static final int ROOM_SETTINGS_SAVE = 1969;
    public static final int ROOM_SETTINGS_UPDATE_ROOM_CATEGORY_AND_TRADE = 1265;
    public static final int ROOM_STAFF_PICK = 1918;
    public static final int ROOM_FILTER_WORDS = 1911;
    public static final int ROOM_FILTER_WORDS_MODIFY = 3001;
    public static final int ROOM_TONER_APPLY = 2880;
    public static final int GO_TO_FLAT = 685;
    public static final int CHANGE_QUEUE = 3093;

    // === Room Directory ===
    public static final int ROOM_DIRECTORY_ROOM_NETWORK_OPEN_CONNECTION = 3736;

    // === Security ===
    public static final int SECURITY_MACHINE = 2490;
    public static final int SECURITY_TICKET = 2419;

    // === Sound ===
    public static final int ADD_JUKEBOX_DISK = 753;
    public static final int GET_JUKEBOX_PLAYLIST = 1435;
    public static final int GET_NOW_PLAYING = 1325;
    public static final int GET_OFFICIAL_SONG_ID = 3189;
    public static final int GET_SONG_INFO = 3082;
    public static final int GET_SOUND_MACHINE_PLAYLIST = 3498;
    public static final int GET_USER_SONG_DISKS = 2304;
    public static final int REMOVE_JUKEBOX_DISK = 3050;
    public static final int GET_SOUND_SETTINGS = 2388;

    // === Talent ===
    public static final int HELPER_TALENT_TRACK = 196;
    public static final int TALENT_TRACK_GET_LEVEL = 2127;

    // === Tracking ===
    public static final int TRACKING_PERFORMANCE_LOG = 3230;
    public static final int TRACKING_LAG_WARNING_REPORT = 3847;

    // === Trading ===
    public static final int TRADE = 1481;
    public static final int TRADE_ACCEPT = 3863;
    public static final int TRADE_CANCEL = 2341;
    public static final int TRADE_CLOSE = 2551;
    public static final int TRADE_CONFIRM = 2760;
    public static final int TRADE_ITEM = 3107;
    public static final int TRADE_ITEM_REMOVE = 3845;
    public static final int TRADE_ITEMS = 1263;
    public static final int TRADE_UNACCEPT = 1444;

    // === Unit ===
    public static final int UNIT_ACTION = 2456;
    public static final int UNIT_CHAT = 1314;
    public static final int UNIT_CHAT_SHOUT = 2085;
    public static final int UNIT_CHAT_WHISPER = 1543;
    public static final int UNIT_DANCE = 2080;
    public static final int UNIT_DROP_HAND_ITEM = 2814;
    public static final int UNIT_GIVE_HANDITEM = 2941;
    public static final int UNIT_LOOK = 3301;
    public static final int UNIT_POSTURE = 2235;
    public static final int UNIT_SIGN = 1975;
    public static final int UNIT_TYPING = 1597;
    public static final int UNIT_TYPING_STOP = 1474;
    public static final int UNIT_WALK = 3320;

    // === User ===
    public static final int USER_CURRENCY = 273;
    public static final int USER_FIGURE = 2730;
    public static final int USER_HOME_ROOM = 1740;
    public static final int USER_INFO = 357;
    public static final int USER_MOTTO = 2228;
    public static final int USER_IGNORED = 3878;
    public static final int USER_PROFILE = 3265;
    public static final int USER_PROFILE_BY_NAME = 2249;
    public static final int USER_RESPECT = 2694;
    public static final int USER_SETTINGS_CAMERA = 1461;
    public static final int USER_SETTINGS_CHAT_STYLE = 1030;
    public static final int USER_SETTINGS_INVITES = 1086;
    public static final int USER_SETTINGS_OLD_CHAT = 1262;
    public static final int USER_SETTINGS_VOLUME = 1367;
    public static final int USER_SUBSCRIPTION = 3166;
    public static final int GET_WARDROBE = 2742;
    public static final int SAVE_WARDROBE_OUTFIT = 800;
    public static final int USER_TAGS = 17;
    public static final int PEER_USERS_CLASSIFICATION = 1160;
    public static final int USER_CLASSIFICATION = 2285;
    public static final int VISIT_USER = 2970;
    public static final int USER_IGNORE_ID = 3314;
    public static final int USER_IGNORE = 1117;
    public static final int USER_UNIGNORE = 2061;
    public static final int CHANGE_USERNAME = 2977;
    public static final int CHECK_USERNAME = 3950;
    public static final int SET_CLOTHING_CHANGE_DATA = 924;
    public static final int SCR_GET_KICKBACK_INFO = 869;

    // === Welcome Gift ===
    public static final int WELCOME_OPEN_GIFT = 2638;
    public static final int WELCOME_GIFT_CHANGE_EMAIL = 66;

    // === Email ===
    public static final int EMAIL_GET_STATUS = 2557;
    public static final int EMAIL_CHANGE = 3965;

    // === Wired ===
    public static final int WIRED_ACTION_SAVE = 2281;
    public static final int WIRED_APPLY_SNAPSHOT = 3373;
    public static final int WIRED_CONDITION_SAVE = 3203;
    public static final int WIRED_OPEN = 768;
    public static final int WIRED_TRIGGER_SAVE = 1520;

    // === YouTube ===
    public static final int CONTROL_YOUTUBE_DISPLAY_PLAYBACK = 3005;
    public static final int GET_YOUTUBE_DISPLAY_STATUS = 336;
    public static final int SET_YOUTUBE_DISPLAY_PLAYLIST = 2069;

    // === Camera ===
    public static final int PHOTO_COMPETITION = 3959;
    public static final int PUBLISH_PHOTO = 2068;
    public static final int PURCHASE_PHOTO = 2408;
    public static final int RENDER_ROOM = 3226;
    public static final int RENDER_ROOM_THUMBNAIL = 1982;
    public static final int REQUEST_CAMERA_CONFIGURATION = 796;

    // === Campaign ===
    public static final int OPEN_CAMPAIGN_CALENDAR_DOOR_STAFF = 3889;
    public static final int OPEN_CAMPAIGN_CALENDAR_DOOR = 2257;

    // === Builders Club ===
    public static final int BUILDERS_CLUB_PLACE_ROOM_ITEM = 1051;
    public static final int BUILDERS_CLUB_PLACE_WALL_ITEM = 462;
    public static final int BUILDERS_CLUB_QUERY_FURNI_COUNT = 2529;

    // === Advertisement ===
    public static final int INTERSTITIAL_SHOWN = 1109;
    public static final int GET_INTERSTITIAL = 2519;

    // === Achievement Resolution ===
    public static final int ACHIEVEMENT_RESOLUTION_OPEN = 359;
}
