package com.nova.infra.adapter.in.network.packets.composers.competition;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.competition.CompetitionVotingInfoMessage;

/**
 * Composes CompetitionVotingInfo packet for client.
 */
public class CompetitionVotingInfoComposer extends PacketComposer<CompetitionVotingInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMPETITION_VOTING_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, CompetitionVotingInfoMessage message) {
        packet.appendInt(message.goalId());
        packet.appendString(message.goalCode());
        packet.appendInt(message.resultCode());
        packet.appendInt(message.votesRemaining());
    }
}
