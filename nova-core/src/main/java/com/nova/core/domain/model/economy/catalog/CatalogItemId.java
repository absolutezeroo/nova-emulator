package com.nova.core.domain.model.economy.catalog;

/**
 * Value Object representing a Catalog Item's unique identifier.
 */
public record CatalogItemId(int value) {

    public CatalogItemId {
        if (value <= 0) {
            throw new IllegalArgumentException("Catalog Item ID must be positive");
        }
    }

    public static CatalogItemId of(int value) {
        return new CatalogItemId(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
