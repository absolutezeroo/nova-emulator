package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.RoomUnitChatShoutMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitChatShout packet for client.
 */
@ComposesPacket(Outgoing.UNIT_CHAT_SHOUT)
public class RoomUnitChatShoutComposer extends PacketComposer<RoomUnitChatShoutMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitChatShoutMessage message) {
        // No fields to write
    }
}
