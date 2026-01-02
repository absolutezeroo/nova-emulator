package com.nova.infra.adapter.in.network.packets.incoming.messenger;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record MessengerInitMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
