package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.MOTDNotificationMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes MOTDNotification packet for client.
 */
@ComposesPacket(Outgoing.MOTD_MESSAGES)
public class MOTDNotificationComposer extends PacketComposer<MOTDNotificationMessage> {
@Override
    protected void write(PacketBuffer packet, MOTDNotificationMessage message) {
        // No fields to write
    }
}
