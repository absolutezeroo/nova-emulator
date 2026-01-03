package com.nova.infra.adapter.network.packets.outgoing.furniture;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record DiceValueMessage(
    int itemId,
    int value
) implements OutgoingPacket {}
