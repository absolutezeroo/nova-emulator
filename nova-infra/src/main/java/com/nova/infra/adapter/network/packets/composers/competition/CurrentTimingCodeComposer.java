package com.nova.infra.adapter.network.packets.composers.competition;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.competition.CurrentTimingCodeMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CurrentTimingCode packet for client.
 */
@ComposesPacket(Outgoing.COMPETITION_TIMING_CODE)
public class CurrentTimingCodeComposer extends PacketComposer<CurrentTimingCodeMessage> {
@Override
    protected void write(PacketBuffer packet, CurrentTimingCodeMessage message) {
        packet.appendString(message.schedulingStr());
        packet.appendString(message.code());
    }
}
