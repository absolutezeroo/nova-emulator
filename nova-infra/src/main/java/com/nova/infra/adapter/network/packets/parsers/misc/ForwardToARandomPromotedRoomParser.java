package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ForwardToARandomPromotedRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ForwardToARandomPromotedRoom packet from client.
 */
@ParsesPacket(Incoming.FORWARD_TO_RANDOM_PROMOTED_ROOM)
public class ForwardToARandomPromotedRoomParser extends PacketParser<ForwardToARandomPromotedRoomMessageEvent> {
@Override
    public ForwardToARandomPromotedRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToARandomPromotedRoomMessageEvent();
    }
}
