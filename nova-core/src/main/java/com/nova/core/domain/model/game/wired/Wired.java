package com.nova.core.domain.model.game.wired;

import com.nova.core.domain.model.hotel.item.Item;
import com.nova.core.domain.model.hotel.item.ItemId;

import java.util.Objects;

/**
 * Domain entity representing a Wired item with its configuration.
 * <p>
 * Wired items are special furniture that can be programmed
 * to create interactive room experiences.
 */
public class Wired {
    private final Item item;
    private final WiredType type;
    private final int subType; // Trigger/Effect/Condition type code
    private WiredData data;

    public Wired(Item item, WiredType type, int subType, WiredData data) {
        this.item = Objects.requireNonNull(item, "Item cannot be null");
        this.type = Objects.requireNonNull(type, "Wired type cannot be null");
        this.subType = subType;
        this.data = data != null ? data : WiredData.empty();
    }

    public static Wired trigger(Item item, WiredTriggerType triggerType) {
        return new Wired(item, WiredType.TRIGGER, triggerType.getCode(), WiredData.empty());
    }

    public static Wired effect(Item item, WiredEffectType effectType) {
        return new Wired(item, WiredType.EFFECT, effectType.getCode(), WiredData.empty());
    }

    public static Wired condition(Item item, WiredConditionType conditionType) {
        return new Wired(item, WiredType.CONDITION, conditionType.getCode(), WiredData.empty());
    }

    // ============== Configuration ==============

    public void configure(WiredData newData) {
        this.data = newData != null ? newData : WiredData.empty();
    }

    public void setDelay(int delay) {
        this.data = data.withDelay(delay);
    }

    public void setMessage(String message) {
        this.data = data.withStringParam(message);
    }

    // ============== Type Checks ==============

    public boolean isTrigger() { return type == WiredType.TRIGGER; }
    public boolean isEffect() { return type == WiredType.EFFECT; }
    public boolean isCondition() { return type == WiredType.CONDITION; }
    public boolean isAddon() { return type == WiredType.ADDON; }

    public WiredTriggerType getTriggerType() {
        if (!isTrigger()) return null;
        return WiredTriggerType.fromCode(subType);
    }

    public WiredEffectType getEffectType() {
        if (!isEffect()) return null;
        return WiredEffectType.fromCode(subType);
    }

    public WiredConditionType getConditionType() {
        if (!isCondition()) return null;
        return WiredConditionType.fromCode(subType);
    }

    // ============== Getters ==============

    public Item getItem() { return item; }
    public ItemId getItemId() { return item.getId(); }
    public WiredType getType() { return type; }
    public int getSubType() { return subType; }
    public WiredData getData() { return data; }
    public int getDelay() { return data.delay(); }
    public String getMessage() { return data.stringParam(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wired wired = (Wired) o;
        return Objects.equals(item.getId(), wired.item.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(item.getId());
    }

    @Override
    public String toString() {
        return "Wired{item=" + item.getId() + ", type=" + type + ", subType=" + subType + "}";
    }
}
