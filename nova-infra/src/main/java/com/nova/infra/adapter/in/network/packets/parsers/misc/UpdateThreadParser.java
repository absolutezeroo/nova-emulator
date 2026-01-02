package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UpdateThreadMessageEvent;

/**
 * Parses UpdateThread packet from client.
 */
public class UpdateThreadParser extends PacketParser<UpdateThreadMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FORUM_UPDATE_THREAD;
    }

    @Override
    public UpdateThreadMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateThreadMessageEvent();
    }
}
