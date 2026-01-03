package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.UpdateThreadMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateThread packet from client.
 */
@ParsesPacket(Incoming.FORUM_UPDATE_THREAD)
public class UpdateThreadParser extends PacketParser<UpdateThreadMessageEvent> {
@Override
    public UpdateThreadMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateThreadMessageEvent();
    }
}
