package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.AcceptFriendResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes AcceptFriendResult packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_ACCEPT_FRIENDS)
public class AcceptFriendResultComposer extends PacketComposer<AcceptFriendResultMessage> {
@Override
    protected void write(PacketBuffer packet, AcceptFriendResultMessage message) {
        // No fields to write
    }
}
