package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetPendingCallsForHelpMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetPendingCallsForHelp packet from client.
 */
@ParsesPacket(Incoming.GET_PENDING_CALLS_FOR_HELP)
public class GetPendingCallsForHelpParser extends PacketParser<GetPendingCallsForHelpMessageEvent> {
@Override
    public GetPendingCallsForHelpMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetPendingCallsForHelpMessageEvent();
    }
}
