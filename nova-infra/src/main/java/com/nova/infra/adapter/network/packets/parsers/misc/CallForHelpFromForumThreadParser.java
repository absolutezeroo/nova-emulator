package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.CallForHelpFromForumThreadMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
