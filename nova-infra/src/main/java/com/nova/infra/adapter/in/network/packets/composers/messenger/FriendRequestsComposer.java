package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FriendRequestsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

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
