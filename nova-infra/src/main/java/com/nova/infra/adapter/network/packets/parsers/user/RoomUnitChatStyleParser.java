package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.RoomUnitChatStyleMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitChatStyle packet from client.
 */
@ParsesPacket(Incoming.USER_SETTINGS_CHAT_STYLE)
public class RoomUnitChatStyleParser extends PacketParser<RoomUnitChatStyleMessageEvent> {
@Override
    public RoomUnitChatStyleMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitChatStyleMessageEvent();
    }
}
