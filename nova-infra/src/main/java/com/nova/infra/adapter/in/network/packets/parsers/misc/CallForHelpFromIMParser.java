package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CallForHelpFromIMMessageEvent;

/**
 * Parses CallForHelpFromIM packet from client.
 */
public class CallForHelpFromIMParser extends PacketParser<CallForHelpFromIMMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CALL_FOR_HELP_FROM_IM;
    }

    @Override
    public CallForHelpFromIMMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CallForHelpFromIMMessageEvent();
    }
}
