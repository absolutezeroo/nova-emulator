package com.nova.infra.adapter.in.network.packets.outgoing.game;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record UserGameAchievementsMessage(
    // No fields parsed
) implements IOutgoingPacket {}
