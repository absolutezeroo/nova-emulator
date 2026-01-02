package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FriendListUpdateMessage;

/**
 * Composes FriendListUpdate packet for client.
 */
public class FriendListUpdateComposer extends PacketComposer<FriendListUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_UPDATE;
    }

    @Override
    protected void write(PacketBuffer packet, FriendListUpdateMessage message) {
        // No fields to write
    }
}
