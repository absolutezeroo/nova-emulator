package com.nova.infra.adapter.out.persistence.dao.item;

import com.nova.infra.adapter.out.persistence.entity.item.ItemEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.Optional;

/**
 * Jdbi DAO for 'items' table (furniture instances).
 */
@RegisterConstructorMapper(ItemEntity.class)
public interface ItemDao {

    @SqlQuery("""
            SELECT id, definition_id AS definitionId, owner_id AS ownerId, room_id AS roomId,
                   x, y, z, rotation, extra_data AS extraData, limited_number AS limitedNumber,
                   limited_total AS limitedTotal, created_at AS createdAt
            FROM items WHERE id = :id
            """)
    Optional<ItemEntity> findById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, definition_id AS definitionId, owner_id AS ownerId, room_id AS roomId,
                   x, y, z, rotation, extra_data AS extraData, limited_number AS limitedNumber,
                   limited_total AS limitedTotal, created_at AS createdAt
            FROM items WHERE owner_id = :ownerId AND room_id IS NULL ORDER BY id
            """)
    List<ItemEntity> findInventoryItems(@Bind("ownerId") int ownerId);

    @SqlQuery("""
            SELECT id, definition_id AS definitionId, owner_id AS ownerId, room_id AS roomId,
                   x, y, z, rotation, extra_data AS extraData, limited_number AS limitedNumber,
                   limited_total AS limitedTotal, created_at AS createdAt
            FROM items WHERE room_id = :roomId ORDER BY id
            """)
    List<ItemEntity> findRoomItems(@Bind("roomId") int roomId);

    @SqlQuery("SELECT COUNT(*) FROM items WHERE owner_id = :ownerId AND room_id IS NULL")
    int countInventoryItems(@Bind("ownerId") int ownerId);

    @SqlUpdate("""
            INSERT INTO items (definition_id, owner_id, room_id, x, y, z, rotation, extra_data, limited_number, limited_total)
            VALUES (:definitionId, :ownerId, :roomId, :x, :y, :z, :rotation, :extraData, :limitedNumber, :limitedTotal)
            """)
    @GetGeneratedKeys
    int insert(@Bind("definitionId") int definitionId, @Bind("ownerId") int ownerId,
               @Bind("roomId") Integer roomId, @Bind("x") int x, @Bind("y") int y,
               @Bind("z") double z, @Bind("rotation") int rotation, @Bind("extraData") String extraData,
               @Bind("limitedNumber") int limitedNumber, @Bind("limitedTotal") int limitedTotal);

    @SqlUpdate("UPDATE items SET room_id = :roomId, x = :x, y = :y, z = :z, rotation = :rotation WHERE id = :id")
    int updatePosition(@Bind("id") int id, @Bind("roomId") Integer roomId,
                       @Bind("x") int x, @Bind("y") int y, @Bind("z") double z, @Bind("rotation") int rotation);

    @SqlUpdate("UPDATE items SET owner_id = :ownerId, room_id = NULL WHERE id = :id")
    int moveToInventory(@Bind("id") int id, @Bind("ownerId") int ownerId);

    @SqlUpdate("UPDATE items SET extra_data = :extraData WHERE id = :id")
    int updateExtraData(@Bind("id") int id, @Bind("extraData") String extraData);

    @SqlUpdate("DELETE FROM items WHERE id = :id")
    int delete(@Bind("id") int id);

    @SqlUpdate("DELETE FROM items WHERE room_id = :roomId")
    int deleteRoomItems(@Bind("roomId") int roomId);
}
