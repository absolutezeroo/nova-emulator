package com.nova.infra.adapter.in.network.packets.incoming.poll;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record PollRejectMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
