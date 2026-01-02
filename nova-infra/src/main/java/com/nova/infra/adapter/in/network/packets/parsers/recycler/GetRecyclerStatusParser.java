package com.nova.infra.adapter.in.network.packets.parsers.recycler;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.recycler.GetRecyclerStatusMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetRecyclerStatus packet from client.
 */
@ParsesPacket(Incoming.RECYCLER_STATUS)
public class GetRecyclerStatusParser extends PacketParser<GetRecyclerStatusMessageEvent> {
@Override
    public GetRecyclerStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRecyclerStatusMessageEvent();
    }
}
