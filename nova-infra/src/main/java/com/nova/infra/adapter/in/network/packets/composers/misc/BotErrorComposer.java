package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotErrorMessage;

/**
 * Composes BotError packet for client.
 */
public class BotErrorComposer extends PacketComposer<BotErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BOT_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, BotErrorMessage message) {
        packet.appendInt(message.errorCode());
    }
}
