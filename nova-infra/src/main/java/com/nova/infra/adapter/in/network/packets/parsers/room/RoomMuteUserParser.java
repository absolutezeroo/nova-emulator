package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomMuteUserMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomMuteUser packet from client.
 */
@ParsesPacket(Incoming.ROOM_MUTE_USER)
public class RoomMuteUserParser extends PacketParser<RoomMuteUserMessageEvent> {
@Override
    public RoomMuteUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomMuteUserMessageEvent();
    }
}
