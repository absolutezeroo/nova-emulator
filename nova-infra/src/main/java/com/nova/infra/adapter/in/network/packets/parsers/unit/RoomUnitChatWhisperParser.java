package com.nova.infra.adapter.in.network.packets.parsers.unit;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.unit.RoomUnitChatWhisperMessageEvent;

/**
 * Parses RoomUnitChatWhisper packet from client.
 */
public class RoomUnitChatWhisperParser extends PacketParser<RoomUnitChatWhisperMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UNIT_CHAT_WHISPER;
    }

    @Override
    public RoomUnitChatWhisperMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitChatWhisperMessageEvent();
    }
}
