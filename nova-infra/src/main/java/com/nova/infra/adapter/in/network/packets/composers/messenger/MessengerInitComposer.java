package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.MessengerInitMessage;

/**
 * Composes MessengerInit packet for client.
 */
public class MessengerInitComposer extends PacketComposer<MessengerInitMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_INIT;
    }

    @Override
    protected void write(PacketBuffer packet, MessengerInitMessage message) {
        packet.appendInt(message.userFriendLimit());
        packet.appendInt(message.normalFriendLimit());
        packet.appendInt(message.extendedFriendLimit());
    }
}
