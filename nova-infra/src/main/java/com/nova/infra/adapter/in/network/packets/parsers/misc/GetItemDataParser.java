package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetItemDataMessageEvent;

/**
 * Parses GetItemData packet from client.
 */
public class GetItemDataParser extends PacketParser<GetItemDataMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_ITEM_DATA;
    }

    @Override
    public GetItemDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetItemDataMessageEvent();
    }
}
