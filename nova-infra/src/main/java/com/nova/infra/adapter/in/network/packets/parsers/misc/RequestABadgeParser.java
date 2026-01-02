package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RequestABadgeMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RequestABadge packet from client.
 */
@ParsesPacket(Incoming.REQUESTABADGE)
public class RequestABadgeParser extends PacketParser<RequestABadgeMessageEvent> {
@Override
    public RequestABadgeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestABadgeMessageEvent();
    }
}
