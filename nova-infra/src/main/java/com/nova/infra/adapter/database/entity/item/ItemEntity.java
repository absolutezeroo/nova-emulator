package com.nova.infra.adapter.database.entity.item;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Database entity record mapping to the 'items' table.
 * <p>
 * User-owned items (inventory and placed in rooms).
 */
public record ItemEntity(
        int id,
        int ownerId,
        int definitionId,
        Integer roomId,         // NULL = in inventory
        // Position (only if in room)
        Short x,
        Short y,
        BigDecimal z,
        int rotation,
        String wallPos,         // Wall items position string
        // State
        String extraData,       // JSON extra data
        Integer limitedNumber,
        Integer limitedStack,
        // Gift data
        Integer giftSenderId,
        String giftMessage,
        Integer giftSpriteId,
        Integer giftColor,
        Integer giftRibbon,
        boolean giftShowName,
        Instant createdAt
) {}
