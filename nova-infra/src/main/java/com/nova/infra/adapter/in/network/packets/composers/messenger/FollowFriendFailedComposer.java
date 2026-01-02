package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.FollowFriendFailedMessage;

/**
 * Composes FollowFriendFailed packet for client.
 */
public class FollowFriendFailedComposer extends PacketComposer<FollowFriendFailedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_FOLLOW_FAILED;
    }

    @Override
    protected void write(PacketBuffer packet, FollowFriendFailedMessage message) {
        packet.appendInt(message.errorCode());
    }
}
