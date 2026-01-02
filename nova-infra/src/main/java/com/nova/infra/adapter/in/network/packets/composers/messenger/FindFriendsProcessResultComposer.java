package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FindFriendsProcessResultMessage;

/**
 * Composes FindFriendsProcessResult packet for client.
 */
public class FindFriendsProcessResultComposer extends PacketComposer<FindFriendsProcessResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_FIND_FRIENDS;
    }

    @Override
    protected void write(PacketBuffer packet, FindFriendsProcessResultMessage message) {
        packet.appendBoolean(message.success());
    }
}
