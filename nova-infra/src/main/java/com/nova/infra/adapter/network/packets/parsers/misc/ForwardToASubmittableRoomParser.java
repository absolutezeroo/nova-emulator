package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ForwardToASubmittableRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ForwardToASubmittableRoom packet from client.
 */
@ParsesPacket(Incoming.FORWARD_TO_A_SUBMITTABLE_ROOM)
public class ForwardToASubmittableRoomParser extends PacketParser<ForwardToASubmittableRoomMessageEvent> {
@Override
    public ForwardToASubmittableRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ForwardToASubmittableRoomMessageEvent();
    }
}
