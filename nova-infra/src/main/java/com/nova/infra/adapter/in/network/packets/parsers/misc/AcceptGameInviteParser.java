package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.AcceptGameInviteMessageEvent;

/**
 * Parses AcceptGameInvite packet from client.
 */
public class AcceptGameInviteParser extends PacketParser<AcceptGameInviteMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ACCEPTGAMEINVITE;
    }

    @Override
    public AcceptGameInviteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AcceptGameInviteMessageEvent();
    }
}
