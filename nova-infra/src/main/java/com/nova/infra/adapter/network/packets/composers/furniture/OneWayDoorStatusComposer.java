package com.nova.infra.adapter.network.packets.composers.furniture;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.furniture.OneWayDoorStatusMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes OneWayDoorStatus packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_STATE)
public class OneWayDoorStatusComposer extends PacketComposer<OneWayDoorStatusMessage> {
@Override
    protected void write(PacketBuffer packet, OneWayDoorStatusMessage message) {
        packet.appendInt(message.itemId());
        packet.appendInt(message.state());
    }
}
