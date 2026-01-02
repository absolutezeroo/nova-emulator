package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ObjectsDataUpdateMessage;

/**
 * Composes ObjectsDataUpdate packet for client.
 */
public class ObjectsDataUpdateComposer extends PacketComposer<ObjectsDataUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.OBJECTS_DATA_UPDATE;
    }

    @Override
    protected void write(PacketBuffer packet, ObjectsDataUpdateMessage message) {
        // No fields to write
    }
}
