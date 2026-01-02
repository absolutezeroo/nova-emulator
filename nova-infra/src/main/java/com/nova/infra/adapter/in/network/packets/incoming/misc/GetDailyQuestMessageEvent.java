package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GetDailyQuestMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
