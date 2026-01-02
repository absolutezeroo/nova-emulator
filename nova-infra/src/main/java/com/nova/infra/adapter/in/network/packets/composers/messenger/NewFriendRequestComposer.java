package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.NewFriendRequestMessage;

/**
 * Composes NewFriendRequest packet for client.
 */
public class NewFriendRequestComposer extends PacketComposer<NewFriendRequestMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_REQUEST;
    }

    @Override
    protected void write(PacketBuffer packet, NewFriendRequestMessage message) {
        // No fields to write
    }
}
