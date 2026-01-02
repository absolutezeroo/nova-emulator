package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ConvertGlobalRoomIdMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
