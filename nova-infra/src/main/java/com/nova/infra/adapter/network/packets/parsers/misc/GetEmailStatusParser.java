package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetEmailStatusMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetEmailStatus packet from client.
 */
@ParsesPacket(Incoming.EMAIL_GET_STATUS)
public class GetEmailStatusParser extends PacketParser<GetEmailStatusMessageEvent> {
@Override
    public GetEmailStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetEmailStatusMessageEvent();
    }
}
