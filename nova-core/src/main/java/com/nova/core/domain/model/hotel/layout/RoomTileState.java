package com.nova.core.domain.model.hotel.layout;

/**
 * Enumeration of possible room tile states.
 */
public enum RoomTileState {
    /** Tile is open for walking */
    OPEN,
    /** Tile is blocked/wall */
    BLOCKED,
    /** Tile can be sat on */
    SIT,
    /** Tile can be laid on */
    LAY,
    /** Tile is the room entry point */
    ENTRY
}
