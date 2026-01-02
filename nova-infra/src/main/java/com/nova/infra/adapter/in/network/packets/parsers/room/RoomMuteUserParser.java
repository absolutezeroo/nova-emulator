package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomMuteUserMessageEvent;

/**
 * Parses RoomMuteUser packet from client.
 */
public class RoomMuteUserParser extends PacketParser<RoomMuteUserMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_MUTE_USER;
    }

    @Override
    public RoomMuteUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomMuteUserMessageEvent();
    }
}
