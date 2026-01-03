package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RequestABadgeMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
