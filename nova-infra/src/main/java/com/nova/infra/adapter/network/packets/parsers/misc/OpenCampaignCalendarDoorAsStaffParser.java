package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.OpenCampaignCalendarDoorAsStaffMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses OpenCampaignCalendarDoorAsStaff packet from client.
 */
@ParsesPacket(Incoming.OPEN_CAMPAIGN_CALENDAR_DOOR_STAFF)
public class OpenCampaignCalendarDoorAsStaffParser extends PacketParser<OpenCampaignCalendarDoorAsStaffMessageEvent> {
@Override
    public OpenCampaignCalendarDoorAsStaffMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenCampaignCalendarDoorAsStaffMessageEvent();
    }
}
