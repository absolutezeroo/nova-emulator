package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ForwardToASubmittableRoomMessageEvent;

/**
 * Parses ForwardToASubmittableRoom packet from client.
 */
public class ForwardToASubmittableRoomParser extends PacketParser<ForwardToASubmittableRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FORWARD_TO_A_SUBMITTABLE_ROOM;
    }

    @Override
    public ForwardToASubmittableRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToASubmittableRoomMessageEvent();
    }
}
