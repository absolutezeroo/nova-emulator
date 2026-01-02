package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserBannedMessage;

/**
 * Composes UserBanned packet for client.
 */
public class UserBannedComposer extends PacketComposer<UserBannedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_BANNED;
    }

    @Override
    protected void write(PacketBuffer packet, UserBannedMessage message) {
        packet.appendString(message.message());
    }
}
