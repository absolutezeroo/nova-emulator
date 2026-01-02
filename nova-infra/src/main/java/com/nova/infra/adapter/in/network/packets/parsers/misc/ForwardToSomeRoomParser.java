package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ForwardToSomeRoomMessageEvent;

/**
 * Parses ForwardToSomeRoom packet from client.
 */
public class ForwardToSomeRoomParser extends PacketParser<ForwardToSomeRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FORWARD_TO_SOME_ROOM;
    }

    @Override
    public ForwardToSomeRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToSomeRoomMessageEvent();
    }
}
