package com.nova.infra.adapter.network.packets.outgoing.catalog;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record ClubGiftNotificationMessage(
    int numGifts
) implements OutgoingPacket {}
