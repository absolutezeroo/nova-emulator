package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.GetRoomChatlogMessageEvent;

/**
 * Parses GetRoomChatlog packet from client.
 */
public class GetRoomChatlogParser extends PacketParser<GetRoomChatlogMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_REQUEST_ROOM_CHATLOG;
    }

    @Override
    public GetRoomChatlogMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomChatlogMessageEvent();
    }
}
