package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CanCreateRoomMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CanCreateRoom packet from client.
 */
@ParsesPacket(Incoming.CAN_CREATE_ROOM)
public class CanCreateRoomParser extends PacketParser<CanCreateRoomMessageEvent> {
@Override
    public CanCreateRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CanCreateRoomMessageEvent();
    }
}
