package com.nova.infra.adapter.network.packets.composers.competition;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.competition.IsUserPartOfCompetitionMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes IsUserPartOfCompetition packet for client.
 */
@ComposesPacket(Outgoing.COMPETITION_USER_PART_OF)
public class IsUserPartOfCompetitionComposer extends PacketComposer<IsUserPartOfCompetitionMessage> {
@Override
    protected void write(PacketBuffer packet, IsUserPartOfCompetitionMessage message) {
        packet.appendBoolean(message.isPartOf());
        packet.appendInt(message.targetId());
    }
}
