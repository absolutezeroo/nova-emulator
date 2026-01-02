package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotCommandConfigurationMessage;

/**
 * Composes BotCommandConfiguration packet for client.
 */
public class BotCommandConfigurationComposer extends PacketComposer<BotCommandConfigurationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BOT_COMMAND_CONFIGURATION;
    }

    @Override
    protected void write(PacketBuffer packet, BotCommandConfigurationMessage message) {
        packet.appendInt(message.botId());
        packet.appendInt(message.commandId());
        packet.appendString(message.data());
    }
}
