package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.FlatControllerRemovedMessage;

/**
 * Composes FlatControllerRemoved packet for client.
 */
public class FlatControllerRemovedComposer extends PacketComposer<FlatControllerRemovedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_RIGHTS_LIST_REMOVE;
    }

    @Override
    protected void write(PacketBuffer packet, FlatControllerRemovedMessage message) {
        packet.appendInt(message.roomId());
        packet.appendInt(message.userId());
    }
}
