package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.UserProfileMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UserProfile packet for client.
 */
@ComposesPacket(Outgoing.USER_PROFILE)
public class UserProfileComposer extends PacketComposer<UserProfileMessage> {
@Override
    protected void write(PacketBuffer packet, UserProfileMessage message) {
        packet.appendInt(message.id());
        packet.appendString(message.username());
        packet.appendString(message.figure());
        packet.appendString(message.motto());
        packet.appendString(message.registration());
        packet.appendInt(message.achievementPoints());
        packet.appendInt(message.friendsCount());
        packet.appendBoolean(message.isMyFriend());
        packet.appendBoolean(message.requestSent());
        packet.appendBoolean(message.isOnline());
    }
}
