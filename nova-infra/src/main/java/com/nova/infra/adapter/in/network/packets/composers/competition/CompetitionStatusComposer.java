package com.nova.infra.adapter.in.network.packets.composers.competition;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.competition.CompetitionStatusMessage;

/**
 * Composes CompetitionStatus packet for client.
 */
public class CompetitionStatusComposer extends PacketComposer<CompetitionStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMPETITION_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, CompetitionStatusMessage message) {
        packet.appendBoolean(message.ok());
        packet.appendString(message.errorReason());
    }
}
