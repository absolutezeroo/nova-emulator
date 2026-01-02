package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.JoinQueueMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses JoinQueue packet from client.
 */
@ParsesPacket(Incoming.JOINQUEUEMESSAGE)
public class JoinQueueParser extends PacketParser<JoinQueueMessageEvent> {
@Override
    public JoinQueueMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new JoinQueueMessageEvent();
    }
}
