package com.nova.infra.adapter.network.packets.outgoing.recycler;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RecyclerStatusMessage(
    int recyclerStatus,
    int recyclerTimeoutSeconds
) implements IOutgoingPacket {}
