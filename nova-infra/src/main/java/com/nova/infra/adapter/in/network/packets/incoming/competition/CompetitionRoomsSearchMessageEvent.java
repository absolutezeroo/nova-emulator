package com.nova.infra.adapter.in.network.packets.incoming.competition;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record CompetitionRoomsSearchMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
