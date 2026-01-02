package com.nova.infra.adapter.in.network.packets.composers.competition;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.competition.CompetitionStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CompetitionStatus packet for client.
 */
@ComposesPacket(Outgoing.COMPETITION_STATUS)
public class CompetitionStatusComposer extends PacketComposer<CompetitionStatusMessage> {
@Override
    protected void write(PacketBuffer packet, CompetitionStatusMessage message) {
        packet.appendBoolean(message.ok());
        packet.appendString(message.errorReason());
    }
}
