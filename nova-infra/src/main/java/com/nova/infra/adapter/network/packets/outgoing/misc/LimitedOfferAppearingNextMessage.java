package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record LimitedOfferAppearingNextMessage(
    int appearsInSeconds,
    int pageId,
    int offerId,
    String productType
) implements OutgoingPacket {}
