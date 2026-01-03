package com.nova.core.domain.model.economy.trade;

/**
 * Enumeration of trade states.
 */
public enum TradeState {
    /** Trade is active, items can be added/removed */
    OPEN,
    /** One party has accepted */
    WAITING_CONFIRMATION,
    /** Both parties accepted, awaiting final confirm */
    ACCEPTED,
    /** Trade completed successfully */
    COMPLETED,
    /** Trade was cancelled */
    CANCELLED
}
