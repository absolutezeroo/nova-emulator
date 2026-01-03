package com.nova.core.domain.model.hotel.room;

/**
 * Value Object representing room decoration/visual settings.
 * <p>
 * Corresponds to 'room_decoration' table.
 */
public record RoomDecoration(
        int wallpaper,
        int floor,
        int landscape,

        // Mood light settings
        boolean moodLightEnabled,
        String moodLightData,

        // Jukebox settings
        boolean jukeboxEnabled
) {
    public RoomDecoration {
        moodLightData = moodLightData != null ? moodLightData : "";
    }

    public static RoomDecoration defaultDecoration() {
        return new RoomDecoration(0, 0, 0, false, "", false);
    }

    public RoomDecoration withWallpaper(int newWallpaper) {
        return new RoomDecoration(newWallpaper, floor, landscape, moodLightEnabled, moodLightData, jukeboxEnabled);
    }

    public RoomDecoration withFloor(int newFloor) {
        return new RoomDecoration(wallpaper, newFloor, landscape, moodLightEnabled, moodLightData, jukeboxEnabled);
    }

    public RoomDecoration withLandscape(int newLandscape) {
        return new RoomDecoration(wallpaper, floor, newLandscape, moodLightEnabled, moodLightData, jukeboxEnabled);
    }

    public RoomDecoration withMoodLight(boolean enabled, String data) {
        return new RoomDecoration(wallpaper, floor, landscape, enabled, data, jukeboxEnabled);
    }

    public RoomDecoration withJukebox(boolean enabled) {
        return new RoomDecoration(wallpaper, floor, landscape, moodLightEnabled, moodLightData, enabled);
    }
}
