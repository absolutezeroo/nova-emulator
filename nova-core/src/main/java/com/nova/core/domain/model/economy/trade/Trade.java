package com.nova.core.domain.model.economy.trade;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.item.Item;
import com.nova.core.domain.model.hotel.room.RoomId;

import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Domain entity representing a trade between two users.
 */
public class Trade {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(0);

    private final int id;
    private final RoomId roomId;
    private final TradeParticipant userOne;
    private final TradeParticipant userTwo;
    private final Instant createdAt;

    private TradeState state;

    public Trade(RoomId roomId, UserId userOneId, String userOneName,
                 UserId userTwoId, String userTwoName) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.roomId = Objects.requireNonNull(roomId, "Room ID cannot be null");
        this.userOne = new TradeParticipant(userOneId, userOneName);
        this.userTwo = new TradeParticipant(userTwoId, userTwoName);
        this.createdAt = Instant.now();
        this.state = TradeState.OPEN;
    }

    // ============== Participant Access ==============

    public TradeParticipant getParticipant(UserId userId) {
        if (userOne.getUserId().equals(userId)) return userOne;
        if (userTwo.getUserId().equals(userId)) return userTwo;
        return null;
    }

    public TradeParticipant getOtherParticipant(UserId userId) {
        if (userOne.getUserId().equals(userId)) return userTwo;
        if (userTwo.getUserId().equals(userId)) return userOne;
        return null;
    }

    public boolean isParticipant(UserId userId) {
        return userOne.getUserId().equals(userId) || userTwo.getUserId().equals(userId);
    }

    // ============== Item Management ==============

    public boolean offerItem(UserId userId, Item item) {
        if (state != TradeState.OPEN) return false;

        TradeParticipant participant = getParticipant(userId);
        if (participant == null) return false;

        boolean added = participant.offerItem(item);
        if (added) {
            // Reset both acceptances when items change
            userOne.unaccept();
            userTwo.unaccept();
        }
        return added;
    }

    public boolean removeItem(UserId userId, Item item) {
        if (state != TradeState.OPEN) return false;

        TradeParticipant participant = getParticipant(userId);
        if (participant == null) return false;

        boolean removed = participant.removeItem(item);
        if (removed) {
            userOne.unaccept();
            userTwo.unaccept();
        }
        return removed;
    }

    // ============== Trade Flow ==============

    public boolean accept(UserId userId) {
        if (state != TradeState.OPEN && state != TradeState.WAITING_CONFIRMATION) return false;

        TradeParticipant participant = getParticipant(userId);
        if (participant == null) return false;

        participant.accept();

        if (userOne.isAccepted() && userTwo.isAccepted()) {
            state = TradeState.ACCEPTED;
        } else {
            state = TradeState.WAITING_CONFIRMATION;
        }

        return true;
    }

    public boolean unaccept(UserId userId) {
        if (state != TradeState.WAITING_CONFIRMATION && state != TradeState.ACCEPTED) return false;

        TradeParticipant participant = getParticipant(userId);
        if (participant == null) return false;

        participant.unaccept();
        state = TradeState.OPEN;

        return true;
    }

    public boolean confirm(UserId userId) {
        if (state != TradeState.ACCEPTED) return false;

        TradeParticipant participant = getParticipant(userId);
        if (participant == null) return false;

        participant.confirm();

        if (userOne.isConfirmed() && userTwo.isConfirmed()) {
            state = TradeState.COMPLETED;
            return true;
        }

        return false;
    }

    public void cancel() {
        if (state != TradeState.COMPLETED) {
            state = TradeState.CANCELLED;
        }
    }

    // ============== Exchange ==============

    /**
     * Execute the item exchange. Called when trade is completed.
     * Returns true if exchange was successful.
     */
    public boolean executeExchange() {
        if (state != TradeState.COMPLETED) return false;

        // Transfer items from userOne to userTwo
        for (Item item : userOne.getOfferedItems()) {
            item.transferTo(userTwo.getUserId());
        }

        // Transfer items from userTwo to userOne
        for (Item item : userTwo.getOfferedItems()) {
            item.transferTo(userOne.getUserId());
        }

        return true;
    }

    // ============== State Checks ==============

    public boolean isOpen() { return state == TradeState.OPEN; }
    public boolean isWaitingConfirmation() { return state == TradeState.WAITING_CONFIRMATION; }
    public boolean isAccepted() { return state == TradeState.ACCEPTED; }
    public boolean isCompleted() { return state == TradeState.COMPLETED; }
    public boolean isCancelled() { return state == TradeState.CANCELLED; }
    public boolean isActive() { return state == TradeState.OPEN || state == TradeState.WAITING_CONFIRMATION || state == TradeState.ACCEPTED; }

    // ============== Getters ==============

    public int getId() { return id; }
    public RoomId getRoomId() { return roomId; }
    public TradeParticipant getUserOne() { return userOne; }
    public TradeParticipant getUserTwo() { return userTwo; }
    public TradeState getState() { return state; }
    public Instant getCreatedAt() { return createdAt; }

    public List<Item> getItemsForUser(UserId userId) {
        TradeParticipant participant = getParticipant(userId);
        return participant != null ? participant.getOfferedItems() : List.of();
    }

    @Override
    public String toString() {
        return "Trade{id=" + id + ", " + userOne.getUsername() + " <-> " + userTwo.getUsername() +
               ", state=" + state + "}";
    }
}
