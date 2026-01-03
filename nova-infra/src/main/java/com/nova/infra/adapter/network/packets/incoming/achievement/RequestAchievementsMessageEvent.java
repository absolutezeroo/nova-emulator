package com.nova.infra.adapter.network.packets.incoming.achievement;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record RequestAchievementsMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
