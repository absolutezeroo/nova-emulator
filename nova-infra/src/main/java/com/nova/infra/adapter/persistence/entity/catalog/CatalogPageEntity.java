package com.nova.infra.adapter.persistence.entity.catalog;

/**
 * Database entity record mapping to the 'catalog_pages' table.
 * <p>
 * Catalog navigation pages.
 */
public record CatalogPageEntity(
        int id,
        Integer parentId,
        String name,
        String caption,
        int iconImage,
        String pageLayout,
        int minRank,
        boolean isVisible,
        boolean isEnabled,
        boolean isClubOnly,
        int orderNum,
        // Page content
        String headerImage,
        String teaserImage,
        String specialImage,
        String pageText1,
        String pageText2,
        String pageTextDetails
) {}
