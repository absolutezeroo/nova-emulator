package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetSeasonalQuestsOnlyMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetSeasonalQuestsOnly packet from client.
 */
@ParsesPacket(Incoming.GET_SEASONAL_QUESTS_ONLY)
public class GetSeasonalQuestsOnlyParser extends PacketParser<GetSeasonalQuestsOnlyMessageEvent> {
@Override
    public GetSeasonalQuestsOnlyMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSeasonalQuestsOnlyMessageEvent();
    }
}
