package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FriendListUpdateMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FriendListUpdate packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_UPDATE)
public class FriendListUpdateComposer extends PacketComposer<FriendListUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, FriendListUpdateMessage message) {
        // No fields to write
    }
}
