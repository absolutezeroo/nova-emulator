package com.nova.infra.adapter.in.network.handler.packet;

/**
 * Constants for outgoing packet Header IDs.
 * <p>
 * These IDs correspond to the Habbo client protocol.
 * Each constant represents a specific message type sent to the client.
 */
public final class Outgoing {

    private Outgoing() {
        // Utility class - no instantiation
    }

    // === Handshake & Authentication ===

    /** Authentication successful */
    public static final int AUTH_OK = 2491;

    /** Unique ID registered */
    public static final int UNIQUE_ID_STATUS = 1488;

    /** Crypto init parameters */
    public static final int INIT_CRYPTO = 1347;

    /** Secret key */
    public static final int SECRET_KEY = 1469;

    /** Session parameters */
    public static final int SESSION_PARAMS = 2031;

    // === User Info ===

    /** User object data */
    public static final int USER_OBJECT = 2725;

    /** User home room */
    public static final int USER_HOME_ROOM = 2875;

    /** User perks/achievements */
    public static final int USER_PERKS = 2586;

    /** User credits balance */
    public static final int USER_CREDITS = 3475;

    /** User subscription status */
    public static final int USER_SUBSCRIPTION = 954;

    /** User data */
    public static final int USER_DATA = 3023;

    // === Navigator ===

    /** Navigator metadata */
    public static final int NAVIGATOR_METADATA = 3052;

    /** Navigator lifted rooms */
    public static final int NAVIGATOR_LIFTED = 3104;

    /** Navigator collapsed categories */
    public static final int NAVIGATOR_COLLAPSED = 1543;

    /** Navigator saved searches */
    public static final int NAVIGATOR_SAVED_SEARCHES = 3984;

    /** Navigator event categories */
    public static final int NAVIGATOR_EVENT_CATS = 3244;

    /** Navigator search results */
    public static final int NAVIGATOR_SEARCH_RESULTS = 2690;

    // === Messenger ===

    /** Messenger initialized */
    public static final int MESSENGER_INIT = 1605;

    /** Messenger requests */
    public static final int MESSENGER_REQUESTS = 280;

    /** Messenger friends list */
    public static final int MESSENGER_FRIENDS = 3130;

    /** Messenger update */
    public static final int MESSENGER_UPDATE = 2800;

    // === Rooms ===

    /** Room ready */
    public static final int ROOM_READY = 687;

    /** Room model data */
    public static final int ROOM_MODEL = 1301;

    /** Room height map */
    public static final int ROOM_HEIGHTMAP = 2753;

    /** Room paint */
    public static final int ROOM_PAINT = 2454;

    /** Room users */
    public static final int ROOM_USERS = 374;

    /** Room user status update */
    public static final int ROOM_USER_STATUS = 1640;

    // === Chat ===

    /** Chat message */
    public static final int CHAT = 1446;

    /** Shout message */
    public static final int SHOUT = 1036;

    /** Whisper message */
    public static final int WHISPER = 2704;

    // === Errors ===

    /** Generic error */
    public static final int GENERIC_ERROR = 4000;

    /** Authentication failed */
    public static final int AUTH_FAILED = 169;
}
