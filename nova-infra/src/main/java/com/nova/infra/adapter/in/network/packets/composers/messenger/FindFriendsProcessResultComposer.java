package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FindFriendsProcessResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FindFriendsProcessResult packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_FIND_FRIENDS)
public class FindFriendsProcessResultComposer extends PacketComposer<FindFriendsProcessResultMessage> {
@Override
    protected void write(PacketBuffer packet, FindFriendsProcessResultMessage message) {
        packet.appendBoolean(message.success());
    }
}
