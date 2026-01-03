package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record IsBadgeRequestFulfilledMessage(
    String requestCode,
    boolean fulfilled
) implements OutgoingPacket {}
