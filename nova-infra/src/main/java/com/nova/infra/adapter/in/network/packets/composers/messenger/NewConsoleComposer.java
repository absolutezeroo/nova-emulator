package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.NewConsoleMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes NewConsole packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_CHAT)
public class NewConsoleComposer extends PacketComposer<NewConsoleMessage> {
@Override
    protected void write(PacketBuffer packet, NewConsoleMessage message) {
        packet.appendInt(message.senderId());
        packet.appendString(message.messageText());
        packet.appendInt(message.secondsSinceSent());
        packet.appendString(message.extraData());
    }
}
