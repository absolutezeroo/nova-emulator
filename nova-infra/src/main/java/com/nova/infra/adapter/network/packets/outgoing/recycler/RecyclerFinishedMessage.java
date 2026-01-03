package com.nova.infra.adapter.network.packets.outgoing.recycler;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RecyclerFinishedMessage(
    int recyclerFinishedStatus,
    int prizeId
) implements OutgoingPacket {}
