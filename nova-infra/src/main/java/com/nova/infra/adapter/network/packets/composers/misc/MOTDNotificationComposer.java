package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.MOTDNotificationMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
