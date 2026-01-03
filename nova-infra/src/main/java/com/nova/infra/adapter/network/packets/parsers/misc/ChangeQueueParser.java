package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ChangeQueueMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ChangeQueue packet from client.
 */
@ParsesPacket(Incoming.CHANGE_QUEUE)
public class ChangeQueueParser extends PacketParser<ChangeQueueMessageEvent> {
@Override
    public ChangeQueueMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChangeQueueMessageEvent();
    }
}
