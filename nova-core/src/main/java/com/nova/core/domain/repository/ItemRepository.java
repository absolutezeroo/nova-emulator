package com.nova.core.domain.repository;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.item.Item;
import com.nova.core.domain.model.hotel.item.ItemDefinition;
import com.nova.core.domain.model.hotel.item.ItemId;
import com.nova.core.domain.model.hotel.room.RoomId;

import java.util.List;
import java.util.Optional;

/**
 * Output Port (Secondary/Driven Port) - Repository interface.
 * <p>
 * Defines persistence operations for Items (furniture).
 * Implemented by infrastructure adapters (MySQL repository).
 */
public interface ItemRepository {

    // ============== Item Definition Operations ==============

    /**
     * Finds an item definition by ID.
     *
     * @param definitionId The definition ID
     * @return The item definition if found
     */
    Optional<ItemDefinition> findDefinitionById(int definitionId);

    /**
     * Finds an item definition by sprite ID.
     *
     * @param spriteId The sprite identifier
     * @return The item definition if found
     */
    Optional<ItemDefinition> findDefinitionBySpriteId(String spriteId);

    /**
     * Gets all item definitions.
     *
     * @return List of all definitions
     */
    List<ItemDefinition> findAllDefinitions();

    // ============== Item Instance Operations ==============

    /**
     * Finds an item by its ID.
     *
     * @param itemId The item's ID
     * @return The item if found
     */
    Optional<Item> findById(ItemId itemId);

    /**
     * Finds all items owned by a user (inventory).
     *
     * @param ownerId The owner's user ID
     * @return List of items in inventory
     */
    List<Item> findByOwnerId(UserId ownerId);

    /**
     * Finds all items in a room.
     *
     * @param roomId The room ID
     * @return List of items in the room
     */
    List<Item> findByRoomId(RoomId roomId);

    /**
     * Finds items in user's inventory (not placed in any room).
     *
     * @param ownerId The owner's user ID
     * @return List of inventory items
     */
    List<Item> findInventoryItems(UserId ownerId);

    /**
     * Saves an item (insert or update).
     *
     * @param item The item to save
     * @return The saved item
     */
    Item save(Item item);

    /**
     * Deletes an item.
     *
     * @param itemId The item ID to delete
     * @return true if deleted, false if not found
     */
    boolean delete(ItemId itemId);

    /**
     * Updates item position in a room.
     *
     * @param itemId The item ID
     * @param x X coordinate
     * @param y Y coordinate
     * @param z Z coordinate (height)
     * @param rotation Rotation (0-7)
     */
    void updatePosition(ItemId itemId, int x, int y, double z, int rotation);

    /**
     * Updates item extra data (state).
     *
     * @param itemId The item ID
     * @param extraData The new extra data
     */
    void updateExtraData(ItemId itemId, String extraData);
}
