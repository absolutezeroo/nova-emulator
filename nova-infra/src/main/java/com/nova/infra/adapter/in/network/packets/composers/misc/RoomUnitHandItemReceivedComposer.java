package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RoomUnitHandItemReceivedMessage;

/**
 * Composes RoomUnitHandItemReceived packet for client.
 */
public class RoomUnitHandItemReceivedComposer extends PacketComposer<RoomUnitHandItemReceivedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HAND_ITEM_RECEIVED;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitHandItemReceivedMessage message) {
        packet.appendInt(message.giverUserId());
        packet.appendInt(message.handItemType());
    }
}
