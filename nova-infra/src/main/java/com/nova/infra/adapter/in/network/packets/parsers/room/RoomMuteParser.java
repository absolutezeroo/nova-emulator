package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomMuteMessageEvent;

/**
 * Parses RoomMute packet from client.
 */
public class RoomMuteParser extends PacketParser<RoomMuteMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_MUTE;
    }

    @Override
    public RoomMuteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomMuteMessageEvent();
    }
}
