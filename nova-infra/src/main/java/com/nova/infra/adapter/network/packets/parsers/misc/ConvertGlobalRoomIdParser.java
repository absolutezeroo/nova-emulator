package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ConvertGlobalRoomIdMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ConvertGlobalRoomId packet from client.
 */
@ParsesPacket(Incoming.CONVERT_GLOBAL_ROOM_ID)
public class ConvertGlobalRoomIdParser extends PacketParser<ConvertGlobalRoomIdMessageEvent> {
@Override
    public ConvertGlobalRoomIdMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ConvertGlobalRoomIdMessageEvent();
    }
}
