package com.nova.infra.adapter.database.entity.catalog;

/**
 * Database entity record mapping to the 'catalog_items' table.
 * <p>
 * Catalog purchasable items.
 */
public record CatalogItemEntity(
        int id,
        int pageId,
        int definitionId,
        String catalogName,
        int costCredits,
        int costPixels,
        int costDiamonds,
        int amount,
        boolean isLimited,
        int limitedTotal,
        int limitedSold,
        boolean isClubOnly,
        boolean isOffer,
        Integer offerId,
        int orderNum
) {}
