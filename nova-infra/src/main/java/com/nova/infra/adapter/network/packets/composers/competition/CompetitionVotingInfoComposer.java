package com.nova.infra.adapter.network.packets.composers.competition;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.competition.CompetitionVotingInfoMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CompetitionVotingInfo packet for client.
 */
@ComposesPacket(Outgoing.COMPETITION_VOTING_INFO)
public class CompetitionVotingInfoComposer extends PacketComposer<CompetitionVotingInfoMessage> {
@Override
    protected void write(PacketBuffer packet, CompetitionVotingInfoMessage message) {
        packet.appendInt(message.goalId());
        packet.appendString(message.goalCode());
        packet.appendInt(message.resultCode());
        packet.appendInt(message.votesRemaining());
    }
}
