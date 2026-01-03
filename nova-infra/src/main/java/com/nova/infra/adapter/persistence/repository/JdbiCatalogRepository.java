package com.nova.infra.adapter.persistence.repository;

import com.nova.core.domain.model.economy.catalog.*;
import com.nova.core.domain.model.hotel.item.ItemDefinition;
import com.nova.core.domain.repository.CatalogRepository;
import com.nova.core.domain.repository.ItemRepository;
import com.nova.infra.adapter.persistence.dao.catalog.CatalogDao;
import com.nova.infra.adapter.persistence.entity.catalog.CatalogItemEntity;
import com.nova.infra.adapter.persistence.entity.catalog.CatalogPageEntity;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Jdbi implementation of CatalogRepository (Output Adapter).
 * <p>
 * Maps between domain Catalog entities and database tables:
 * - catalog_pages
 * - catalog_items
 */
@Singleton
public class JdbiCatalogRepository implements CatalogRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdbiCatalogRepository.class);

    private final Jdbi jdbi;
    private final ItemRepository itemRepository;

    @Inject
    public JdbiCatalogRepository(Jdbi jdbi, ItemRepository itemRepository) {
        this.jdbi = jdbi;
        this.itemRepository = itemRepository;
    }

    // ============== Page Operations ==============

    @Override
    public Optional<CatalogPage> findPageById(CatalogPageId pageId) {
        try {
            Optional<CatalogPageEntity> entityOpt = jdbi.withExtension(
                    CatalogDao.class,
                    dao -> dao.findPageById(pageId.value())
            );

            if (entityOpt.isEmpty()) {
                return Optional.empty();
            }

            CatalogPage page = mapToPage(entityOpt.get());

            // Load items for this page
            List<CatalogItemEntity> itemEntities = jdbi.withExtension(
                    CatalogDao.class,
                    dao -> dao.findItemsByPageId(pageId.value())
            );

            for (CatalogItemEntity itemEntity : itemEntities) {
                mapToItem(itemEntity).ifPresent(page::addItem);
            }

            return Optional.of(page);
        } catch (Exception e) {
            LOGGER.error("Error finding catalog page by ID: {}", pageId, e);
            return Optional.empty();
        }
    }

    @Override
    public Optional<CatalogPage> findPageByName(String pageName) {
        // Not directly supported - would need to iterate
        return findAllPages().stream()
                .filter(p -> p.getPageName().equalsIgnoreCase(pageName))
                .findFirst();
    }

    @Override
    public List<CatalogPage> findRootPages() {
        try {
            List<CatalogPageEntity> entities = jdbi.withExtension(
                    CatalogDao.class,
                    CatalogDao::findRootPages
            );

            return entities.stream()
                    .map(this::mapToPage)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error finding root catalog pages", e);
            return Collections.emptyList();
        }
    }

    @Override
    public List<CatalogPage> findChildPages(CatalogPageId parentId) {
        try {
            List<CatalogPageEntity> entities = jdbi.withExtension(
                    CatalogDao.class,
                    dao -> dao.findChildPages(parentId.value())
            );

            return entities.stream()
                    .map(this::mapToPage)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error finding child catalog pages for: {}", parentId, e);
            return Collections.emptyList();
        }
    }

    @Override
    public List<CatalogPage> findAllPages() {
        try {
            List<CatalogPageEntity> entities = jdbi.withExtension(
                    CatalogDao.class,
                    CatalogDao::findAllPages
            );

            return entities.stream()
                    .map(this::mapToPage)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error finding all catalog pages", e);
            return Collections.emptyList();
        }
    }

    @Override
    public CatalogPage savePage(CatalogPage page) {
        // Not implemented - catalog pages are typically read-only
        LOGGER.warn("CatalogPage save not implemented");
        return page;
    }

    // ============== Item Operations ==============

    @Override
    public Optional<CatalogItem> findItemById(CatalogItemId itemId) {
        try {
            Optional<CatalogItemEntity> entityOpt = jdbi.withExtension(
                    CatalogDao.class,
                    dao -> dao.findItemById(itemId.value())
            );

            return entityOpt.flatMap(this::mapToItem);
        } catch (Exception e) {
            LOGGER.error("Error finding catalog item by ID: {}", itemId, e);
            return Optional.empty();
        }
    }

    @Override
    public List<CatalogItem> findItemsByPageId(CatalogPageId pageId) {
        try {
            List<CatalogItemEntity> entities = jdbi.withExtension(
                    CatalogDao.class,
                    dao -> dao.findItemsByPageId(pageId.value())
            );

            return entities.stream()
                    .map(this::mapToItem)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error finding catalog items for page: {}", pageId, e);
            return Collections.emptyList();
        }
    }

    @Override
    public List<CatalogItem> searchItems(String query, int limit) {
        try {
            String searchPattern = "%" + query + "%";
            List<CatalogItemEntity> entities = jdbi.withExtension(
                    CatalogDao.class,
                    dao -> dao.searchItems(searchPattern, limit)
            );

            return entities.stream()
                    .map(this::mapToItem)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error searching catalog items: {}", query, e);
            return Collections.emptyList();
        }
    }

    @Override
    public CatalogItem saveItem(CatalogItem item) {
        // Not implemented - catalog items are typically read-only
        LOGGER.warn("CatalogItem save not implemented");
        return item;
    }

    @Override
    public void updateLimitedSold(CatalogItemId itemId, int soldCount) {
        // Would need to add a DAO method
        LOGGER.warn("updateLimitedSold not implemented");
    }

    // ========================
    // Entity ↔ Domain Mapping
    // ========================

    private CatalogPage mapToPage(CatalogPageEntity entity) {
        CatalogPageId pageId = CatalogPageId.of(entity.id());
        CatalogPageId parentId = entity.parentId() == -1
                ? CatalogPageId.of(0)  // Use 0 as root marker instead of -1
                : CatalogPageId.of(entity.parentId());

        CatalogPage page = new CatalogPage(
                pageId,
                parentId,
                entity.caption(),
                entity.pageLink(),
                entity.pageLayout(),
                entity.iconColor(),
                entity.iconImage(),
                entity.isEnabled(),
                entity.isVisible(),
                entity.minRank(),
                entity.isClubOnly(),
                false, // vipOnly
                entity.orderNum()
        );

        page.setContent(
                entity.pageHeadline(),
                entity.pageTeaser(),
                entity.pageSpecial(),
                entity.pageText1(),
                entity.pageText2(),
                entity.pageTextDetails(),
                entity.pageTextTeaser()
        );

        return page;
    }

    private Optional<CatalogItem> mapToItem(CatalogItemEntity entity) {
        // Need to load the item definition
        Optional<ItemDefinition> defOpt = itemRepository.findDefinitionById(entity.itemDefinitionId());

        if (defOpt.isEmpty()) {
            LOGGER.warn("Catalog item {} has unknown definition: {}", entity.id(), entity.itemDefinitionId());
            return Optional.empty();
        }

        return Optional.of(new CatalogItem(
                CatalogItemId.of(entity.id()),
                CatalogPageId.of(entity.pageId()),
                defOpt.get(),
                entity.catalogName(),
                entity.costCredits(),
                entity.costPoints(),
                0, // costDiamonds
                entity.amount(),
                entity.offerActive(),
                entity.limitedTotal(),
                entity.limitedSold(),
                entity.isClubOnly(),
                true, // allowBundle
                entity.extradata(),
                entity.badgeId(),
                0 // offerId
        ));
    }
}
