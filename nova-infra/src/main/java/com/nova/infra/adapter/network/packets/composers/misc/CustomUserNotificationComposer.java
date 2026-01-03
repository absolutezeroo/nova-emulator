package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.CustomUserNotificationMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CustomUserNotification packet for client.
 */
@ComposesPacket(Outgoing.CUSTOM_USER_NOTIFICATION)
public class CustomUserNotificationComposer extends PacketComposer<CustomUserNotificationMessage> {
@Override
    protected void write(PacketBuffer packet, CustomUserNotificationMessage message) {
        packet.appendInt(message.code());
    }
}
