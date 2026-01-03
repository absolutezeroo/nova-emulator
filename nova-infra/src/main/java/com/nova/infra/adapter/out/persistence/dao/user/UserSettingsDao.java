package com.nova.infra.adapter.out.persistence.dao.user;

import com.nova.infra.adapter.out.persistence.entity.user.UserSettingsEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.Optional;

/**
 * Jdbi DAO for 'user_settings' table.
 */
@RegisterConstructorMapper(UserSettingsEntity.class)
public interface UserSettingsDao {

    @SqlQuery("""
            SELECT user_id AS userId,
                   volume_system AS volumeSystem, volume_furni AS volumeFurni, volume_trax AS volumeTrax,
                   chat_preference AS chatPreference, room_invites_enabled AS roomInvitesEnabled,
                   camera_follow_enabled AS cameraFollowEnabled, friend_requests_enabled AS friendRequestsEnabled,
                   offline_messaging_enabled AS offlineMessagingEnabled, friend_bar_open AS friendBarOpen,
                   navigator_x AS navigatorX, navigator_y AS navigatorY,
                   navigator_width AS navigatorWidth, navigator_height AS navigatorHeight,
                   navigator_search_open AS navigatorSearchOpen, ignore_room_invite AS ignoreRoomInvite,
                   talent_track_citizenship AS talentTrackCitizenship, talent_track_helper AS talentTrackHelper
            FROM user_settings WHERE user_id = :userId
            """)
    Optional<UserSettingsEntity> findByUserId(@Bind("userId") int userId);

    @SqlUpdate("""
            INSERT INTO user_settings (user_id) VALUES (:userId)
            ON DUPLICATE KEY UPDATE user_id = user_id
            """)
    int createDefaults(@Bind("userId") int userId);

    @SqlUpdate("""
            UPDATE user_settings SET
                volume_system = :volumeSystem, volume_furni = :volumeFurni, volume_trax = :volumeTrax
            WHERE user_id = :userId
            """)
    int updateVolumes(@Bind("userId") int userId, @Bind("volumeSystem") int volumeSystem,
                      @Bind("volumeFurni") int volumeFurni, @Bind("volumeTrax") int volumeTrax);

    @SqlUpdate("""
            UPDATE user_settings SET
                navigator_x = :x, navigator_y = :y, navigator_width = :width, navigator_height = :height
            WHERE user_id = :userId
            """)
    int updateNavigatorPosition(@Bind("userId") int userId, @Bind("x") int x, @Bind("y") int y,
                                @Bind("width") int width, @Bind("height") int height);
}
