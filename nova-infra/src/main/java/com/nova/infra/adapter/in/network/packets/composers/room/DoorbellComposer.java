package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.DoorbellMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Doorbell packet for client.
 */
@ComposesPacket(Outgoing.ROOM_DOORBELL)
public class DoorbellComposer extends PacketComposer<DoorbellMessage> {
@Override
    protected void write(PacketBuffer packet, DoorbellMessage message) {
        packet.appendString(message.userName());
    }
}
