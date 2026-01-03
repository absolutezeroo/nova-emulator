package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetFaqTextMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
