package com.nova.core.domain.model.economy.catalog;

import com.nova.core.domain.model.hotel.item.ItemDefinition;

import java.util.Objects;

/**
 * Domain entity representing a catalog item for sale.
 * <p>
 * Corresponds to 'catalog_items' table.
 */
public class CatalogItem {
    private final CatalogItemId id;
    private final CatalogPageId pageId;
    private final ItemDefinition itemDefinition;

    private String catalogName;
    private int costCredits;
    private int costPixels;
    private int costDiamonds;
    private int amount;

    private boolean enabled;
    private int limitedStack;
    private int limitedSold;
    private boolean clubOnly;
    private boolean allowBundle;

    private String extraData;
    private String badge;
    private int offerId;

    public CatalogItem(CatalogItemId id, CatalogPageId pageId, ItemDefinition itemDefinition,
                       String catalogName, int costCredits, int costPixels, int costDiamonds,
                       int amount, boolean enabled, int limitedStack, int limitedSold,
                       boolean clubOnly, boolean allowBundle, String extraData, String badge, int offerId) {
        this.id = Objects.requireNonNull(id, "Item ID cannot be null");
        this.pageId = Objects.requireNonNull(pageId, "Page ID cannot be null");
        this.itemDefinition = Objects.requireNonNull(itemDefinition, "Item definition cannot be null");
        this.catalogName = catalogName != null ? catalogName : itemDefinition.spriteId();
        this.costCredits = Math.max(0, costCredits);
        this.costPixels = Math.max(0, costPixels);
        this.costDiamonds = Math.max(0, costDiamonds);
        this.amount = Math.max(1, amount);
        this.enabled = enabled;
        this.limitedStack = Math.max(0, limitedStack);
        this.limitedSold = Math.max(0, limitedSold);
        this.clubOnly = clubOnly;
        this.allowBundle = allowBundle;
        this.extraData = extraData != null ? extraData : "";
        this.badge = badge != null ? badge : "";
        this.offerId = offerId;
    }

    // ============== Purchase ==============

    public boolean canPurchase(int credits, int pixels, int diamonds, boolean hasClub) {
        if (!enabled) return false;
        if (clubOnly && !hasClub) return false;
        if (isLimited() && isSoldOut()) return false;
        if (credits < costCredits) return false;
        if (pixels < costPixels) return false;
        if (diamonds < costDiamonds) return false;
        return true;
    }

    public void recordPurchase() {
        if (isLimited()) {
            this.limitedSold++;
        }
    }

    // ============== Limited Edition ==============

    public boolean isLimited() {
        return limitedStack > 0;
    }

    public boolean isSoldOut() {
        return isLimited() && limitedSold >= limitedStack;
    }

    public int getRemainingStock() {
        if (!isLimited()) return -1;
        return Math.max(0, limitedStack - limitedSold);
    }

    // ============== Helpers ==============

    public boolean hasBadge() {
        return badge != null && !badge.isEmpty();
    }

    public boolean isFree() {
        return costCredits == 0 && costPixels == 0 && costDiamonds == 0;
    }

    public int getTotalCost() {
        return costCredits + costPixels + costDiamonds;
    }

    // ============== Setters ==============

    public void setEnabled(boolean enabled) { this.enabled = enabled; }
    public void setPrices(int credits, int pixels, int diamonds) {
        this.costCredits = Math.max(0, credits);
        this.costPixels = Math.max(0, pixels);
        this.costDiamonds = Math.max(0, diamonds);
    }

    // ============== Getters ==============

    public CatalogItemId getId() { return id; }
    public CatalogPageId getPageId() { return pageId; }
    public ItemDefinition getItemDefinition() { return itemDefinition; }
    public int getDefinitionId() { return itemDefinition.id(); }
    public String getSpriteId() { return itemDefinition.spriteId(); }

    public String getCatalogName() { return catalogName; }
    public int getCostCredits() { return costCredits; }
    public int getCostPixels() { return costPixels; }
    public int getCostDiamonds() { return costDiamonds; }
    public int getAmount() { return amount; }

    public boolean isEnabled() { return enabled; }
    public int getLimitedStack() { return limitedStack; }
    public int getLimitedSold() { return limitedSold; }
    public boolean isClubOnly() { return clubOnly; }
    public boolean isAllowBundle() { return allowBundle; }

    public String getExtraData() { return extraData; }
    public String getBadge() { return badge; }
    public int getOfferId() { return offerId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatalogItem that = (CatalogItem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CatalogItem{id=" + id + ", name='" + catalogName + "', price=" + costCredits + "c}";
    }
}
