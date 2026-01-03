package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.WelcomeGiftChangeEmailMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses WelcomeGiftChangeEmail packet from client.
 */
@ParsesPacket(Incoming.WELCOME_GIFT_CHANGE_EMAIL)
public class WelcomeGiftChangeEmailParser extends PacketParser<WelcomeGiftChangeEmailMessageEvent> {
@Override
    public WelcomeGiftChangeEmailMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new WelcomeGiftChangeEmailMessageEvent();
    }
}
