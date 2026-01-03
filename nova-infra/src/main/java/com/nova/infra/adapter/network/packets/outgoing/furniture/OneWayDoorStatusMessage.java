package com.nova.infra.adapter.network.packets.outgoing.furniture;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record OneWayDoorStatusMessage(
    int itemId,
    int state
) implements IOutgoingPacket {}
