package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.AcceptGameInviteMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses AcceptGameInvite packet from client.
 */
@ParsesPacket(Incoming.ACCEPTGAMEINVITE)
public class AcceptGameInviteParser extends PacketParser<AcceptGameInviteMessageEvent> {
@Override
    public AcceptGameInviteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AcceptGameInviteMessageEvent();
    }
}
