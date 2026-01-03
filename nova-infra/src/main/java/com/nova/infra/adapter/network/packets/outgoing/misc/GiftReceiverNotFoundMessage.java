package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record GiftReceiverNotFoundMessage(
    // No fields parsed
) implements OutgoingPacket {}
