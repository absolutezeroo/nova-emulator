package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.MessageErrorMessage;

/**
 * Composes MessageError packet for client.
 */
public class MessageErrorComposer extends PacketComposer<MessageErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_MESSAGE_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, MessageErrorMessage message) {
        packet.appendInt(message.errorCode());
        packet.appendInt(message.userId());
        packet.appendString(message.message());
    }
}
