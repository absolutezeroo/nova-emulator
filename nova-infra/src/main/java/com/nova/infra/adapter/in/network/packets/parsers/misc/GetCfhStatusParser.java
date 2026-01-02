package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCfhStatusMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCfhStatus packet from client.
 */
@ParsesPacket(Incoming.GET_CFH_STATUS)
public class GetCfhStatusParser extends PacketParser<GetCfhStatusMessageEvent> {
@Override
    public GetCfhStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCfhStatusMessageEvent();
    }
}
