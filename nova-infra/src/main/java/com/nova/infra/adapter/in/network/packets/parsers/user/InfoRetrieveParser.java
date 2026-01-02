package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.InfoRetrieveMessageEvent;

/**
 * Parses InfoRetrieve packet from client.
 */
public class InfoRetrieveParser extends PacketParser<InfoRetrieveMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_INFO;
    }

    @Override
    public InfoRetrieveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new InfoRetrieveMessageEvent();
    }
}
