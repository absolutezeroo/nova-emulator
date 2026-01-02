package com.nova.infra.adapter.in.network.packets.parsers.messenger;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.messenger.SendMessageEvent;

/**
 * Parses Send packet from client.
 */
public class SendParser extends PacketParser<SendMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MESSENGER_CHAT;
    }

    @Override
    public SendMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SendMessageEvent();
    }
}
