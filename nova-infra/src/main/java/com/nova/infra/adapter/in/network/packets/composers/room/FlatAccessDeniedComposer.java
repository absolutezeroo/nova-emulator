package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.FlatAccessDeniedMessage;

/**
 * Composes FlatAccessDenied packet for client.
 */
public class FlatAccessDeniedComposer extends PacketComposer<FlatAccessDeniedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_DOORBELL_REJECTED;
    }

    @Override
    protected void write(PacketBuffer packet, FlatAccessDeniedMessage message) {
        packet.appendString(message.userName());
    }
}
