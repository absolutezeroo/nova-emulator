package com.nova.infra.adapter.network.packets.outgoing.game;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record Game2JoiningGameFailedMessage(
    int reason
) implements IOutgoingPacket {}
