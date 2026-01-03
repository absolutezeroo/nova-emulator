package com.nova.infra.adapter.network.packets.outgoing.game;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record Game2InArenaQueueMessage(
    int position
) implements OutgoingPacket {}
