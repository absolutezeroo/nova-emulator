package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetEmailStatusMessageEvent;

/**
 * Parses GetEmailStatus packet from client.
 */
public class GetEmailStatusParser extends PacketParser<GetEmailStatusMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.EMAIL_GET_STATUS;
    }

    @Override
    public GetEmailStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetEmailStatusMessageEvent();
    }
}
