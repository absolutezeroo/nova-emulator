package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.NewFriendRequestMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NewFriendRequest packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_REQUEST)
public class NewFriendRequestComposer extends PacketComposer<NewFriendRequestMessage> {
@Override
    protected void write(PacketBuffer packet, NewFriendRequestMessage message) {
        // No fields to write
    }
}
