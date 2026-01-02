package com.nova.infra.adapter.in.network.packets.outgoing.room;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record PopularRoomTagsResultMessage(
    // No fields parsed
) implements IOutgoingPacket {}
