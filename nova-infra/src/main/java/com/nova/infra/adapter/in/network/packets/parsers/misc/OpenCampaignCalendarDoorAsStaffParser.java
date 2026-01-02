package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.OpenCampaignCalendarDoorAsStaffMessageEvent;

/**
 * Parses OpenCampaignCalendarDoorAsStaff packet from client.
 */
public class OpenCampaignCalendarDoorAsStaffParser extends PacketParser<OpenCampaignCalendarDoorAsStaffMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.OPEN_CAMPAIGN_CALENDAR_DOOR_STAFF;
    }

    @Override
    public OpenCampaignCalendarDoorAsStaffMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenCampaignCalendarDoorAsStaffMessageEvent();
    }
}
