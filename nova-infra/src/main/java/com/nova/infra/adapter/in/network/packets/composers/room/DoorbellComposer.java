package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.DoorbellMessage;

/**
 * Composes Doorbell packet for client.
 */
public class DoorbellComposer extends PacketComposer<DoorbellMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_DOORBELL;
    }

    @Override
    protected void write(PacketBuffer packet, DoorbellMessage message) {
        packet.appendString(message.userName());
    }
}
