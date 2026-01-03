package com.nova.core.domain.model.game.games;

/**
 * Enumeration of game states.
 */
public enum GameState {
    /** Game is idle, waiting to start */
    IDLE,
    /** Game is starting (countdown) */
    STARTING,
    /** Game is in progress */
    RUNNING,
    /** Game is ending */
    ENDING,
    /** Game has ended */
    ENDED
}
