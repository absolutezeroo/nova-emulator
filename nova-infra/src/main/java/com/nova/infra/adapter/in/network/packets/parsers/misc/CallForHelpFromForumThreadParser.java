package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CallForHelpFromForumThreadMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CallForHelpFromForumThread packet from client.
 */
@ParsesPacket(Incoming.CALL_FOR_HELP_FROM_FORUM_THREAD)
public class CallForHelpFromForumThreadParser extends PacketParser<CallForHelpFromForumThreadMessageEvent> {
@Override
    public CallForHelpFromForumThreadMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CallForHelpFromForumThreadMessageEvent();
    }
}
