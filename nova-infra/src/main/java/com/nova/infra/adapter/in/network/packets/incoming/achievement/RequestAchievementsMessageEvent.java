package com.nova.infra.adapter.in.network.packets.incoming.achievement;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record RequestAchievementsMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
