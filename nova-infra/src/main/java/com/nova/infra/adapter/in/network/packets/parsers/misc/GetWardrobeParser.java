package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetWardrobeMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetWardrobe packet from client.
 */
@ParsesPacket(Incoming.GET_WARDROBE)
public class GetWardrobeParser extends PacketParser<GetWardrobeMessageEvent> {
@Override
    public GetWardrobeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetWardrobeMessageEvent();
    }
}
