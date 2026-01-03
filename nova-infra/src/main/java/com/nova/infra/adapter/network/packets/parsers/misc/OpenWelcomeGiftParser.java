package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.OpenWelcomeGiftMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses OpenWelcomeGift packet from client.
 */
@ParsesPacket(Incoming.WELCOME_OPEN_GIFT)
public class OpenWelcomeGiftParser extends PacketParser<OpenWelcomeGiftMessageEvent> {
@Override
    public OpenWelcomeGiftMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenWelcomeGiftMessageEvent();
    }
}
