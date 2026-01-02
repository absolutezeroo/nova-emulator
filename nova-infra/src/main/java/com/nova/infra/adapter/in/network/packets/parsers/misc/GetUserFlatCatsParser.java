package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetUserFlatCatsMessageEvent;

/**
 * Parses GetUserFlatCats packet from client.
 */
public class GetUserFlatCatsParser extends PacketParser<GetUserFlatCatsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_USER_FLAT_CATS;
    }

    @Override
    public GetUserFlatCatsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUserFlatCatsMessageEvent();
    }
}
