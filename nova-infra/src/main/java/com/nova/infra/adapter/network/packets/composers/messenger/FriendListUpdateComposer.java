package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.FriendListUpdateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
