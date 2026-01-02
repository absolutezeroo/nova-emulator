package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitChatMessageEvent;

/**
 * Parses RoomUnitChat packet from client.
 */
public class RoomUnitChatParser extends PacketParser<RoomUnitChatMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_CHAT;
    }

    @Override
    public RoomUnitChatMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitChatMessageEvent();
    }
}
