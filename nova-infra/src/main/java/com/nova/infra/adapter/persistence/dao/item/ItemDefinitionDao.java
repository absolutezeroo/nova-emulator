package com.nova.infra.adapter.persistence.dao.item;

import com.nova.infra.adapter.persistence.entity.item.ItemDefinitionEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;
import java.util.Optional;

/**
 * Jdbi DAO for 'item_definitions' table (furniture base definitions).
 */
@RegisterConstructorMapper(ItemDefinitionEntity.class)
public interface ItemDefinitionDao {

    @SqlQuery("""
            SELECT id, sprite_id AS spriteId, public_name AS publicName, item_name AS itemName,
                   type, width, length, height, can_stack AS canStack, can_sit AS canSit,
                   is_walkable AS isWalkable, allow_recycle AS allowRecycle, allow_trade AS allowTrade,
                   allow_gift AS allowGift, allow_inventory_stack AS allowInventoryStack,
                   interaction_type AS interactionType, interaction_modes_count AS interactionModesCount,
                   vending_ids AS vendingIds, effect_id AS effectId, is_rare AS isRare
            FROM item_definitions WHERE id = :id
            """)
    Optional<ItemDefinitionEntity> findById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, sprite_id AS spriteId, public_name AS publicName, item_name AS itemName,
                   type, width, length, height, can_stack AS canStack, can_sit AS canSit,
                   is_walkable AS isWalkable, allow_recycle AS allowRecycle, allow_trade AS allowTrade,
                   allow_gift AS allowGift, allow_inventory_stack AS allowInventoryStack,
                   interaction_type AS interactionType, interaction_modes_count AS interactionModesCount,
                   vending_ids AS vendingIds, effect_id AS effectId, is_rare AS isRare
            FROM item_definitions WHERE item_name = :itemName
            """)
    Optional<ItemDefinitionEntity> findByItemName(@Bind("itemName") String itemName);

    @SqlQuery("""
            SELECT id, sprite_id AS spriteId, public_name AS publicName, item_name AS itemName,
                   type, width, length, height, can_stack AS canStack, can_sit AS canSit,
                   is_walkable AS isWalkable, allow_recycle AS allowRecycle, allow_trade AS allowTrade,
                   allow_gift AS allowGift, allow_inventory_stack AS allowInventoryStack,
                   interaction_type AS interactionType, interaction_modes_count AS interactionModesCount,
                   vending_ids AS vendingIds, effect_id AS effectId, is_rare AS isRare
            FROM item_definitions ORDER BY id
            """)
    List<ItemDefinitionEntity> findAll();

    @SqlQuery("SELECT COUNT(*) FROM item_definitions")
    int count();
}
