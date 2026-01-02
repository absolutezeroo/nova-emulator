package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ForwardToARandomPromotedRoomMessageEvent;

/**
 * Parses ForwardToARandomPromotedRoom packet from client.
 */
public class ForwardToARandomPromotedRoomParser extends PacketParser<ForwardToARandomPromotedRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FORWARD_TO_RANDOM_PROMOTED_ROOM;
    }

    @Override
    public ForwardToARandomPromotedRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToARandomPromotedRoomMessageEvent();
    }
}
