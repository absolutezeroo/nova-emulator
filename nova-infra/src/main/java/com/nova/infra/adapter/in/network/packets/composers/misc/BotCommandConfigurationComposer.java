package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotCommandConfigurationMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes BotCommandConfiguration packet for client.
 */
@ComposesPacket(Outgoing.BOT_COMMAND_CONFIGURATION)
public class BotCommandConfigurationComposer extends PacketComposer<BotCommandConfigurationMessage> {
@Override
    protected void write(PacketBuffer packet, BotCommandConfigurationMessage message) {
        packet.appendInt(message.botId());
        packet.appendInt(message.commandId());
        packet.appendString(message.data());
    }
}
