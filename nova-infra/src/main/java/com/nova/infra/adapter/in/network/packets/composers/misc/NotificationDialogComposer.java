package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.NotificationDialogMessage;

/**
 * Composes NotificationDialog packet for client.
 */
public class NotificationDialogComposer extends PacketComposer<NotificationDialogMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NOTIFICATION_LIST;
    }

    @Override
    protected void write(PacketBuffer packet, NotificationDialogMessage message) {
        packet.appendString(message.type());
    }
}
