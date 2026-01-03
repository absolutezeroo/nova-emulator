package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.BotErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes BotError packet for client.
 */
@ComposesPacket(Outgoing.BOT_ERROR)
public class BotErrorComposer extends PacketComposer<BotErrorMessage> {
@Override
    protected void write(PacketBuffer packet, BotErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
