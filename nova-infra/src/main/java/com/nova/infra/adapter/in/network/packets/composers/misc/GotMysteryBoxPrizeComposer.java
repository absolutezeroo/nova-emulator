package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.GotMysteryBoxPrizeMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GotMysteryBoxPrize packet for client.
 */
@ComposesPacket(Outgoing.GOTMYSTERYBOXPRIZEMESSAGE)
public class GotMysteryBoxPrizeComposer extends PacketComposer<GotMysteryBoxPrizeMessage> {
@Override
    protected void write(PacketBuffer packet, GotMysteryBoxPrizeMessage message) {
        packet.appendString(message.contentType());
        packet.appendInt(message.classId());
    }
}
