package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FurniRentOrBuyoutOfferMessage(
    boolean isWallItem,
    String furniTypeName,
    boolean buyout,
    int priceInCredits,
    int priceInActivityPoints,
    int activityPointType
) implements IOutgoingPacket {}
