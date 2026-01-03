package com.nova.infra.adapter.network.packets.parsers.messenger;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.messenger.SendMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Send packet from client.
 */
@ParsesPacket(Incoming.MESSENGER_CHAT)
public class SendParser extends PacketParser<SendMessageEvent> {
@Override
    public SendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SendMessageEvent();
    }
}
