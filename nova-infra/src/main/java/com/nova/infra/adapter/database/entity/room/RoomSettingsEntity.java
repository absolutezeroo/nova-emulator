package com.nova.infra.adapter.database.entity.room;

/**
 * Database entity record mapping to the 'room_settings' table.
 * <p>
 * All configurable room options.
 */
public record RoomSettingsEntity(
        int roomId,
        int maxUsers,
        // Access & Security
        String tradeState,      // ENUM: disabled, owner_only, enabled
        String whoCanMute,      // ENUM: nobody, owner, rights, everyone
        String whoCanKick,
        String whoCanBan,
        // Movement & Interaction
        boolean allowPets,
        boolean allowPetsEat,
        boolean allowWalkthrough,
        boolean allowPulling,
        boolean allowPushing,
        boolean allowEffects,
        boolean allowRespect,
        boolean diagonalMove,
        // Theming
        String wallpaper,
        String floorpaper,
        String landscape,
        int wallThickness,
        int floorThickness,
        int wallHeight,
        boolean hideWalls,
        // Chat Settings
        String chatMode,        // ENUM: free_flow, line_by_line
        String chatWeight,      // ENUM: normal, thin, fat
        String chatSpeed,       // ENUM: fast, normal, slow
        int chatDistance,
        String chatFlood,       // ENUM: strict, normal, loose
        // Roller & Wired
        int rollerSpeed,
        boolean wiredSecurity
) {
    public static RoomSettingsEntity defaults(int roomId) {
        return new RoomSettingsEntity(
                roomId, 25, "enabled", "rights", "rights", "owner",
                true, false, true, true, true, true, true, true,
                "0.0", "0.0", "0.0", 0, 0, -1, false,
                "free_flow", "normal", "normal", 50, "normal",
                4, false
        );
    }
}
