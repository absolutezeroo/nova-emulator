package com.nova.infra.adapter.network.packets.incoming.poll;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record PollAnswerMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
