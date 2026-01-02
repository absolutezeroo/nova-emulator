package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.NoobnessLevelMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes NoobnessLevel packet for client.
 */
@ComposesPacket(Outgoing.NOOBNESS_LEVEL)
public class NoobnessLevelComposer extends PacketComposer<NoobnessLevelMessage> {
@Override
    protected void write(PacketBuffer packet, NoobnessLevelMessage message) {
        packet.appendInt(message.noobnessLevel());
    }
}
