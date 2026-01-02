package com.nova.infra.adapter.in.network.packets.composers.competition;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.competition.SecondsUntilMessage;

/**
 * Composes SecondsUntil packet for client.
 */
public class SecondsUntilComposer extends PacketComposer<SecondsUntilMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMPETITION_SECONDS_UNTIL;
    }

    @Override
    protected void write(PacketBuffer packet, SecondsUntilMessage message) {
        packet.appendString(message.timeStr());
        packet.appendInt(message.secondsUntil());
    }
}
