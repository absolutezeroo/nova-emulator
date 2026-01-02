package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetGuideReportingStatusMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetGuideReportingStatus packet from client.
 */
@ParsesPacket(Incoming.GET_GUIDE_REPORTING_STATUS)
public class GetGuideReportingStatusParser extends PacketParser<GetGuideReportingStatusMessageEvent> {
@Override
    public GetGuideReportingStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGuideReportingStatusMessageEvent();
    }
}
