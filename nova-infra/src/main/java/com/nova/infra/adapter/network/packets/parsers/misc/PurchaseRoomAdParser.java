package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PurchaseRoomAdMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PurchaseRoomAd packet from client.
 */
@ParsesPacket(Incoming.PURCHASE_ROOM_AD)
public class PurchaseRoomAdParser extends PacketParser<PurchaseRoomAdMessageEvent> {
@Override
    public PurchaseRoomAdMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseRoomAdMessageEvent();
    }
}
