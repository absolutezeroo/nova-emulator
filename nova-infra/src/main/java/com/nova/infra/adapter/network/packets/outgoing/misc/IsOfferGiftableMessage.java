package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record IsOfferGiftableMessage(
    int offerId,
    boolean isGiftable
) implements OutgoingPacket {}
