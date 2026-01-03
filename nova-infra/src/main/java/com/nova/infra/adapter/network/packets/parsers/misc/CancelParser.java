package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.CancelMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Cancel packet from client.
 */
@ParsesPacket(Incoming.CANCEL_ROOM_EVENT)
public class CancelParser extends PacketParser<CancelMessageEvent> {
@Override
    public CancelMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CancelMessageEvent();
    }
}
