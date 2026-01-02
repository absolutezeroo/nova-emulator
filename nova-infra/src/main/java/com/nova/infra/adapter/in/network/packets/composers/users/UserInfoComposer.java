package com.nova.infra.adapter.in.network.packets.composers.users;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.users.UserInfoMessage;

/**
 * Composes user profile information packets.
 */
public class UserInfoComposer extends PacketComposer<UserInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, UserInfoMessage message) {
        packet.appendInt(message.id());
        packet.appendString(message.username());
        packet.appendString(message.figure());
        packet.appendString(message.gender());
        packet.appendString(message.motto());
        packet.appendString(message.realName());
        packet.appendBoolean(message.directMail());
        packet.appendInt(message.respectsReceived());
        packet.appendInt(message.respectsRemaining());
        packet.appendInt(message.respectsPetRemaining());
        packet.appendBoolean(message.streamPublishing());
        packet.appendString(message.lastAccessDate());
        packet.appendBoolean(message.canChangeName());
        packet.appendBoolean(message.safetyLocked());
    }
}
