package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomMuteUserMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
