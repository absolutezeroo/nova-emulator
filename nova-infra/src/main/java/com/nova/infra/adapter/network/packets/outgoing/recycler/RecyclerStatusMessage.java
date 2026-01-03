package com.nova.infra.adapter.network.packets.outgoing.recycler;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RecyclerStatusMessage(
    int recyclerStatus,
    int recyclerTimeoutSeconds
) implements OutgoingPacket {}
