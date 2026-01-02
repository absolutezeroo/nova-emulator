package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetGiftMessageEvent;

/**
 * Parses GetGift packet from client.
 */
public class GetGiftParser extends PacketParser<GetGiftMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_GIFT;
    }

    @Override
    public GetGiftMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGiftMessageEvent();
    }
}
