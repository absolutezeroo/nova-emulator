package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserSettingsMessage;

/**
 * Composes UserSettings packet for client.
 */
public class UserSettingsComposer extends PacketComposer<UserSettingsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_SETTINGS;
    }

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
