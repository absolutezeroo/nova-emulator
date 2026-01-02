package com.nova.infra.adapter.in.network.packets.headers;

/**
 * Constants for incoming packet Header IDs.
 * <p>
 * These IDs correspond to the Habbo client protocol.
 * Each constant represents a specific message type sent by the client.
 */
public final class Incoming {

    private Incoming() {
        // Utility class
    }

    // === Handshake & Authentication ===

    /** Client version information */
    public static final int RELEASE_VERSION = 4000;

    /** Unique machine ID */
    public static final int UNIQUE_ID = 2490;

    /** SSO ticket authentication */
    public static final int SSO_TICKET = 2419;

    /** Client pong (ping response) */
    public static final int CLIENT_PONG = 2596;

    /** Encryption initialization */
    public static final int INIT_CRYPTO = 3110;

    /** Generate secret key */
    public static final int GENERATE_SECRET_KEY = 773;

    // === User Info ===

    /** Request user info */
    public static final int USER_INFO = 357;

    /** Request user credits */
    public static final int USER_CREDITS = 273;

    /** Request user subscription status */
    public static final int USER_SUBSCRIPTION = 3166;

    // === Navigator ===

    /** Initialize navigator */
    public static final int NAVIGATOR_INIT = 2110;

    /** Search navigator */
    public static final int NAVIGATOR_SEARCH = 249;

    // === Messenger ===

    /** Initialize messenger */
    public static final int MESSENGER_INIT = 2781;

    /** Get friend requests */
    public static final int MESSENGER_REQUESTS = 2448;

    // === Rooms ===

    /** Enter room */
    public static final int ROOM_ENTER = 2312;

    /** Leave room */
    public static final int ROOM_EXIT = 2182;

    /** Chat message */
    public static final int CHAT = 1314;

    /** Shout message */
    public static final int SHOUT = 2085;

    /** Whisper message */
    public static final int WHISPER = 1543;

    /** Walk to tile */
    public static final int WALK = 3320;
}
