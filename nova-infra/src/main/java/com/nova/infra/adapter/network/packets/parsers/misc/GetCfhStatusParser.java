package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetCfhStatusMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
