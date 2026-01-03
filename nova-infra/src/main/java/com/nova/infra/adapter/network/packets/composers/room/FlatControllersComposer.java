package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.FlatControllersMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FlatControllers packet for client.
 */
@ComposesPacket(Outgoing.ROOM_RIGHTS_LIST)
public class FlatControllersComposer extends PacketComposer<FlatControllersMessage> {
@Override
    protected void write(PacketBuffer packet, FlatControllersMessage message) {
        packet.appendInt(message.roomId());
    }
}
