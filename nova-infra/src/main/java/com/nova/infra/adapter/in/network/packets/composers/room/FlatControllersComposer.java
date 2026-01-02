package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.FlatControllersMessage;

/**
 * Composes FlatControllers packet for client.
 */
public class FlatControllersComposer extends PacketComposer<FlatControllersMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_RIGHTS_LIST;
    }

    @Override
    protected void write(PacketBuffer packet, FlatControllersMessage message) {
        packet.appendInt(message.roomId());
    }
}
