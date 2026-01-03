package com.nova.core.domain.model.hotel.item;

import java.util.Objects;

/**
 * Domain entity representing an item definition (furniture template).
 * <p>
 * Corresponds to 'item_definitions' table.
 * This is the base template - Item instances reference this.
 */
public record ItemDefinition(
        int id,
        String spriteId,
        String publicName,
        ItemType type,
        int width,
        int length,
        double stackHeight,
        boolean canStack,
        boolean canSit,
        boolean canWalk,
        boolean canLay,
        boolean canRecycle,
        boolean canTrade,
        boolean canSell,
        boolean canGift,
        boolean canInventoryStack,
        ItemInteractionType interactionType,
        int interactionModesCount,
        String customParams,
        int effectIdMale,
        int effectIdFemale,
        int clothingOnWalk
) {
    public ItemDefinition {
        Objects.requireNonNull(spriteId, "Sprite ID cannot be null");
        publicName = publicName != null ? publicName : spriteId;
        type = type != null ? type : ItemType.FLOOR;
        width = Math.max(1, width);
        length = Math.max(1, length);
        interactionType = interactionType != null ? interactionType : ItemInteractionType.DEFAULT;
        customParams = customParams != null ? customParams : "";
    }

    public static ItemDefinition basic(int id, String spriteId, ItemType type) {
        return new ItemDefinition(
            id, spriteId, spriteId, type,
            1, 1, 0.0,
            true, false, true, false,
            true, true, true, true, true,
            ItemInteractionType.DEFAULT, 1, "",
            0, 0, 0
        );
    }

    // ============== Type Checks ==============

    public boolean isFloorItem() {
        return type.isFloorItem();
    }

    public boolean isWallItem() {
        return type.isWallItem();
    }

    public boolean isSeat() {
        return canSit;
    }

    public boolean isBed() {
        return canLay;
    }

    public boolean isWired() {
        return interactionType.isWired();
    }

    public boolean isGameItem() {
        return interactionType.isGame();
    }

    // ============== Dimension Helpers ==============

    /**
     * Get the total tiles this item occupies.
     */
    public int getTileCount() {
        return width * length;
    }

    /**
     * Check if this item occupies a position (for rotated items).
     */
    public boolean occupies(int baseX, int baseY, int rotation, int checkX, int checkY) {
        int w = (rotation == 0 || rotation == 4) ? width : length;
        int l = (rotation == 0 || rotation == 4) ? length : width;

        return checkX >= baseX && checkX < baseX + w &&
               checkY >= baseY && checkY < baseY + l;
    }

    @Override
    public String toString() {
        return "ItemDefinition{id=" + id + ", sprite='" + spriteId + "', type=" + type + "}";
    }
}
