package com.nova.infra.adapter.network.packets.outgoing.catalog;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PurchaseOKMessage(
    int offerId,
    String localizationId,
    boolean rent,
    int priceCredits,
    int priceActivityPoints,
    int priceActivityPointsType,
    boolean giftable
) implements IOutgoingPacket {}
