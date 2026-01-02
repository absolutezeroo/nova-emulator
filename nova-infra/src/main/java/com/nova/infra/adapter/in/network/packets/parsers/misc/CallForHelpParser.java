package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CallForHelpMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CallForHelp packet from client.
 */
@ParsesPacket(Incoming.CALL_FOR_HELP)
public class CallForHelpParser extends PacketParser<CallForHelpMessageEvent> {
@Override
    public CallForHelpMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CallForHelpMessageEvent();
    }
}
