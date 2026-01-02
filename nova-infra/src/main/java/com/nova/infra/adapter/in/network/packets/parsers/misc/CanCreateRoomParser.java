package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CanCreateRoomMessageEvent;

/**
 * Parses CanCreateRoom packet from client.
 */
public class CanCreateRoomParser extends PacketParser<CanCreateRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CAN_CREATE_ROOM;
    }

    @Override
    public CanCreateRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CanCreateRoomMessageEvent();
    }
}
