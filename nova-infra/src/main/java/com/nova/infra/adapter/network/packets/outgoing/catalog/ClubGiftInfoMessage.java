package com.nova.infra.adapter.network.packets.outgoing.catalog;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record ClubGiftInfoMessage(
    int daysUntilNextGift,
    int giftsAvailable
) implements OutgoingPacket {}
