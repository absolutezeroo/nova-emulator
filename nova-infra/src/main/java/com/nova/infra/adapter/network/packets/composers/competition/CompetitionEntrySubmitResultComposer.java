package com.nova.infra.adapter.network.packets.composers.competition;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.competition.CompetitionEntrySubmitResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CompetitionEntrySubmitResult packet for client.
 */
@ComposesPacket(Outgoing.COMPETITION_ENTRY_SUBMIT)
public class CompetitionEntrySubmitResultComposer extends PacketComposer<CompetitionEntrySubmitResultMessage> {
@Override
    protected void write(PacketBuffer packet, CompetitionEntrySubmitResultMessage message) {
        packet.appendInt(message.goalId());
        packet.appendString(message.goalCode());
        packet.appendInt(message.result());
    }
}
