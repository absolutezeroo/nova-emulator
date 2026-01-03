package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PostMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses Post packet from client.
 */
@ParsesPacket(Incoming.FORUM_POST_MESSAGE)
public class PostParser extends PacketParser<PostMessageEvent> {
@Override
    public PostMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PostMessageEvent();
    }
}
