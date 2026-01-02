package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PostMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
