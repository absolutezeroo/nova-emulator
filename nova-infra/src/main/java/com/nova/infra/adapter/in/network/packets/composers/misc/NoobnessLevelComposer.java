package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.NoobnessLevelMessage;

/**
 * Composes NoobnessLevel packet for client.
 */
public class NoobnessLevelComposer extends PacketComposer<NoobnessLevelMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NOOBNESS_LEVEL;
    }

    @Override
    protected void write(PacketBuffer packet, NoobnessLevelMessage message) {
        packet.appendInt(message.noobnessLevel());
    }
}
