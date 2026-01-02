package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.OpenCampaignCalendarDoorMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses OpenCampaignCalendarDoor packet from client.
 */
@ParsesPacket(Incoming.OPEN_CAMPAIGN_CALENDAR_DOOR)
public class OpenCampaignCalendarDoorParser extends PacketParser<OpenCampaignCalendarDoorMessageEvent> {
@Override
    public OpenCampaignCalendarDoorMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new OpenCampaignCalendarDoorMessageEvent();
    }
}
