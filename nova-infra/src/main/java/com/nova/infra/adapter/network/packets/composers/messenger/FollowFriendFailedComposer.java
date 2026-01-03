package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.FollowFriendFailedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FollowFriendFailed packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_FOLLOW_FAILED)
public class FollowFriendFailedComposer extends PacketComposer<FollowFriendFailedMessage> {
@Override
    protected void write(PacketBuffer packet, FollowFriendFailedMessage message) {
        packet.appendInt(message.errorCode());
    }
}
