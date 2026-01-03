package com.nova.core.domain.model.economy.trade;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.item.Item;

import java.util.*;

/**
 * Value Object representing a trade participant and their offered items.
 */
public class TradeParticipant {
    private final UserId userId;
    private final String username;
    private final List<Item> offeredItems;
    private boolean accepted;
    private boolean confirmed;

    public TradeParticipant(UserId userId, String username) {
        this.userId = Objects.requireNonNull(userId, "User ID cannot be null");
        this.username = username != null ? username : "";
        this.offeredItems = new ArrayList<>();
        this.accepted = false;
        this.confirmed = false;
    }

    // ============== Item Management ==============

    public boolean offerItem(Item item) {
        if (item == null) return false;
        if (!item.isOwnedBy(userId)) return false;
        if (!item.canTrade()) return false;
        if (offeredItems.contains(item)) return false;
        if (offeredItems.size() >= 9) return false; // Max 9 items per trade

        offeredItems.add(item);
        resetAcceptance();
        return true;
    }

    public boolean removeItem(Item item) {
        boolean removed = offeredItems.remove(item);
        if (removed) resetAcceptance();
        return removed;
    }

    public void clearItems() {
        offeredItems.clear();
        resetAcceptance();
    }

    // ============== Acceptance ==============

    public void accept() {
        this.accepted = true;
    }

    public void unaccept() {
        this.accepted = false;
        this.confirmed = false;
    }

    public void confirm() {
        if (accepted) {
            this.confirmed = true;
        }
    }

    private void resetAcceptance() {
        this.accepted = false;
        this.confirmed = false;
    }

    // ============== Getters ==============

    public UserId getUserId() { return userId; }
    public String getUsername() { return username; }
    public List<Item> getOfferedItems() { return Collections.unmodifiableList(offeredItems); }
    public int getItemCount() { return offeredItems.size(); }
    public boolean hasItems() { return !offeredItems.isEmpty(); }
    public boolean isAccepted() { return accepted; }
    public boolean isConfirmed() { return confirmed; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradeParticipant that = (TradeParticipant) o;
        return Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
