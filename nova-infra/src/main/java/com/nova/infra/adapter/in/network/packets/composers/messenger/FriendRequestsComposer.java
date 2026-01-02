package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FriendRequestsMessage;

/**
 * Composes FriendRequests packet for client.
 */
public class FriendRequestsComposer extends PacketComposer<FriendRequestsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_REQUESTS;
    }

    @Override
    protected void write(PacketBuffer packet, FriendRequestsMessage message) {
        packet.appendInt(message.totalRequests());
    }
}
