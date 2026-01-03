package com.nova.core.domain.model.hotel.item;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.room.RoomId;

import java.util.Objects;

/**
 * Domain entity representing an item instance.
 * <p>
 * Corresponds to 'items' table.
 * This is an instance of an ItemDefinition, placed in room or inventory.
 */
public class Item {
    // Identity
    private final ItemId id;
    private final ItemDefinition definition;

    // Ownership
    private UserId ownerId;
    private RoomId roomId; // null if in inventory

    // Position (for floor items)
    private int x;
    private int y;
    private double z;
    private int rotation;

    // Position (for wall items)
    private String wallPosition;

    // State
    private String extraData;
    private int limitedNumber;
    private int limitedStack;

    public Item(ItemId id, ItemDefinition definition, UserId ownerId) {
        this.id = Objects.requireNonNull(id, "Item ID cannot be null");
        this.definition = Objects.requireNonNull(definition, "Item definition cannot be null");
        this.ownerId = Objects.requireNonNull(ownerId, "Owner ID cannot be null");
        this.roomId = null;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.rotation = 0;
        this.wallPosition = "";
        this.extraData = "0";
        this.limitedNumber = 0;
        this.limitedStack = 0;
    }

    public Item(ItemId id, ItemDefinition definition, UserId ownerId, RoomId roomId,
                int x, int y, double z, int rotation, String extraData) {
        this(id, definition, ownerId);
        this.roomId = roomId;
        this.x = x;
        this.y = y;
        this.z = z;
        this.rotation = rotation;
        this.extraData = extraData != null ? extraData : "0";
    }

    // ============== Placement ==============

    public void placeInRoom(RoomId roomId, int x, int y, double z, int rotation) {
        this.roomId = Objects.requireNonNull(roomId);
        this.x = x;
        this.y = y;
        this.z = z;
        this.rotation = normalizeRotation(rotation);
    }

    public void placeOnWall(RoomId roomId, String wallPosition) {
        this.roomId = Objects.requireNonNull(roomId);
        this.wallPosition = wallPosition;
    }

    public void pickUp() {
        this.roomId = null;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.rotation = 0;
        this.wallPosition = "";
    }

    public void moveTo(int x, int y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setRotation(int rotation) {
        this.rotation = normalizeRotation(rotation);
    }

    private int normalizeRotation(int rotation) {
        return ((rotation % 8) + 8) % 8;
    }

    // ============== State ==============

    public void setExtraData(String data) {
        this.extraData = data != null ? data : "0";
    }

    public void toggleState() {
        try {
            int current = Integer.parseInt(extraData);
            int max = definition.interactionModesCount();
            setExtraData(String.valueOf((current + 1) % max));
        } catch (NumberFormatException e) {
            setExtraData("1");
        }
    }

    public int getState() {
        try {
            return Integer.parseInt(extraData);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // ============== Ownership ==============

    public void transferTo(UserId newOwner) {
        this.ownerId = Objects.requireNonNull(newOwner);
    }

    public boolean isOwnedBy(UserId userId) {
        return ownerId.equals(userId);
    }

    // ============== Location Checks ==============

    public boolean isInRoom() {
        return roomId != null;
    }

    public boolean isInInventory() {
        return roomId == null;
    }

    public boolean isInRoom(RoomId checkRoomId) {
        return roomId != null && roomId.equals(checkRoomId);
    }

    // ============== Type Checks (delegate to definition) ==============

    public boolean isFloorItem() { return definition.isFloorItem(); }
    public boolean isWallItem() { return definition.isWallItem(); }
    public boolean isSeat() { return definition.isSeat(); }
    public boolean isBed() { return definition.isBed(); }
    public boolean isWired() { return definition.isWired(); }
    public boolean canStack() { return definition.canStack(); }
    public boolean canWalk() { return definition.canWalk(); }
    public boolean canTrade() { return definition.canTrade(); }
    public boolean canSell() { return definition.canSell(); }
    public boolean canGift() { return definition.canGift(); }

    // ============== Limited Edition ==============

    public void setLimitedEdition(int number, int stack) {
        this.limitedNumber = number;
        this.limitedStack = stack;
    }

    public boolean isLimitedEdition() {
        return limitedStack > 0;
    }

    // ============== Getters ==============

    public ItemId getId() { return id; }
    public ItemDefinition getDefinition() { return definition; }
    public int getDefinitionId() { return definition.id(); }
    public String getSpriteId() { return definition.spriteId(); }
    public ItemType getType() { return definition.type(); }
    public ItemInteractionType getInteractionType() { return definition.interactionType(); }

    public UserId getOwnerId() { return ownerId; }
    public RoomId getRoomId() { return roomId; }

    public int getX() { return x; }
    public int getY() { return y; }
    public double getZ() { return z; }
    public int getRotation() { return rotation; }
    public String getWallPosition() { return wallPosition; }

    public int getWidth() { return definition.width(); }
    public int getLength() { return definition.length(); }
    public double getStackHeight() { return definition.stackHeight(); }

    public String getExtraData() { return extraData; }
    public int getLimitedNumber() { return limitedNumber; }
    public int getLimitedStack() { return limitedStack; }

    // ============== Equality ==============

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Item{id=" + id + ", sprite='" + getSpriteId() + "', room=" + roomId + "}";
    }
}
