package com.nova.infra.adapter.network.packets.outgoing.unit;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitTypingMessage(
    int unitId,
    int isTyping
) implements IOutgoingPacket {}
