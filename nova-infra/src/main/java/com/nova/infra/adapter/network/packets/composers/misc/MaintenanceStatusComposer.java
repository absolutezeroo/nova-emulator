package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.MaintenanceStatusMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes MaintenanceStatus packet for client.
 */
@ComposesPacket(Outgoing.HOTEL_MAINTENANCE)
public class MaintenanceStatusComposer extends PacketComposer<MaintenanceStatusMessage> {
@Override
    protected void write(PacketBuffer packet, MaintenanceStatusMessage message) {
        packet.appendBoolean(message.isInMaintenance());
        packet.appendInt(message.minutesUntilMaintenance());
        packet.appendInt(message.duration());
    }
}
