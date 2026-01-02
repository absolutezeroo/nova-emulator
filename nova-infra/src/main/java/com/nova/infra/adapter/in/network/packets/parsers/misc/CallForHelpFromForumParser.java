package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.CallForHelpFromForumMessageEvent;

/**
 * Parses CallForHelpFromForum packet from client.
 */
public class CallForHelpFromForumParser extends PacketParser<CallForHelpFromForumMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CALL_FOR_HELP_FROM_FORUM_MESSAGE;
    }

    @Override
    public CallForHelpFromForumMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CallForHelpFromForumMessageEvent();
    }
}
