package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LoadGameMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes LoadGame packet for client.
 */
@ComposesPacket(Outgoing.LOADGAME)
public class LoadGameComposer extends PacketComposer<LoadGameMessage> {
@Override
    protected void write(PacketBuffer packet, LoadGameMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendString(message.gameClientId());
        packet.appendString(message.url());
        packet.appendString(message.quality());
        packet.appendString(message.scaleMode());
        packet.appendInt(message.frameRate());
        packet.appendInt(message.minMajorVersion());
        packet.appendInt(message.minMinorVersion());
    }
}
