package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomMuteMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomMute packet from client.
 */
@ParsesPacket(Incoming.ROOM_MUTE)
public class RoomMuteParser extends PacketParser<RoomMuteMessageEvent> {
@Override
    public RoomMuteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomMuteMessageEvent();
    }
}
