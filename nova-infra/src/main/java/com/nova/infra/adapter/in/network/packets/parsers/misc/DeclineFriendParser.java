package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.DeclineFriendMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses DeclineFriend packet from client.
 */
@ParsesPacket(Incoming.DECLINE_FRIEND)
public class DeclineFriendParser extends PacketParser<DeclineFriendMessageEvent> {
@Override
    public DeclineFriendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new DeclineFriendMessageEvent();
    }
}
