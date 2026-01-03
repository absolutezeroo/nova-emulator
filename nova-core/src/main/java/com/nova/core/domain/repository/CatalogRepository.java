package com.nova.core.domain.repository;

import com.nova.core.domain.model.economy.catalog.CatalogItem;
import com.nova.core.domain.model.economy.catalog.CatalogItemId;
import com.nova.core.domain.model.economy.catalog.CatalogPage;
import com.nova.core.domain.model.economy.catalog.CatalogPageId;

import java.util.List;
import java.util.Optional;

/**
 * Output Port (Secondary/Driven Port) - Repository interface.
 * <p>
 * Defines persistence operations for Catalog (pages and items).
 * Implemented by infrastructure adapters (MySQL repository).
 */
public interface CatalogRepository {

    // ============== Page Operations ==============

    /**
     * Finds a catalog page by ID.
     *
     * @param pageId The page ID
     * @return The page if found
     */
    Optional<CatalogPage> findPageById(CatalogPageId pageId);

    /**
     * Finds a catalog page by name.
     *
     * @param pageName The page name
     * @return The page if found
     */
    Optional<CatalogPage> findPageByName(String pageName);

    /**
     * Gets all root catalog pages (no parent).
     *
     * @return List of root pages
     */
    List<CatalogPage> findRootPages();

    /**
     * Gets child pages of a parent page.
     *
     * @param parentId The parent page ID
     * @return List of child pages
     */
    List<CatalogPage> findChildPages(CatalogPageId parentId);

    /**
     * Gets all catalog pages.
     *
     * @return List of all pages
     */
    List<CatalogPage> findAllPages();

    /**
     * Saves a catalog page.
     *
     * @param page The page to save
     * @return The saved page
     */
    CatalogPage savePage(CatalogPage page);

    // ============== Item Operations ==============

    /**
     * Finds a catalog item by ID.
     *
     * @param itemId The catalog item ID
     * @return The item if found
     */
    Optional<CatalogItem> findItemById(CatalogItemId itemId);

    /**
     * Gets all items on a catalog page.
     *
     * @param pageId The page ID
     * @return List of items on the page
     */
    List<CatalogItem> findItemsByPageId(CatalogPageId pageId);

    /**
     * Searches catalog items by name.
     *
     * @param query Search query
     * @param limit Maximum results
     * @return List of matching items
     */
    List<CatalogItem> searchItems(String query, int limit);

    /**
     * Saves a catalog item.
     *
     * @param item The item to save
     * @return The saved item
     */
    CatalogItem saveItem(CatalogItem item);

    /**
     * Updates the limited edition count for an item.
     *
     * @param itemId The item ID
     * @param soldCount New sold count
     */
    void updateLimitedSold(CatalogItemId itemId, int soldCount);
}
