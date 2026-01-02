package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCurrentTimingCodeMessageEvent;

/**
 * Parses GetCurrentTimingCode packet from client.
 */
public class GetCurrentTimingCodeParser extends PacketParser<GetCurrentTimingCodeMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CURRENT_TIMING_CODE;
    }

    @Override
    public GetCurrentTimingCodeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCurrentTimingCodeMessageEvent();
    }
}
