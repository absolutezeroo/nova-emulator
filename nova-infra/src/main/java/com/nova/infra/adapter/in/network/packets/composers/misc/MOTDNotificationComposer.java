package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.MOTDNotificationMessage;

/**
 * Composes MOTDNotification packet for client.
 */
public class MOTDNotificationComposer extends PacketComposer<MOTDNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MOTD_MESSAGES;
    }

    @Override
    protected void write(PacketBuffer packet, MOTDNotificationMessage message) {
        // No fields to write
    }
}
