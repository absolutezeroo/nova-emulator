package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserCurrencyMessageEvent;

/**
 * Parses UserCurrency packet from client.
 */
public class UserCurrencyParser extends PacketParser<UserCurrencyMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_CURRENCY;
    }

    @Override
    public UserCurrencyMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserCurrencyMessageEvent();
    }
}
