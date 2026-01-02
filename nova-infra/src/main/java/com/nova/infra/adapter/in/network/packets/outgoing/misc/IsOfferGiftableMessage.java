package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record IsOfferGiftableMessage(
    int offerId,
    boolean isGiftable
) implements IOutgoingPacket {}
