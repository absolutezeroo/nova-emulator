package com.nova.infra.adapter.in.network.packets.parsers.messenger;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.messenger.MessengerInitMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses MessengerInit packet from client.
 */
@ParsesPacket(Incoming.MESSENGER_INIT)
public class MessengerInitParser extends PacketParser<MessengerInitMessageEvent> {
@Override
    public MessengerInitMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MessengerInitMessageEvent();
    }
}
