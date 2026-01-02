package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CallForHelpFromIMMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CallForHelpFromIM packet from client.
 */
@ParsesPacket(Incoming.CALL_FOR_HELP_FROM_IM)
public class CallForHelpFromIMParser extends PacketParser<CallForHelpFromIMMessageEvent> {
@Override
    public CallForHelpFromIMMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CallForHelpFromIMMessageEvent();
    }
}
