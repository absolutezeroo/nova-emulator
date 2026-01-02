package com.nova.infra.adapter.in.network.packets.composers.competition;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.competition.CompetitionEntrySubmitResultMessage;

/**
 * Composes CompetitionEntrySubmitResult packet for client.
 */
public class CompetitionEntrySubmitResultComposer extends PacketComposer<CompetitionEntrySubmitResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMPETITION_ENTRY_SUBMIT;
    }

    @Override
    protected void write(PacketBuffer packet, CompetitionEntrySubmitResultMessage message) {
        packet.appendInt(message.goalId());
        packet.appendString(message.goalCode());
        packet.appendInt(message.result());
    }
}
