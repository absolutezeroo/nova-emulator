package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ActivityPointNotificationMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ActivityPointNotification packet for client.
 */
@ComposesPacket(Outgoing.ACTIVITY_POINT_NOTIFICATION)
public class ActivityPointNotificationComposer extends PacketComposer<ActivityPointNotificationMessage> {
@Override
    protected void write(PacketBuffer packet, ActivityPointNotificationMessage message) {
        packet.appendInt(message.amount());
        packet.appendInt(message.amountChanged());
        packet.appendInt(message.type());
    }
}
