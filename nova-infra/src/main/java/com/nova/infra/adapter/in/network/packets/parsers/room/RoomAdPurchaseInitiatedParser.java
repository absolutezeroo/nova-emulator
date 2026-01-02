package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomAdPurchaseInitiatedMessageEvent;

/**
 * Parses RoomAdPurchaseInitiated packet from client.
 */
public class RoomAdPurchaseInitiatedParser extends PacketParser<RoomAdPurchaseInitiatedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_AD_PURCHASE_INITIATED;
    }

    @Override
    public RoomAdPurchaseInitiatedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAdPurchaseInitiatedMessageEvent();
    }
}
