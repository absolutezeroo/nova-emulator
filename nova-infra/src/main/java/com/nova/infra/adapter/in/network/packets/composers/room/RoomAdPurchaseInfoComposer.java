package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomAdPurchaseInfoMessage;

/**
 * Composes RoomAdPurchaseInfo packet for client.
 */
public class RoomAdPurchaseInfoComposer extends PacketComposer<RoomAdPurchaseInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_AD_PURCHASE;
    }

    @Override
    protected void write(PacketBuffer packet, RoomAdPurchaseInfoMessage message) {
        packet.appendBoolean(message.isVip());
    }
}
