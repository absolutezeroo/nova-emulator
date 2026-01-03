package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.RoomUnitHandItemReceivedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitHandItemReceived packet for client.
 */
@ComposesPacket(Outgoing.HAND_ITEM_RECEIVED)
public class RoomUnitHandItemReceivedComposer extends PacketComposer<RoomUnitHandItemReceivedMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitHandItemReceivedMessage message) {
        packet.appendInt(message.giverUserId());
        packet.appendInt(message.handItemType());
    }
}
