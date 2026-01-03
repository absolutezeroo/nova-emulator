package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomAdPurchaseInitiatedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomAdPurchaseInitiated packet from client.
 */
@ParsesPacket(Incoming.ROOM_AD_PURCHASE_INITIATED)
public class RoomAdPurchaseInitiatedParser extends PacketParser<RoomAdPurchaseInitiatedMessageEvent> {
@Override
    public RoomAdPurchaseInitiatedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAdPurchaseInitiatedMessageEvent();
    }
}
