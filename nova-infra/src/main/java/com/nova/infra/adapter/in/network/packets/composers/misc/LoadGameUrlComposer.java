package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LoadGameUrlMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes LoadGameUrl packet for client.
 */
@ComposesPacket(Outgoing.LOAD_GAME_URL)
public class LoadGameUrlComposer extends PacketComposer<LoadGameUrlMessage> {
@Override
    protected void write(PacketBuffer packet, LoadGameUrlMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendString(message.gameClientId());
        packet.appendString(message.url());
    }
}
