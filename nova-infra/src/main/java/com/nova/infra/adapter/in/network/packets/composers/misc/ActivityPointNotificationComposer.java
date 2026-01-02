package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ActivityPointNotificationMessage;

/**
 * Composes ActivityPointNotification packet for client.
 */
public class ActivityPointNotificationComposer extends PacketComposer<ActivityPointNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ACTIVITY_POINT_NOTIFICATION;
    }

    @Override
    protected void write(PacketBuffer packet, ActivityPointNotificationMessage message) {
        packet.appendInt(message.amount());
        packet.appendInt(message.amountChanged());
        packet.appendInt(message.type());
    }
}
