package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.InfoRetrieveMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses InfoRetrieve packet from client.
 */
@ParsesPacket(Incoming.USER_INFO)
public class InfoRetrieveParser extends PacketParser<InfoRetrieveMessageEvent> {
@Override
    public InfoRetrieveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new InfoRetrieveMessageEvent();
    }
}
