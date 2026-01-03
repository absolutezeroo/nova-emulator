package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.MessengerInitMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes MessengerInit packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_INIT)
public class MessengerInitComposer extends PacketComposer<MessengerInitMessage> {
@Override
    protected void write(PacketBuffer packet, MessengerInitMessage message) {
        packet.appendInt(message.userFriendLimit());
        packet.appendInt(message.normalFriendLimit());
        packet.appendInt(message.extendedFriendLimit());
    }
}
