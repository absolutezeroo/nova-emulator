package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FriendListFragmentMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FriendListFragment packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_FRIENDS)
public class FriendListFragmentComposer extends PacketComposer<FriendListFragmentMessage> {
@Override
    protected void write(PacketBuffer packet, FriendListFragmentMessage message) {
        packet.appendInt(message.totalFragments());
        packet.appendInt(message.fragmentNumber());
    }
}
