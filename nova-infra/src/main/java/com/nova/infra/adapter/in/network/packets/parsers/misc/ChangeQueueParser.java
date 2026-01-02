package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ChangeQueueMessageEvent;

/**
 * Parses ChangeQueue packet from client.
 */
public class ChangeQueueParser extends PacketParser<ChangeQueueMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CHANGE_QUEUE;
    }

    @Override
    public ChangeQueueMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ChangeQueueMessageEvent();
    }
}
