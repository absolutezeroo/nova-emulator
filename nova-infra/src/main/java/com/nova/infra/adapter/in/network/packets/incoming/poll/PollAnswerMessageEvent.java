package com.nova.infra.adapter.in.network.packets.incoming.poll;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record PollAnswerMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
