package com.nova.infra.adapter.network.packets.composers.competition;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.competition.CompetitionStatusMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
