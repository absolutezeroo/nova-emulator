package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCfhChatlogMessageEvent;

/**
 * Parses GetCfhChatlog packet from client.
 */
public class GetCfhChatlogParser extends PacketParser<GetCfhChatlogMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CFH_CHATLOG;
    }

    @Override
    public GetCfhChatlogMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCfhChatlogMessageEvent();
    }
}
