package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.FriendListUpdateMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FriendListUpdate packet from client.
 */
@ParsesPacket(Incoming.FRIEND_LIST_UPDATE)
public class FriendListUpdateParser extends PacketParser<FriendListUpdateMessageEvent> {
@Override
    public FriendListUpdateMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FriendListUpdateMessageEvent();
    }
}
