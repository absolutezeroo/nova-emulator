package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FriendListUpdateMessageEvent;

/**
 * Parses FriendListUpdate packet from client.
 */
public class FriendListUpdateParser extends PacketParser<FriendListUpdateMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FRIEND_LIST_UPDATE;
    }

    @Override
    public FriendListUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FriendListUpdateMessageEvent();
    }
}
