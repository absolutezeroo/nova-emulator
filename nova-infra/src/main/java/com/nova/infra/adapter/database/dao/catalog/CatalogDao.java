package com.nova.infra.adapter.database.dao.catalog;

import com.nova.infra.adapter.database.entity.catalog.CatalogItemEntity;
import com.nova.infra.adapter.database.entity.catalog.CatalogPageEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;
import java.util.Optional;

/**
 * Jdbi DAO for 'catalog_pages' and 'catalog_items' tables.
 */
public interface CatalogDao {

    // ==================== PAGES ====================

    @SqlQuery("""
            SELECT id, parent_id AS parentId, caption, page_link AS pageLink, icon_image AS iconImage,
                   icon_color AS iconColor, min_rank AS minRank, is_visible AS isVisible,
                   is_enabled AS isEnabled, is_club_only AS isClubOnly, page_layout AS pageLayout,
                   page_headline AS pageHeadline, page_teaser AS pageTeaser, page_special AS pageSpecial,
                   page_text1 AS pageText1, page_text2 AS pageText2, page_text_details AS pageTextDetails,
                   page_text_teaser AS pageTextTeaser, order_num AS orderNum
            FROM catalog_pages WHERE id = :id
            """)
    @RegisterConstructorMapper(CatalogPageEntity.class)
    Optional<CatalogPageEntity> findPageById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, parent_id AS parentId, caption, page_link AS pageLink, icon_image AS iconImage,
                   icon_color AS iconColor, min_rank AS minRank, is_visible AS isVisible,
                   is_enabled AS isEnabled, is_club_only AS isClubOnly, page_layout AS pageLayout,
                   page_headline AS pageHeadline, page_teaser AS pageTeaser, page_special AS pageSpecial,
                   page_text1 AS pageText1, page_text2 AS pageText2, page_text_details AS pageTextDetails,
                   page_text_teaser AS pageTextTeaser, order_num AS orderNum
            FROM catalog_pages WHERE parent_id = :parentId AND is_visible = TRUE ORDER BY order_num, id
            """)
    @RegisterConstructorMapper(CatalogPageEntity.class)
    List<CatalogPageEntity> findChildPages(@Bind("parentId") int parentId);

    @SqlQuery("""
            SELECT id, parent_id AS parentId, caption, page_link AS pageLink, icon_image AS iconImage,
                   icon_color AS iconColor, min_rank AS minRank, is_visible AS isVisible,
                   is_enabled AS isEnabled, is_club_only AS isClubOnly, page_layout AS pageLayout,
                   page_headline AS pageHeadline, page_teaser AS pageTeaser, page_special AS pageSpecial,
                   page_text1 AS pageText1, page_text2 AS pageText2, page_text_details AS pageTextDetails,
                   page_text_teaser AS pageTextTeaser, order_num AS orderNum
            FROM catalog_pages WHERE parent_id = -1 AND is_visible = TRUE ORDER BY order_num, id
            """)
    @RegisterConstructorMapper(CatalogPageEntity.class)
    List<CatalogPageEntity> findRootPages();

    @SqlQuery("""
            SELECT id, parent_id AS parentId, caption, page_link AS pageLink, icon_image AS iconImage,
                   icon_color AS iconColor, min_rank AS minRank, is_visible AS isVisible,
                   is_enabled AS isEnabled, is_club_only AS isClubOnly, page_layout AS pageLayout,
                   page_headline AS pageHeadline, page_teaser AS pageTeaser, page_special AS pageSpecial,
                   page_text1 AS pageText1, page_text2 AS pageText2, page_text_details AS pageTextDetails,
                   page_text_teaser AS pageTextTeaser, order_num AS orderNum
            FROM catalog_pages ORDER BY order_num, id
            """)
    @RegisterConstructorMapper(CatalogPageEntity.class)
    List<CatalogPageEntity> findAllPages();

    // ==================== ITEMS ====================

    @SqlQuery("""
            SELECT id, page_id AS pageId, item_definition_id AS itemDefinitionId, catalog_name AS catalogName,
                   cost_credits AS costCredits, cost_points AS costPoints, points_type AS pointsType,
                   amount, limited_total AS limitedTotal, limited_sold AS limitedSold,
                   is_club_only AS isClubOnly, extradata, badge_id AS badgeId, offer_active AS offerActive,
                   order_num AS orderNum
            FROM catalog_items WHERE id = :id
            """)
    @RegisterConstructorMapper(CatalogItemEntity.class)
    Optional<CatalogItemEntity> findItemById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, page_id AS pageId, item_definition_id AS itemDefinitionId, catalog_name AS catalogName,
                   cost_credits AS costCredits, cost_points AS costPoints, points_type AS pointsType,
                   amount, limited_total AS limitedTotal, limited_sold AS limitedSold,
                   is_club_only AS isClubOnly, extradata, badge_id AS badgeId, offer_active AS offerActive,
                   order_num AS orderNum
            FROM catalog_items WHERE page_id = :pageId ORDER BY order_num, id
            """)
    @RegisterConstructorMapper(CatalogItemEntity.class)
    List<CatalogItemEntity> findItemsByPageId(@Bind("pageId") int pageId);

    @SqlQuery("""
            SELECT id, page_id AS pageId, item_definition_id AS itemDefinitionId, catalog_name AS catalogName,
                   cost_credits AS costCredits, cost_points AS costPoints, points_type AS pointsType,
                   amount, limited_total AS limitedTotal, limited_sold AS limitedSold,
                   is_club_only AS isClubOnly, extradata, badge_id AS badgeId, offer_active AS offerActive,
                   order_num AS orderNum
            FROM catalog_items ORDER BY page_id, order_num, id
            """)
    @RegisterConstructorMapper(CatalogItemEntity.class)
    List<CatalogItemEntity> findAllItems();

    @SqlQuery("""
            SELECT id, page_id AS pageId, item_definition_id AS itemDefinitionId, catalog_name AS catalogName,
                   cost_credits AS costCredits, cost_points AS costPoints, points_type AS pointsType,
                   amount, limited_total AS limitedTotal, limited_sold AS limitedSold,
                   is_club_only AS isClubOnly, extradata, badge_id AS badgeId, offer_active AS offerActive,
                   order_num AS orderNum
            FROM catalog_items WHERE catalog_name LIKE :query LIMIT :limit
            """)
    @RegisterConstructorMapper(CatalogItemEntity.class)
    List<CatalogItemEntity> searchItems(@Bind("query") String query, @Bind("limit") int limit);
}
