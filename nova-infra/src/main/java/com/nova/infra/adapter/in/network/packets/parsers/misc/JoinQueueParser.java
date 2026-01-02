package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.JoinQueueMessageEvent;

/**
 * Parses JoinQueue packet from client.
 */
public class JoinQueueParser extends PacketParser<JoinQueueMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.JOINQUEUEMESSAGE;
    }

    @Override
    public JoinQueueMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new JoinQueueMessageEvent();
    }
}
