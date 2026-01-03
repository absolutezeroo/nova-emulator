package com.nova.infra.adapter.network.packets.parsers.moderation;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.moderation.GetRoomChatlogMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetRoomChatlog packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_REQUEST_ROOM_CHATLOG)
public class GetRoomChatlogParser extends PacketParser<GetRoomChatlogMessageEvent> {
@Override
    public GetRoomChatlogMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomChatlogMessageEvent();
    }
}
