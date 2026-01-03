package com.nova.infra.adapter.network.packets.incoming.competition;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record CompetitionRoomsSearchMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
