package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.FriendRequestsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FriendRequests packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_REQUESTS)
public class FriendRequestsComposer extends PacketComposer<FriendRequestsMessage> {
@Override
    protected void write(PacketBuffer packet, FriendRequestsMessage message) {
        packet.appendInt(message.totalRequests());
    }
}
