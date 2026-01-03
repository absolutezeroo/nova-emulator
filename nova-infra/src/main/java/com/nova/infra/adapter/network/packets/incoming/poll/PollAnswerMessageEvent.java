package com.nova.infra.adapter.network.packets.incoming.poll;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record PollAnswerMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
