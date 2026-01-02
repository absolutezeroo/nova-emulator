package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LoadGameUrlMessage;

/**
 * Composes LoadGameUrl packet for client.
 */
public class LoadGameUrlComposer extends PacketComposer<LoadGameUrlMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.LOAD_GAME_URL;
    }

    @Override
    protected void write(PacketBuffer packet, LoadGameUrlMessage message) {
        packet.appendInt(message.gameTypeId());
        packet.appendString(message.gameClientId());
        packet.appendString(message.url());
    }
}
