package com.nova.infra.adapter.in.network.packets.composers.competition;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.competition.CompetitionRoomsDataMessage;

/**
 * Composes CompetitionRoomsData packet for client.
 */
public class CompetitionRoomsDataComposer extends PacketComposer<CompetitionRoomsDataMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMPETITION_ROOMS_DATA;
    }

    @Override
    protected void write(PacketBuffer packet, CompetitionRoomsDataMessage message) {
        // No fields to write
    }
}
