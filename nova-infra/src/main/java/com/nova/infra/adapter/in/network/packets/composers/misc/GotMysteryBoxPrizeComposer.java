package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GotMysteryBoxPrizeMessage;

/**
 * Composes GotMysteryBoxPrize packet for client.
 */
public class GotMysteryBoxPrizeComposer extends PacketComposer<GotMysteryBoxPrizeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GOTMYSTERYBOXPRIZEMESSAGE;
    }

    @Override
    protected void write(PacketBuffer packet, GotMysteryBoxPrizeMessage message) {
        packet.appendString(message.contentType());
        packet.appendInt(message.classId());
    }
}
