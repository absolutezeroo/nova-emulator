package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserBannedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserBanned packet for client.
 */
@ComposesPacket(Outgoing.USER_BANNED)
public class UserBannedComposer extends PacketComposer<UserBannedMessage> {
@Override
    protected void write(PacketBuffer packet, UserBannedMessage message) {
        packet.appendString(message.message());
    }
}
