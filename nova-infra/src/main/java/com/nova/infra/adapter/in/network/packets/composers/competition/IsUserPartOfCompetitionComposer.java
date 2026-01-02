package com.nova.infra.adapter.in.network.packets.composers.competition;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.competition.IsUserPartOfCompetitionMessage;

/**
 * Composes IsUserPartOfCompetition packet for client.
 */
public class IsUserPartOfCompetitionComposer extends PacketComposer<IsUserPartOfCompetitionMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMPETITION_USER_PART_OF;
    }

    @Override
    protected void write(PacketBuffer packet, IsUserPartOfCompetitionMessage message) {
        packet.appendBoolean(message.isPartOf());
        packet.appendInt(message.targetId());
    }
}
