package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.FlatControllerAddedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FlatControllerAdded packet for client.
 */
@ComposesPacket(Outgoing.ROOM_RIGHTS_LIST_ADD)
public class FlatControllerAddedComposer extends PacketComposer<FlatControllerAddedMessage> {
@Override
    protected void write(PacketBuffer packet, FlatControllerAddedMessage message) {
        packet.appendInt(message.roomId());
    }
}
