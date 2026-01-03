package com.nova.core.domain.model.economy.catalog;

import java.util.*;

/**
 * Domain entity representing a catalog page.
 * <p>
 * Corresponds to 'catalog_pages' table.
 */
public class CatalogPage {
    private final CatalogPageId id;
    private final CatalogPageId parentId;

    private String caption;
    private String pageName;
    private String pageLayout;
    private int iconColor;
    private int iconImage;

    private boolean enabled;
    private boolean visible;
    private int minRank;
    private boolean clubOnly;
    private boolean vipOnly;

    private int order;

    // Page content
    private String headerImage;
    private String teaserImage;
    private String specialImage;
    private String pageText1;
    private String pageText2;
    private String pageTextDetails;
    private String pageTextTeaser;

    // Items on this page
    private final List<CatalogItem> items;

    public CatalogPage(CatalogPageId id, CatalogPageId parentId, String caption, String pageName,
                       String pageLayout, int iconColor, int iconImage, boolean enabled,
                       boolean visible, int minRank, boolean clubOnly, boolean vipOnly, int order) {
        this.id = Objects.requireNonNull(id, "Page ID cannot be null");
        this.parentId = parentId != null ? parentId : CatalogPageId.root();
        this.caption = caption != null ? caption : "";
        this.pageName = pageName != null ? pageName : "";
        this.pageLayout = pageLayout != null ? pageLayout : "default_3x3";
        this.iconColor = iconColor;
        this.iconImage = iconImage;
        this.enabled = enabled;
        this.visible = visible;
        this.minRank = minRank;
        this.clubOnly = clubOnly;
        this.vipOnly = vipOnly;
        this.order = order;
        this.headerImage = "";
        this.teaserImage = "";
        this.specialImage = "";
        this.pageText1 = "";
        this.pageText2 = "";
        this.pageTextDetails = "";
        this.pageTextTeaser = "";
        this.items = new ArrayList<>();
    }

    // ============== Content ==============

    public void setContent(String headerImage, String teaserImage, String specialImage,
                          String pageText1, String pageText2, String pageTextDetails, String pageTextTeaser) {
        this.headerImage = headerImage != null ? headerImage : "";
        this.teaserImage = teaserImage != null ? teaserImage : "";
        this.specialImage = specialImage != null ? specialImage : "";
        this.pageText1 = pageText1 != null ? pageText1 : "";
        this.pageText2 = pageText2 != null ? pageText2 : "";
        this.pageTextDetails = pageTextDetails != null ? pageTextDetails : "";
        this.pageTextTeaser = pageTextTeaser != null ? pageTextTeaser : "";
    }

    // ============== Item Management ==============

    public void addItem(CatalogItem item) {
        if (item != null && !items.contains(item)) {
            items.add(item);
        }
    }

    public void removeItem(CatalogItem item) {
        items.remove(item);
    }

    public Optional<CatalogItem> getItem(int itemId) {
        return items.stream()
            .filter(i -> i.getId().value() == itemId)
            .findFirst();
    }

    // ============== Access Checks ==============

    public boolean canAccess(int userRank, boolean hasClub, boolean isVip) {
        if (!enabled || !visible) return false;
        if (userRank < minRank) return false;
        if (clubOnly && !hasClub) return false;
        if (vipOnly && !isVip) return false;
        return true;
    }

    public boolean isRootPage() {
        return parentId.isRoot();
    }

    // ============== Setters ==============

    public void setCaption(String caption) { this.caption = caption; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public void setVisible(boolean visible) { this.visible = visible; }
    public void setOrder(int order) { this.order = order; }

    // ============== Getters ==============

    public CatalogPageId getId() { return id; }
    public CatalogPageId getParentId() { return parentId; }
    public String getCaption() { return caption; }
    public String getPageName() { return pageName; }
    public String getPageLayout() { return pageLayout; }
    public int getIconColor() { return iconColor; }
    public int getIconImage() { return iconImage; }
    public boolean isEnabled() { return enabled; }
    public boolean isVisible() { return visible; }
    public int getMinRank() { return minRank; }
    public boolean isClubOnly() { return clubOnly; }
    public boolean isVipOnly() { return vipOnly; }
    public int getOrder() { return order; }

    public String getHeaderImage() { return headerImage; }
    public String getTeaserImage() { return teaserImage; }
    public String getSpecialImage() { return specialImage; }
    public String getPageText1() { return pageText1; }
    public String getPageText2() { return pageText2; }
    public String getPageTextDetails() { return pageTextDetails; }
    public String getPageTextTeaser() { return pageTextTeaser; }

    public List<CatalogItem> getItems() { return Collections.unmodifiableList(items); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatalogPage that = (CatalogPage) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CatalogPage{id=" + id + ", caption='" + caption + "'}";
    }
}
