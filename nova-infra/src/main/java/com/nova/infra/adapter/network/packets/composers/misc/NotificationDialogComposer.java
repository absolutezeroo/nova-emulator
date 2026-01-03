package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.NotificationDialogMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NotificationDialog packet for client.
 */
@ComposesPacket(Outgoing.NOTIFICATION_LIST)
public class NotificationDialogComposer extends PacketComposer<NotificationDialogMessage> {
@Override
    protected void write(PacketBuffer packet, NotificationDialogMessage message) {
        packet.appendString(message.type());
    }
}
