package com.nova.infra.adapter.network.packets.outgoing.unit;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitRemoveMessage(
    // No fields parsed
) implements IOutgoingPacket {}
