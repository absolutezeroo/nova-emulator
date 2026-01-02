package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.FlatControllerAddedMessage;

/**
 * Composes FlatControllerAdded packet for client.
 */
public class FlatControllerAddedComposer extends PacketComposer<FlatControllerAddedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_RIGHTS_LIST_ADD;
    }

    @Override
    protected void write(PacketBuffer packet, FlatControllerAddedMessage message) {
        packet.appendInt(message.roomId());
    }
}
