package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetCurrentTimingCodeMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCurrentTimingCode packet from client.
 */
@ParsesPacket(Incoming.GET_CURRENT_TIMING_CODE)
public class GetCurrentTimingCodeParser extends PacketParser<GetCurrentTimingCodeMessageEvent> {
@Override
    public GetCurrentTimingCodeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCurrentTimingCodeMessageEvent();
    }
}
