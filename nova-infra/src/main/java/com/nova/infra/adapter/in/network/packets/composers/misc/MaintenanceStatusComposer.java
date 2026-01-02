package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.MaintenanceStatusMessage;

/**
 * Composes MaintenanceStatus packet for client.
 */
public class MaintenanceStatusComposer extends PacketComposer<MaintenanceStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HOTEL_MAINTENANCE;
    }

    @Override
    protected void write(PacketBuffer packet, MaintenanceStatusMessage message) {
        packet.appendBoolean(message.isInMaintenance());
        packet.appendInt(message.minutesUntilMaintenance());
        packet.appendInt(message.duration());
    }
}
