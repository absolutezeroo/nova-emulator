package com.nova.infra.adapter.persistence.repository;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.item.*;
import com.nova.core.domain.model.hotel.room.RoomId;
import com.nova.core.domain.repository.ItemRepository;
import com.nova.infra.adapter.persistence.dao.item.ItemDao;
import com.nova.infra.adapter.persistence.dao.item.ItemDefinitionDao;
import com.nova.infra.adapter.persistence.entity.item.ItemDefinitionEntity;
import com.nova.infra.adapter.persistence.entity.item.ItemEntity;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Jdbi implementation of ItemRepository (Output Adapter).
 * <p>
 * Maps between domain Item/ItemDefinition and database tables:
 * - item_definitions: Furniture templates
 * - items: User-owned furniture instances
 */
@Singleton
public class JdbiItemRepository implements ItemRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdbiItemRepository.class);

    private final Jdbi jdbi;

    // Cache definitions as they are loaded frequently and rarely change
    private final Map<Integer, ItemDefinition> definitionCache = new ConcurrentHashMap<>();

    @Inject
    public JdbiItemRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    // ============== Item Definition Operations ==============

    @Override
    public Optional<ItemDefinition> findDefinitionById(int definitionId) {
        // Check cache first
        ItemDefinition cached = definitionCache.get(definitionId);
        if (cached != null) {
            return Optional.of(cached);
        }

        try {
            Optional<ItemDefinitionEntity> entityOpt = jdbi.withExtension(
                    ItemDefinitionDao.class,
                    dao -> dao.findById(definitionId)
            );

            if (entityOpt.isPresent()) {
                ItemDefinition definition = mapToDefinition(entityOpt.get());
                definitionCache.put(definitionId, definition);
                return Optional.of(definition);
            }
            return Optional.empty();
        } catch (Exception e) {
            LOGGER.error("Error finding item definition by ID: {}", definitionId, e);
            return Optional.empty();
        }
    }

    @Override
    public Optional<ItemDefinition> findDefinitionBySpriteId(String spriteId) {
        try {
            Optional<ItemDefinitionEntity> entityOpt = jdbi.withExtension(
                    ItemDefinitionDao.class,
                    dao -> dao.findByItemName(spriteId)
            );

            return entityOpt.map(this::mapToDefinition);
        } catch (Exception e) {
            LOGGER.error("Error finding item definition by sprite: {}", spriteId, e);
            return Optional.empty();
        }
    }

    @Override
    public List<ItemDefinition> findAllDefinitions() {
        try {
            List<ItemDefinitionEntity> entities = jdbi.withExtension(
                    ItemDefinitionDao.class,
                    ItemDefinitionDao::findAll
            );

            List<ItemDefinition> definitions = entities.stream()
                    .map(this::mapToDefinition)
                    .collect(Collectors.toList());

            // Populate cache
            definitions.forEach(d -> definitionCache.put(d.id(), d));

            return definitions;
        } catch (Exception e) {
            LOGGER.error("Error finding all item definitions", e);
            return Collections.emptyList();
        }
    }

    // ============== Item Instance Operations ==============

    @Override
    public Optional<Item> findById(ItemId itemId) {
        try {
            Optional<ItemEntity> entityOpt = jdbi.withExtension(
                    ItemDao.class,
                    dao -> dao.findById(itemId.value())
            );

            if (entityOpt.isEmpty()) {
                return Optional.empty();
            }

            ItemEntity entity = entityOpt.get();
            Optional<ItemDefinition> defOpt = findDefinitionById(entity.definitionId());

            if (defOpt.isEmpty()) {
                LOGGER.warn("Item {} has unknown definition: {}", itemId, entity.definitionId());
                return Optional.empty();
            }

            return Optional.of(mapToItem(entity, defOpt.get()));
        } catch (Exception e) {
            LOGGER.error("Error finding item by ID: {}", itemId, e);
            return Optional.empty();
        }
    }

    @Override
    public List<Item> findByOwnerId(UserId ownerId) {
        return findInventoryItems(ownerId);
    }

    @Override
    public List<Item> findByRoomId(RoomId roomId) {
        try {
            List<ItemEntity> entities = jdbi.withExtension(
                    ItemDao.class,
                    dao -> dao.findRoomItems(roomId.value())
            );

            return mapToItems(entities);
        } catch (Exception e) {
            LOGGER.error("Error finding items in room: {}", roomId, e);
            return Collections.emptyList();
        }
    }

    @Override
    public List<Item> findInventoryItems(UserId ownerId) {
        try {
            List<ItemEntity> entities = jdbi.withExtension(
                    ItemDao.class,
                    dao -> dao.findInventoryItems(ownerId.value())
            );

            return mapToItems(entities);
        } catch (Exception e) {
            LOGGER.error("Error finding inventory items for user: {}", ownerId, e);
            return Collections.emptyList();
        }
    }

    @Override
    public Item save(Item item) {
        try {
            if (item.getId().value() <= 0) {
                // Insert new item
                int newId = jdbi.withExtension(ItemDao.class, dao ->
                        dao.insert(
                                item.getDefinitionId(),
                                item.getOwnerId().value(),
                                item.getRoomId() != null ? item.getRoomId().value() : null,
                                item.getX(),
                                item.getY(),
                                item.getZ(),
                                item.getRotation(),
                                item.getExtraData(),
                                item.getLimitedNumber(),
                                item.getLimitedStack()
                        )
                );
                // Return new item with ID
                return new Item(
                        ItemId.of(newId),
                        item.getDefinition(),
                        item.getOwnerId(),
                        item.getRoomId(),
                        item.getX(), item.getY(), item.getZ(),
                        item.getRotation(),
                        item.getExtraData()
                );
            } else {
                // Update existing item position
                jdbi.useExtension(ItemDao.class, dao ->
                        dao.updatePosition(
                                item.getId().value(),
                                item.getRoomId() != null ? item.getRoomId().value() : null,
                                item.getX(),
                                item.getY(),
                                item.getZ(),
                                item.getRotation()
                        )
                );
            }
        } catch (Exception e) {
            LOGGER.error("Error saving item: {}", item.getId(), e);
        }
        return item;
    }

    @Override
    public boolean delete(ItemId itemId) {
        try {
            int deleted = jdbi.withExtension(ItemDao.class, dao -> dao.delete(itemId.value()));
            return deleted > 0;
        } catch (Exception e) {
            LOGGER.error("Error deleting item: {}", itemId, e);
            return false;
        }
    }

    @Override
    public void updatePosition(ItemId itemId, int x, int y, double z, int rotation) {
        try {
            // Need to get current roomId first
            Optional<ItemEntity> entityOpt = jdbi.withExtension(
                    ItemDao.class,
                    dao -> dao.findById(itemId.value())
            );

            if (entityOpt.isPresent()) {
                jdbi.useExtension(ItemDao.class, dao ->
                        dao.updatePosition(itemId.value(), entityOpt.get().roomId(), x, y, z, rotation)
                );
            }
        } catch (Exception e) {
            LOGGER.error("Error updating item position: {}", itemId, e);
        }
    }

    @Override
    public void updateExtraData(ItemId itemId, String extraData) {
        try {
            jdbi.useExtension(ItemDao.class, dao -> dao.updateExtraData(itemId.value(), extraData));
        } catch (Exception e) {
            LOGGER.error("Error updating item extra data: {}", itemId, e);
        }
    }

    // ========================
    // Entity ↔ Domain Mapping
    // ========================

    private List<Item> mapToItems(List<ItemEntity> entities) {
        List<Item> items = new ArrayList<>();
        for (ItemEntity entity : entities) {
            Optional<ItemDefinition> defOpt = findDefinitionById(entity.definitionId());
            if (defOpt.isPresent()) {
                items.add(mapToItem(entity, defOpt.get()));
            } else {
                LOGGER.warn("Skipping item {} with unknown definition: {}", entity.id(), entity.definitionId());
            }
        }
        return items;
    }

    private Item mapToItem(ItemEntity entity, ItemDefinition definition) {
        RoomId roomId = entity.roomId() != null ? RoomId.of(entity.roomId()) : null;

        Item item = new Item(
                ItemId.of(entity.id()),
                definition,
                UserId.of(entity.ownerId()),
                roomId,
                entity.x() != null ? entity.x() : 0,
                entity.y() != null ? entity.y() : 0,
                entity.z() != null ? entity.z().doubleValue() : 0.0,
                entity.rotation(),
                entity.extraData()
        );

        if (entity.limitedNumber() != null && entity.limitedStack() != null) {
            item.setLimitedEdition(entity.limitedNumber(), entity.limitedStack());
        }

        return item;
    }

    private ItemDefinition mapToDefinition(ItemDefinitionEntity entity) {
        return new ItemDefinition(
                entity.id(),
                entity.itemName(),
                entity.publicName(),
                mapItemType(entity.type()),
                entity.width(),
                entity.length(),
                entity.stackHeight() != null ? entity.stackHeight().doubleValue() : 0.0,
                entity.canStack(),
                entity.canSit(),
                entity.isWalkable(),
                entity.canLay(),
                entity.canRecycle(),
                entity.canTrade(),
                entity.canSell(),
                entity.canGift(),
                entity.canInventoryStack(),
                mapInteractionType(entity.interactionType()),
                entity.interactionModes(),
                entity.vendingIds(),
                entity.effectId() != null ? entity.effectId() : 0,
                entity.effectId() != null ? entity.effectId() : 0,
                0 // clothingOnWalk
        );
    }

    private ItemType mapItemType(String type) {
        if (type == null || type.isEmpty()) return ItemType.FLOOR;
        return switch (type.toLowerCase()) {
            case "i" -> ItemType.WALL;
            case "e" -> ItemType.EFFECT;
            case "b" -> ItemType.BADGE;
            case "r" -> ItemType.BOT;
            case "p" -> ItemType.PET;
            default -> ItemType.FLOOR;
        };
    }

    private ItemInteractionType mapInteractionType(String type) {
        if (type == null || type.isEmpty()) return ItemInteractionType.DEFAULT;
        try {
            return ItemInteractionType.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            return ItemInteractionType.DEFAULT;
        }
    }
}
