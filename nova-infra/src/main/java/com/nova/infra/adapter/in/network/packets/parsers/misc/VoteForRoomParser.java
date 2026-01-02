package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.VoteForRoomMessageEvent;

/**
 * Parses VoteForRoom packet from client.
 */
public class VoteForRoomParser extends PacketParser<VoteForRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.VOTE_FOR_ROOM;
    }

    @Override
    public VoteForRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new VoteForRoomMessageEvent();
    }
}
