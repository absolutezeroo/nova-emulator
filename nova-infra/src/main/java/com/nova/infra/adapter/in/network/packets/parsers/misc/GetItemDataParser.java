package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetItemDataMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
