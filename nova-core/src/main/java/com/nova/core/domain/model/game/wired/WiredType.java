package com.nova.core.domain.model.game.wired;

/**
 * Enumeration of Wired types.
 */
public enum WiredType {
    /** Triggers an effect when condition is met */
    TRIGGER,
    /** Performs an action */
    EFFECT,
    /** Conditions that must be met */
    CONDITION,
    /** Special/addon wired */
    ADDON
}
