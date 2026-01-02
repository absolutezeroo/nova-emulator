package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record BonusRareInfoMessage(
    String productType,
    int productClassId,
    int totalCoinsForBonus,
    int coinsStillRequiredToBuy
) implements IOutgoingPacket {}
