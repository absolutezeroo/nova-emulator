package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FriendListFragmentMessage;

/**
 * Composes FriendListFragment packet for client.
 */
public class FriendListFragmentComposer extends PacketComposer<FriendListFragmentMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_FRIENDS;
    }

    @Override
    protected void write(PacketBuffer packet, FriendListFragmentMessage message) {
        packet.appendInt(message.totalFragments());
        packet.appendInt(message.fragmentNumber());
    }
}
