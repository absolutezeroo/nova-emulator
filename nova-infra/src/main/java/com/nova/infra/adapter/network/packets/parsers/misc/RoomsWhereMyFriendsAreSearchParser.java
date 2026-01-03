package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RoomsWhereMyFriendsAreSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomsWhereMyFriendsAreSearch packet from client.
 */
@ParsesPacket(Incoming.ROOMS_WHERE_MY_FRIENDS_ARE)
public class RoomsWhereMyFriendsAreSearchParser extends PacketParser<RoomsWhereMyFriendsAreSearchMessageEvent> {
@Override
    public RoomsWhereMyFriendsAreSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomsWhereMyFriendsAreSearchMessageEvent();
    }
}
