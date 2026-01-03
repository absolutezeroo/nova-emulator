package com.nova.core.domain.model.hotel.item;

/**
 * Value Object representing an Item's unique identifier.
 */
public record ItemId(int value) {

    public ItemId {
        if (value <= 0) {
            throw new IllegalArgumentException("Item ID must be positive");
        }
    }

    public static ItemId of(int value) {
        return new ItemId(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
