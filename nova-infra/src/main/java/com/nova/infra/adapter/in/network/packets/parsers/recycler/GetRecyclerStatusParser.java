package com.nova.infra.adapter.in.network.packets.parsers.recycler;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.recycler.GetRecyclerStatusMessageEvent;

/**
 * Parses GetRecyclerStatus packet from client.
 */
public class GetRecyclerStatusParser extends PacketParser<GetRecyclerStatusMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RECYCLER_STATUS;
    }

    @Override
    public GetRecyclerStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRecyclerStatusMessageEvent();
    }
}
