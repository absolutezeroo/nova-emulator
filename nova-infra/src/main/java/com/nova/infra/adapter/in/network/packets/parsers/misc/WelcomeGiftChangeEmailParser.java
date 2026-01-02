package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.WelcomeGiftChangeEmailMessageEvent;

/**
 * Parses WelcomeGiftChangeEmail packet from client.
 */
public class WelcomeGiftChangeEmailParser extends PacketParser<WelcomeGiftChangeEmailMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.WELCOME_GIFT_CHANGE_EMAIL;
    }

    @Override
    public WelcomeGiftChangeEmailMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new WelcomeGiftChangeEmailMessageEvent();
    }
}
