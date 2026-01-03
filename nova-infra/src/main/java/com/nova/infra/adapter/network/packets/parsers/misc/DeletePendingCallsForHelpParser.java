package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.DeletePendingCallsForHelpMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses DeletePendingCallsForHelp packet from client.
 */
@ParsesPacket(Incoming.DELETE_PENDING_CALLS_FOR_HELP)
public class DeletePendingCallsForHelpParser extends PacketParser<DeletePendingCallsForHelpMessageEvent> {
@Override
    public DeletePendingCallsForHelpMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new DeletePendingCallsForHelpMessageEvent();
    }
}
