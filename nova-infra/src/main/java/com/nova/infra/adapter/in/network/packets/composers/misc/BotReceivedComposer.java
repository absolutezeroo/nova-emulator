package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotReceivedMessage;

/**
 * Composes BotReceived packet for client.
 */
public class BotReceivedComposer extends PacketComposer<BotReceivedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BOT_RECEIVED;
    }

    @Override
    protected void write(PacketBuffer packet, BotReceivedMessage message) {
        packet.appendBoolean(message.boughtAsGift());
    }
}
