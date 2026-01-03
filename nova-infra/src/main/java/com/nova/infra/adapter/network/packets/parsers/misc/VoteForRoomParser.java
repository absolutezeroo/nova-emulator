package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.VoteForRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses VoteForRoom packet from client.
 */
@ParsesPacket(Incoming.VOTE_FOR_ROOM)
public class VoteForRoomParser extends PacketParser<VoteForRoomMessageEvent> {
@Override
    public VoteForRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new VoteForRoomMessageEvent();
    }
}
