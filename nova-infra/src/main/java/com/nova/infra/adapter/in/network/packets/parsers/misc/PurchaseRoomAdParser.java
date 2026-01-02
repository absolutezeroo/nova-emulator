package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PurchaseRoomAdMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
