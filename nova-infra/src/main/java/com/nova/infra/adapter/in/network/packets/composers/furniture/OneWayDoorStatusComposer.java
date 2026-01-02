package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.OneWayDoorStatusMessage;

/**
 * Composes OneWayDoorStatus packet for client.
 */
public class OneWayDoorStatusComposer extends PacketComposer<OneWayDoorStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_STATE;
    }

    @Override
    protected void write(PacketBuffer packet, OneWayDoorStatusMessage message) {
        packet.appendInt(message.itemId());
        packet.appendInt(message.state());
    }
}
