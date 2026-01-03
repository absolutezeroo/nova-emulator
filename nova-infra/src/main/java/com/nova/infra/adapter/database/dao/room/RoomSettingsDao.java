package com.nova.infra.adapter.database.dao.room;

import com.nova.infra.adapter.database.entity.room.RoomSettingsEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.Optional;

/**
 * Jdbi DAO for 'room_settings' table.
 */
@RegisterConstructorMapper(RoomSettingsEntity.class)
public interface RoomSettingsDao {

    @SqlQuery("""
            SELECT room_id AS roomId, max_users AS maxUsers,
                   trade_state AS tradeState, who_can_mute AS whoCanMute,
                   who_can_kick AS whoCanKick, who_can_ban AS whoCanBan,
                   allow_pets AS allowPets, allow_pets_eat AS allowPetsEat,
                   allow_walkthrough AS allowWalkthrough, allow_pulling AS allowPulling,
                   allow_pushing AS allowPushing, allow_effects AS allowEffects,
                   allow_respect AS allowRespect, diagonal_move AS diagonalMove,
                   wallpaper, floorpaper, landscape,
                   wall_thickness AS wallThickness, floor_thickness AS floorThickness,
                   wall_height AS wallHeight, hide_walls AS hideWalls,
                   chat_mode AS chatMode, chat_weight AS chatWeight,
                   chat_speed AS chatSpeed, chat_distance AS chatDistance,
                   chat_flood AS chatFlood, roller_speed AS rollerSpeed,
                   wired_security AS wiredSecurity
            FROM room_settings WHERE room_id = :roomId
            """)
    Optional<RoomSettingsEntity> findByRoomId(@Bind("roomId") int roomId);

    @SqlUpdate("INSERT INTO room_settings (room_id) VALUES (:roomId) ON DUPLICATE KEY UPDATE room_id = room_id")
    int createDefaults(@Bind("roomId") int roomId);

    @SqlUpdate("UPDATE room_settings SET max_users = :maxUsers WHERE room_id = :roomId")
    int updateMaxUsers(@Bind("roomId") int roomId, @Bind("maxUsers") int maxUsers);

    @SqlUpdate("""
            UPDATE room_settings SET wallpaper = :wallpaper, floorpaper = :floorpaper, landscape = :landscape
            WHERE room_id = :roomId
            """)
    int updateDecorations(@Bind("roomId") int roomId, @Bind("wallpaper") String wallpaper,
                          @Bind("floorpaper") String floorpaper, @Bind("landscape") String landscape);

    @SqlUpdate("""
            UPDATE room_settings SET chat_mode = :chatMode, chat_weight = :chatWeight,
                   chat_speed = :chatSpeed, chat_distance = :chatDistance, chat_flood = :chatFlood
            WHERE room_id = :roomId
            """)
    int updateChatSettings(@Bind("roomId") int roomId, @Bind("chatMode") String chatMode,
                           @Bind("chatWeight") String chatWeight, @Bind("chatSpeed") String chatSpeed,
                           @Bind("chatDistance") int chatDistance, @Bind("chatFlood") String chatFlood);
}
