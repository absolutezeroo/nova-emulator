package com.nova.infra.adapter.in.network.packets.composers.competition;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.competition.CurrentTimingCodeMessage;

/**
 * Composes CurrentTimingCode packet for client.
 */
public class CurrentTimingCodeComposer extends PacketComposer<CurrentTimingCodeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMPETITION_TIMING_CODE;
    }

    @Override
    protected void write(PacketBuffer packet, CurrentTimingCodeMessage message) {
        packet.appendString(message.schedulingStr());
        packet.appendString(message.code());
    }
}
