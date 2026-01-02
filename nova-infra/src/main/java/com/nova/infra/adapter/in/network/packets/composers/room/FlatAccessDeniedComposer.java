package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.FlatAccessDeniedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FlatAccessDenied packet for client.
 */
@ComposesPacket(Outgoing.ROOM_DOORBELL_REJECTED)
public class FlatAccessDeniedComposer extends PacketComposer<FlatAccessDeniedMessage> {
@Override
    protected void write(PacketBuffer packet, FlatAccessDeniedMessage message) {
        packet.appendString(message.userName());
    }
}
