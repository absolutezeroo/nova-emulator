package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CancelMessageEvent;

/**
 * Parses Cancel packet from client.
 */
public class CancelParser extends PacketParser<CancelMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CANCEL_ROOM_EVENT;
    }

    @Override
    public CancelMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CancelMessageEvent();
    }
}
