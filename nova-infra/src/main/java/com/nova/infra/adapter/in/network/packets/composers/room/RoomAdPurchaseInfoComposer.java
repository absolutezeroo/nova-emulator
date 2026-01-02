package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomAdPurchaseInfoMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomAdPurchaseInfo packet for client.
 */
@ComposesPacket(Outgoing.ROOM_AD_PURCHASE)
public class RoomAdPurchaseInfoComposer extends PacketComposer<RoomAdPurchaseInfoMessage> {
@Override
    protected void write(PacketBuffer packet, RoomAdPurchaseInfoMessage message) {
        packet.appendBoolean(message.isVip());
    }
}
