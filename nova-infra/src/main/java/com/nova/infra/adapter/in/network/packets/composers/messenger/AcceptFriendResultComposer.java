package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.AcceptFriendResultMessage;

/**
 * Composes AcceptFriendResult packet for client.
 */
public class AcceptFriendResultComposer extends PacketComposer<AcceptFriendResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_ACCEPT_FRIENDS;
    }

    @Override
    protected void write(PacketBuffer packet, AcceptFriendResultMessage message) {
        // No fields to write
    }
}
