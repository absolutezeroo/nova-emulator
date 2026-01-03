package com.nova.infra.adapter.out.persistence.entity.user;

/**
 * Database entity record mapping to the 'user_settings' table.
 * <p>
 * User preferences and settings.
 */
public record UserSettingsEntity(
        int userId,
        int volumeSystem,
        int volumeFurni,
        int volumeTrax,
        boolean chatPreference,
        boolean roomInvitesEnabled,
        boolean cameraFollowEnabled,
        boolean friendRequestsEnabled,
        boolean offlineMessagingEnabled,
        boolean friendBarOpen,
        int navigatorX,
        int navigatorY,
        int navigatorWidth,
        int navigatorHeight,
        boolean navigatorSearchOpen,
        boolean ignoreRoomInvite,
        int talentTrackCitizenship,
        int talentTrackHelper
) {
    public static UserSettingsEntity defaults(int userId) {
        return new UserSettingsEntity(
                userId, 100, 100, 100, false, true, true, true, true, true,
                100, 100, 425, 535, false, false, 0, 0
        );
    }
}
