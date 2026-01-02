package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitChatShoutMessage;

/**
 * Composes RoomUnitChatShout packet for client.
 */
public class RoomUnitChatShoutComposer extends PacketComposer<RoomUnitChatShoutMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_CHAT_SHOUT;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitChatShoutMessage message) {
        // No fields to write
    }
}
