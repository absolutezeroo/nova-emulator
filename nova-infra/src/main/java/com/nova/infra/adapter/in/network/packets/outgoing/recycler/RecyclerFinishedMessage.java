package com.nova.infra.adapter.in.network.packets.outgoing.recycler;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RecyclerFinishedMessage(
    int recyclerFinishedStatus,
    int prizeId
) implements IOutgoingPacket {}
