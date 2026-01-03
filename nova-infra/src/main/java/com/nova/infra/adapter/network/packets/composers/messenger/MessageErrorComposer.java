package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.MessageErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes MessageError packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_MESSAGE_ERROR)
public class MessageErrorComposer extends PacketComposer<MessageErrorMessage> {
@Override
    protected void write(PacketBuffer packet, MessageErrorMessage message) {
        packet.appendInt(message.errorCode());
        packet.appendInt(message.userId());
        packet.appendString(message.message());
    }
}
