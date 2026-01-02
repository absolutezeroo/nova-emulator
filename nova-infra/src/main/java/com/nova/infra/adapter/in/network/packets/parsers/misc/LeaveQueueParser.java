package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.LeaveQueueMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses LeaveQueue packet from client.
 */
@ParsesPacket(Incoming.LEAVEQUEUEMESSAGE)
public class LeaveQueueParser extends PacketParser<LeaveQueueMessageEvent> {
@Override
    public LeaveQueueMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new LeaveQueueMessageEvent();
    }
}
