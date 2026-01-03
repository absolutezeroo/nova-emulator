package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

import java.util.List;

/**
 * Sends the user's effect inventory to the client.
 */
public record AvatarEffectsMessage(
    List<Effect> effects
) implements IOutgoingPacket {

    /**
     * An effect in the user's inventory.
     */
    public record Effect(
        int effectId,
        int subType,
        int duration,
        int quantity,
        int secondsRemaining,
        boolean isPermanent
    ) {}

    /**
     * Creates an empty effects message (no effects owned).
     */
    public static AvatarEffectsMessage empty() {
        return new AvatarEffectsMessage(List.of());
    }
}
