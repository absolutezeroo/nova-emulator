package com.nova.infra.adapter.in.network.packets.outgoing.navigator;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record NavigatorSearchesMessage(
    // No fields parsed
) implements IOutgoingPacket {}
