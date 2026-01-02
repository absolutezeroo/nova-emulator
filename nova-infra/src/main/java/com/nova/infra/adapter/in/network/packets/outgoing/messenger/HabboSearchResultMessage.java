package com.nova.infra.adapter.in.network.packets.outgoing.messenger;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record HabboSearchResultMessage(
    // No fields parsed
) implements IOutgoingPacket {}
