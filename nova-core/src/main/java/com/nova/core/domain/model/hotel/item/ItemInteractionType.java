package com.nova.core.domain.model.hotel.item;

/**
 * Enumeration of item interaction types.
 * <p>
 * Defines how items behave when interacted with.
 */
public enum ItemInteractionType {
    // Basic interactions
    DEFAULT,
    GATE,
    TELEPORT,
    DICE,
    TROPHY,
    BED,
    PRESSUREPLATE,
    ROLLER,

    // Switches
    SWITCH,
    ONE_WAY_GATE,
    VENDINGMACHINE,

    // Wired
    WIRED_TRIGGER,
    WIRED_EFFECT,
    WIRED_CONDITION,
    WIRED_EXTRA,

    // Special furniture
    MANNEQUIN,
    JUKEBOX,
    CRACKABLE,
    NEST,
    PET_FOOD,
    PET_TOY,
    PET_DRINK,

    // Games
    FREEZE_TILE,
    FREEZE_GATE,
    FREEZE_BLOCK,
    BATTLE_BANZAI_TILE,
    BATTLE_BANZAI_GATE,
    BATTLE_BANZAI_SCOREBOARD,
    FOOTBALL_GOAL,
    FOOTBALL,

    // Guild/Group
    GUILD_GATE,
    GUILD_FORUM,

    // Effects
    EFFECT_TILE,
    FX_PROVIDER,

    // Stackable
    STACKTOOL,

    // Decoration
    BACKGROUND,
    WALLPAPER,
    FLOOR_PAPER,
    LANDSCAPE,

    // Gift
    GIFT,
    MYSTERY_BOX;

    public boolean isWired() {
        return this == WIRED_TRIGGER || this == WIRED_EFFECT ||
               this == WIRED_CONDITION || this == WIRED_EXTRA;
    }

    public boolean isGame() {
        return name().startsWith("FREEZE_") || name().startsWith("BATTLE_BANZAI_") ||
               name().startsWith("FOOTBALL");
    }
}
