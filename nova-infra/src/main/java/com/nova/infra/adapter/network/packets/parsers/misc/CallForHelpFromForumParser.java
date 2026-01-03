package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.CallForHelpFromForumMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses CallForHelpFromForum packet from client.
 */
@ParsesPacket(Incoming.CALL_FOR_HELP_FROM_FORUM_MESSAGE)
public class CallForHelpFromForumParser extends PacketParser<CallForHelpFromForumMessageEvent> {
@Override
    public CallForHelpFromForumMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CallForHelpFromForumMessageEvent();
    }
}
