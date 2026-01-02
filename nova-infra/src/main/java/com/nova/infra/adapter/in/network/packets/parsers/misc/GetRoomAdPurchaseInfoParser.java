package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetRoomAdPurchaseInfoMessageEvent;

/**
 * Parses GetRoomAdPurchaseInfo packet from client.
 */
public class GetRoomAdPurchaseInfoParser extends PacketParser<GetRoomAdPurchaseInfoMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_ROOM_AD_PURCHASE_INFO;
    }

    @Override
    public GetRoomAdPurchaseInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomAdPurchaseInfoMessageEvent();
    }
}
