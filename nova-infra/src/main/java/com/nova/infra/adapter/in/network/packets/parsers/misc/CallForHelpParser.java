package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CallForHelpMessageEvent;

/**
 * Parses CallForHelp packet from client.
 */
public class CallForHelpParser extends PacketParser<CallForHelpMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CALL_FOR_HELP;
    }

    @Override
    public CallForHelpMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CallForHelpMessageEvent();
    }
}
