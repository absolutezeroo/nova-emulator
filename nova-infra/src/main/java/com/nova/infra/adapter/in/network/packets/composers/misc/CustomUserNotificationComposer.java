package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CustomUserNotificationMessage;

/**
 * Composes CustomUserNotification packet for client.
 */
public class CustomUserNotificationComposer extends PacketComposer<CustomUserNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CUSTOM_USER_NOTIFICATION;
    }

    @Override
    protected void write(PacketBuffer packet, CustomUserNotificationMessage message) {
        packet.appendInt(message.code());
    }
}
