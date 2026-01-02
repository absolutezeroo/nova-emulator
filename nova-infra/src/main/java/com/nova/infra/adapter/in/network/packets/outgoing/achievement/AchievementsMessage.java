package com.nova.infra.adapter.in.network.packets.outgoing.achievement;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record AchievementsMessage(
    // No fields parsed
) implements IOutgoingPacket {}
