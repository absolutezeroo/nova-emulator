package com.nova.infra.adapter.out.persistence.entity.item;

import java.math.BigDecimal;

/**
 * Database entity record mapping to the 'item_definitions' table.
 * <p>
 * Base item definitions from catalog.
 * Type: s=floor, i=wall, e=effect, b=badge, r=robot, p=pet
 */
public record ItemDefinitionEntity(
        int id,
        int spriteId,
        String itemName,
        String publicName,
        String type,
        int width,
        int length,
        BigDecimal height,
        BigDecimal stackHeight,
        boolean canStack,
        boolean canSit,
        boolean isWalkable,
        boolean canLay,
        boolean canRecycle,
        boolean canTrade,
        boolean canSell,
        boolean canGift,
        boolean canInventoryStack,
        String interactionType,
        int interactionModes,
        String vendingIds,
        Integer effectId,
        Integer wiredId,
        boolean isRare,
        String clothingOnWalk
) {}
