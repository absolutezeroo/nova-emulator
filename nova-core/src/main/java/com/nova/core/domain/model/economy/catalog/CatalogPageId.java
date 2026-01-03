package com.nova.core.domain.model.economy.catalog;

/**
 * Value Object representing a Catalog Page's unique identifier.
 */
public record CatalogPageId(int value) {

    public CatalogPageId {
        if (value < 0) {
            throw new IllegalArgumentException("Catalog Page ID cannot be negative");
        }
    }

    public static CatalogPageId of(int value) {
        return new CatalogPageId(value);
    }

    public static CatalogPageId root() {
        return new CatalogPageId(-1);
    }

    public boolean isRoot() {
        return value == -1;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
