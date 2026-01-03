package com.nova.core.domain.model.hotel.room;

/**
 * Value Object representing room settings/configuration.
 * <p>
 * Corresponds to 'room_settings' table.
 */
public record RoomSettings(
        // Access settings
        RoomState state,
        String password,
        int maxUsers,

        // Chat settings
        int chatMode,          // 0=free, 1=line
        int chatWeight,        // 0=normal, 1=whisper distance
        int chatSpeed,         // 0=slow, 1=normal, 2=fast
        int chatDistance,      // Max hearing distance
        int chatFlood,         // Flood protection level

        // Trading
        int tradeMode,         // 0=no, 1=owner, 2=everyone

        // Room features
        boolean allowPets,
        boolean allowPetsEat,
        boolean allowWalkthrough,
        boolean hideWalls,
        int wallThickness,
        int floorThickness,

        // Moderation
        int muteOption,        // 0=no, 1=owner can mute
        int kickOption,        // 0=no, 1=owner/rights, 2=everyone
        int banOption          // 0=no, 1=owner/rights
) {
    public RoomSettings {
        state = state != null ? state : RoomState.OPEN;
        password = password != null ? password : "";
        maxUsers = Math.max(1, Math.min(maxUsers, 100));
    }

    public static RoomSettings defaultSettings() {
        return new RoomSettings(
            RoomState.OPEN,
            "",
            25,
            0, 0, 1, 14, 0,
            2,
            true, true, true, false, 0, 0,
            0, 1, 0
        );
    }

    public RoomSettings withState(RoomState newState) {
        return new RoomSettings(newState, password, maxUsers, chatMode, chatWeight, chatSpeed, chatDistance, chatFlood, tradeMode, allowPets, allowPetsEat, allowWalkthrough, hideWalls, wallThickness, floorThickness, muteOption, kickOption, banOption);
    }

    public RoomSettings withPassword(String newPassword) {
        return new RoomSettings(state, newPassword, maxUsers, chatMode, chatWeight, chatSpeed, chatDistance, chatFlood, tradeMode, allowPets, allowPetsEat, allowWalkthrough, hideWalls, wallThickness, floorThickness, muteOption, kickOption, banOption);
    }

    public RoomSettings withMaxUsers(int newMaxUsers) {
        return new RoomSettings(state, password, newMaxUsers, chatMode, chatWeight, chatSpeed, chatDistance, chatFlood, tradeMode, allowPets, allowPetsEat, allowWalkthrough, hideWalls, wallThickness, floorThickness, muteOption, kickOption, banOption);
    }

    public RoomSettings withChatSettings(int mode, int weight, int speed, int distance, int flood) {
        return new RoomSettings(state, password, maxUsers, mode, weight, speed, distance, flood, tradeMode, allowPets, allowPetsEat, allowWalkthrough, hideWalls, wallThickness, floorThickness, muteOption, kickOption, banOption);
    }

    public RoomSettings withTradeMode(int newTradeMode) {
        return new RoomSettings(state, password, maxUsers, chatMode, chatWeight, chatSpeed, chatDistance, chatFlood, newTradeMode, allowPets, allowPetsEat, allowWalkthrough, hideWalls, wallThickness, floorThickness, muteOption, kickOption, banOption);
    }

    public RoomSettings withPetSettings(boolean pets, boolean petsEat) {
        return new RoomSettings(state, password, maxUsers, chatMode, chatWeight, chatSpeed, chatDistance, chatFlood, tradeMode, pets, petsEat, allowWalkthrough, hideWalls, wallThickness, floorThickness, muteOption, kickOption, banOption);
    }

    public RoomSettings withWalkthrough(boolean walkthrough) {
        return new RoomSettings(state, password, maxUsers, chatMode, chatWeight, chatSpeed, chatDistance, chatFlood, tradeMode, allowPets, allowPetsEat, walkthrough, hideWalls, wallThickness, floorThickness, muteOption, kickOption, banOption);
    }

    public RoomSettings withWallSettings(boolean hide, int wallThick, int floorThick) {
        return new RoomSettings(state, password, maxUsers, chatMode, chatWeight, chatSpeed, chatDistance, chatFlood, tradeMode, allowPets, allowPetsEat, allowWalkthrough, hide, wallThick, floorThick, muteOption, kickOption, banOption);
    }

    public RoomSettings withModerationSettings(int mute, int kick, int ban) {
        return new RoomSettings(state, password, maxUsers, chatMode, chatWeight, chatSpeed, chatDistance, chatFlood, tradeMode, allowPets, allowPetsEat, allowWalkthrough, hideWalls, wallThickness, floorThickness, mute, kick, ban);
    }
}
