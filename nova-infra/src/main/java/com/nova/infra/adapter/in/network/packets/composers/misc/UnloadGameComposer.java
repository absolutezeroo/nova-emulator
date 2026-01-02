package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.UnloadGameMessage;

/**
 * Composes UnloadGame packet for client.
 */
public class UnloadGameComposer extends PacketComposer<UnloadGameMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNLOADGAME;
    }

    @Override
    protected void write(PacketBuffer packet, UnloadGameMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendString(message.gameClientId());
    }
}
