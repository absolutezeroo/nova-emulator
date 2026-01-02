package com.nova.infra.adapter.in.network.packets.parsers.messenger;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.messenger.MessengerInitMessageEvent;

/**
 * Parses MessengerInit packet from client.
 */
public class MessengerInitParser extends PacketParser<MessengerInitMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MESSENGER_INIT;
    }

    @Override
    public MessengerInitMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MessengerInitMessageEvent();
    }
}
