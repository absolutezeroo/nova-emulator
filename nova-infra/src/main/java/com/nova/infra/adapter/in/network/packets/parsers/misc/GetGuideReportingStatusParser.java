package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetGuideReportingStatusMessageEvent;

/**
 * Parses GetGuideReportingStatus packet from client.
 */
public class GetGuideReportingStatusParser extends PacketParser<GetGuideReportingStatusMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_GUIDE_REPORTING_STATUS;
    }

    @Override
    public GetGuideReportingStatusMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetGuideReportingStatusMessageEvent();
    }
}
