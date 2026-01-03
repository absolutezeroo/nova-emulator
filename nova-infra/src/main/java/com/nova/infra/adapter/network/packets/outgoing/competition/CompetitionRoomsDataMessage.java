package com.nova.infra.adapter.network.packets.outgoing.competition;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CompetitionRoomsDataMessage(
    // No fields parsed
) implements IOutgoingPacket {}
