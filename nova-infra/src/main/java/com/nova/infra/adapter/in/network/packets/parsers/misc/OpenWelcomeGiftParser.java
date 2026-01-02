package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.OpenWelcomeGiftMessageEvent;

/**
 * Parses OpenWelcomeGift packet from client.
 */
public class OpenWelcomeGiftParser extends PacketParser<OpenWelcomeGiftMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.WELCOME_OPEN_GIFT;
    }

    @Override
    public OpenWelcomeGiftMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenWelcomeGiftMessageEvent();
    }
}
