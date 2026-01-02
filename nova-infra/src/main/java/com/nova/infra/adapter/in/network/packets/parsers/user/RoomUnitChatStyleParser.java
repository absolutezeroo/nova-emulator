package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.RoomUnitChatStyleMessageEvent;

/**
 * Parses RoomUnitChatStyle packet from client.
 */
public class RoomUnitChatStyleParser extends PacketParser<RoomUnitChatStyleMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_SETTINGS_CHAT_STYLE;
    }

    @Override
    public RoomUnitChatStyleMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitChatStyleMessageEvent();
    }
}
