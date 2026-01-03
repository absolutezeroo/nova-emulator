package com.nova.infra.adapter.database.dao.room;

import com.nova.infra.adapter.database.entity.room.RoomModelEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;
import java.util.Optional;

/**
 * Jdbi DAO for 'room_models' table (heightmaps).
 */
@RegisterConstructorMapper(RoomModelEntity.class)
public interface RoomModelDao {

    @SqlQuery("""
            SELECT name, heightmap, door_x AS doorX, door_y AS doorY, door_dir AS doorDir,
                   is_custom AS isCustom, is_club_only AS isClubOnly
            FROM room_models WHERE name = :name
            """)
    Optional<RoomModelEntity> findByName(@Bind("name") String name);

    @SqlQuery("""
            SELECT name, heightmap, door_x AS doorX, door_y AS doorY, door_dir AS doorDir,
                   is_custom AS isCustom, is_club_only AS isClubOnly
            FROM room_models WHERE is_custom = FALSE ORDER BY name
            """)
    List<RoomModelEntity> findAllPublic();

    @SqlQuery("""
            SELECT name, heightmap, door_x AS doorX, door_y AS doorY, door_dir AS doorDir,
                   is_custom AS isCustom, is_club_only AS isClubOnly
            FROM room_models ORDER BY name
            """)
    List<RoomModelEntity> findAll();
}
