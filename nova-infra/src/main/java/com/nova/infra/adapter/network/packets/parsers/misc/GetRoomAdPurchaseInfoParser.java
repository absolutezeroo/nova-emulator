package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetRoomAdPurchaseInfoMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetRoomAdPurchaseInfo packet from client.
 */
@ParsesPacket(Incoming.GET_ROOM_AD_PURCHASE_INFO)
public class GetRoomAdPurchaseInfoParser extends PacketParser<GetRoomAdPurchaseInfoMessageEvent> {
@Override
    public GetRoomAdPurchaseInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomAdPurchaseInfoMessageEvent();
    }
}
