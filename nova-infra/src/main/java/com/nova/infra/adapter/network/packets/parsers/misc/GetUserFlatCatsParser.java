package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetUserFlatCatsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetUserFlatCats packet from client.
 */
@ParsesPacket(Incoming.GET_USER_FLAT_CATS)
public class GetUserFlatCatsParser extends PacketParser<GetUserFlatCatsMessageEvent> {
@Override
    public GetUserFlatCatsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUserFlatCatsMessageEvent();
    }
}
