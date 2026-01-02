package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ForwardToSomeRoomMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ForwardToSomeRoom packet from client.
 */
@ParsesPacket(Incoming.FORWARD_TO_SOME_ROOM)
public class ForwardToSomeRoomParser extends PacketParser<ForwardToSomeRoomMessageEvent> {
@Override
    public ForwardToSomeRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToSomeRoomMessageEvent();
    }
}
