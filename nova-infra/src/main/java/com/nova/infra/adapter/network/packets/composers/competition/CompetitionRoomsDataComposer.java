package com.nova.infra.adapter.network.packets.composers.competition;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.competition.CompetitionRoomsDataMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CompetitionRoomsData packet for client.
 */
@ComposesPacket(Outgoing.COMPETITION_ROOMS_DATA)
public class CompetitionRoomsDataComposer extends PacketComposer<CompetitionRoomsDataMessage> {
@Override
    protected void write(PacketBuffer packet, CompetitionRoomsDataMessage message) {
        // No fields to write
    }
}
