package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetFaqTextMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetFaqText packet from client.
 */
@ParsesPacket(Incoming.GET_FAQ_TEXT)
public class GetFaqTextParser extends PacketParser<GetFaqTextMessageEvent> {
@Override
    public GetFaqTextMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetFaqTextMessageEvent();
    }
}
