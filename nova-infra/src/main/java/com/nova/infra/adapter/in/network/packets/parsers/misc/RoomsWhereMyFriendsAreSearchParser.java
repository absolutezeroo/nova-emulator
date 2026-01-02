package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RoomsWhereMyFriendsAreSearchMessageEvent;

/**
 * Parses RoomsWhereMyFriendsAreSearch packet from client.
 */
public class RoomsWhereMyFriendsAreSearchParser extends PacketParser<RoomsWhereMyFriendsAreSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOMS_WHERE_MY_FRIENDS_ARE;
    }

    @Override
    public RoomsWhereMyFriendsAreSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomsWhereMyFriendsAreSearchMessageEvent();
    }
}
