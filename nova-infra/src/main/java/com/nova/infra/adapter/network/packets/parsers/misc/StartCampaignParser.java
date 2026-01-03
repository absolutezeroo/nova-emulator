package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.StartCampaignMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses StartCampaign packet from client.
 */
@ParsesPacket(Incoming.START_CAMPAIGN)
public class StartCampaignParser extends PacketParser<StartCampaignMessageEvent> {
@Override
    public StartCampaignMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new StartCampaignMessageEvent();
    }
}
