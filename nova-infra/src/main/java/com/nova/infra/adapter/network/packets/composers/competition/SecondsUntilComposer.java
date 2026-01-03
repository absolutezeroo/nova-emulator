package com.nova.infra.adapter.network.packets.composers.competition;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.competition.SecondsUntilMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes SecondsUntil packet for client.
 */
@ComposesPacket(Outgoing.COMPETITION_SECONDS_UNTIL)
public class SecondsUntilComposer extends PacketComposer<SecondsUntilMessage> {
@Override
    protected void write(PacketBuffer packet, SecondsUntilMessage message) {
        packet.appendString(message.timeStr());
        packet.appendInt(message.secondsUntil());
    }
}
