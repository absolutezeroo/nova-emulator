package com.nova.infra.adapter.in.network.packets.outgoing.game;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record Game2UserLeftGameMessage(
    int userId
) implements IOutgoingPacket {}
