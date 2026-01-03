package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetItemDataMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetItemData packet from client.
 */
@ParsesPacket(Incoming.GET_ITEM_DATA)
public class GetItemDataParser extends PacketParser<GetItemDataMessageEvent> {
@Override
    public GetItemDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetItemDataMessageEvent();
    }
}
