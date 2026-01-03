package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.BotReceivedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes BotReceived packet for client.
 */
@ComposesPacket(Outgoing.BOT_RECEIVED)
public class BotReceivedComposer extends PacketComposer<BotReceivedMessage> {
@Override
    protected void write(PacketBuffer packet, BotReceivedMessage message) {
        packet.appendBoolean(message.boughtAsGift());
    }
}
