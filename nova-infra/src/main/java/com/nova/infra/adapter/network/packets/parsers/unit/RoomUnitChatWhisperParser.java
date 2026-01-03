package com.nova.infra.adapter.network.packets.parsers.unit;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.unit.RoomUnitChatWhisperMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnitChatWhisper packet from client.
 */
@ParsesPacket(Incoming.UNIT_CHAT_WHISPER)
public class RoomUnitChatWhisperParser extends PacketParser<RoomUnitChatWhisperMessageEvent> {
@Override
    public RoomUnitChatWhisperMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnitChatWhisperMessageEvent();
    }
}
