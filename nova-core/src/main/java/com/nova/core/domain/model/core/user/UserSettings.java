package com.nova.core.domain.model.core.user;

/**
 * Value Object representing user settings/preferences.
 * <p>
 * Corresponds to 'user_settings' table.
 */
public record UserSettings(
        // General settings
        boolean allowDirectMail,
        boolean canChangeName,
        boolean safetyLocked,

        // Navigator settings
        int navigatorX,
        int navigatorY,
        int navigatorWidth,
        int navigatorHeight,
        boolean navigatorSearchOpen,
        int navigatorHomeRoomId,

        // Chat settings
        boolean chatPreferOldBubbles,
        boolean chatIgnoreInvites,
        boolean chatCameraFollow,

        // Room settings
        int volumeFurni,
        int volumeTrax,

        // Flags
        boolean nuxCompleted,
        boolean allowMimic,
        boolean allowFollow,
        boolean allowFriendRequests,
        boolean allowTrade
) {
    public UserSettings {
        // Ensure navigator dimensions are reasonable
        navigatorWidth = Math.max(300, navigatorWidth);
        navigatorHeight = Math.max(300, navigatorHeight);
    }

    public static UserSettings defaultSettings() {
        return new UserSettings(
                false,          // allowDirectMail
                false,          // canChangeName
                false,          // safetyLocked
                100,            // navigatorX
                100,            // navigatorY
                435,            // navigatorWidth
                535,            // navigatorHeight
                false,          // navigatorSearchOpen
                0,              // navigatorHomeRoomId
                false,          // chatPreferOldBubbles
                false,          // chatIgnoreInvites
                true,           // chatCameraFollow
                100,            // volumeFurni
                100,            // volumeTrax
                false,          // nuxCompleted
                true,           // allowMimic
                true,           // allowFollow
                true,           // allowFriendRequests
                true            // allowTrade
        );
    }

    // ============== Navigator Settings ==============

    public UserSettings withNavigatorPosition(int x, int y, int width, int height) {
        return new UserSettings(allowDirectMail, canChangeName, safetyLocked,
                x, y, width, height, navigatorSearchOpen, navigatorHomeRoomId,
                chatPreferOldBubbles, chatIgnoreInvites, chatCameraFollow,
                volumeFurni, volumeTrax, nuxCompleted,
                allowMimic, allowFollow, allowFriendRequests, allowTrade);
    }

    public UserSettings withNavigatorSearchOpen(boolean open) {
        return new UserSettings(allowDirectMail, canChangeName, safetyLocked,
                navigatorX, navigatorY, navigatorWidth, navigatorHeight, open, navigatorHomeRoomId,
                chatPreferOldBubbles, chatIgnoreInvites, chatCameraFollow,
                volumeFurni, volumeTrax, nuxCompleted,
                allowMimic, allowFollow, allowFriendRequests, allowTrade);
    }

    // ============== Privacy Settings ==============

    public UserSettings withAllowDirectMail(boolean allow) {
        return new UserSettings(allow, canChangeName, safetyLocked,
                navigatorX, navigatorY, navigatorWidth, navigatorHeight, navigatorSearchOpen, navigatorHomeRoomId,
                chatPreferOldBubbles, chatIgnoreInvites, chatCameraFollow,
                volumeFurni, volumeTrax, nuxCompleted,
                allowMimic, allowFollow, allowFriendRequests, allowTrade);
    }

    public UserSettings withAllowMimic(boolean allow) {
        return new UserSettings(allowDirectMail, canChangeName, safetyLocked,
                navigatorX, navigatorY, navigatorWidth, navigatorHeight, navigatorSearchOpen, navigatorHomeRoomId,
                chatPreferOldBubbles, chatIgnoreInvites, chatCameraFollow,
                volumeFurni, volumeTrax, nuxCompleted,
                allow, allowFollow, allowFriendRequests, allowTrade);
    }

    public UserSettings withAllowFollow(boolean allow) {
        return new UserSettings(allowDirectMail, canChangeName, safetyLocked,
                navigatorX, navigatorY, navigatorWidth, navigatorHeight, navigatorSearchOpen, navigatorHomeRoomId,
                chatPreferOldBubbles, chatIgnoreInvites, chatCameraFollow,
                volumeFurni, volumeTrax, nuxCompleted,
                allowMimic, allow, allowFriendRequests, allowTrade);
    }

    public UserSettings withAllowFriendRequests(boolean allow) {
        return new UserSettings(allowDirectMail, canChangeName, safetyLocked,
                navigatorX, navigatorY, navigatorWidth, navigatorHeight, navigatorSearchOpen, navigatorHomeRoomId,
                chatPreferOldBubbles, chatIgnoreInvites, chatCameraFollow,
                volumeFurni, volumeTrax, nuxCompleted,
                allowMimic, allowFollow, allow, allowTrade);
    }

    public UserSettings withAllowTrade(boolean allow) {
        return new UserSettings(allowDirectMail, canChangeName, safetyLocked,
                navigatorX, navigatorY, navigatorWidth, navigatorHeight, navigatorSearchOpen, navigatorHomeRoomId,
                chatPreferOldBubbles, chatIgnoreInvites, chatCameraFollow,
                volumeFurni, volumeTrax, nuxCompleted,
                allowMimic, allowFollow, allowFriendRequests, allow);
    }

    // ============== Chat Settings ==============

    public UserSettings withChatSettings(boolean oldBubbles, boolean ignoreInvites, boolean cameraFollow) {
        return new UserSettings(allowDirectMail, canChangeName, safetyLocked,
                navigatorX, navigatorY, navigatorWidth, navigatorHeight, navigatorSearchOpen, navigatorHomeRoomId,
                oldBubbles, ignoreInvites, cameraFollow,
                volumeFurni, volumeTrax, nuxCompleted,
                allowMimic, allowFollow, allowFriendRequests, allowTrade);
    }

    // ============== Volume Settings ==============

    public UserSettings withVolumes(int furni, int trax) {
        return new UserSettings(allowDirectMail, canChangeName, safetyLocked,
                navigatorX, navigatorY, navigatorWidth, navigatorHeight, navigatorSearchOpen, navigatorHomeRoomId,
                chatPreferOldBubbles, chatIgnoreInvites, chatCameraFollow,
                furni, trax, nuxCompleted,
                allowMimic, allowFollow, allowFriendRequests, allowTrade);
    }

    // ============== NUX ==============

    public UserSettings withNuxCompleted(boolean completed) {
        return new UserSettings(allowDirectMail, canChangeName, safetyLocked,
                navigatorX, navigatorY, navigatorWidth, navigatorHeight, navigatorSearchOpen, navigatorHomeRoomId,
                chatPreferOldBubbles, chatIgnoreInvites, chatCameraFollow,
                volumeFurni, volumeTrax, completed,
                allowMimic, allowFollow, allowFriendRequests, allowTrade);
    }
}
