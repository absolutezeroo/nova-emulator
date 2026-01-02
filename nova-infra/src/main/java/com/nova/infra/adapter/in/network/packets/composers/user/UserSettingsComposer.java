package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserSettingsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserSettings packet for client.
 */
@ComposesPacket(Outgoing.USER_SETTINGS)
public class UserSettingsComposer extends PacketComposer<UserSettingsMessage> {
@Override
    protected void write(PacketBuffer packet, UserSettingsMessage message) {
        packet.appendInt(message.volumeSystem());
        packet.appendInt(message.volumeFurni());
        packet.appendInt(message.volumeTrax());
        packet.appendBoolean(message.oldChat());
        packet.appendBoolean(message.roomInvites());
        packet.appendBoolean(message.cameraFollow());
        packet.appendInt(message.flags());
        packet.appendInt(message.chatType());
    }
}
