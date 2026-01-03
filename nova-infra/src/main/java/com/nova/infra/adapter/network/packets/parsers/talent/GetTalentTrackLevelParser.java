package com.nova.infra.adapter.network.packets.parsers.talent;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.talent.GetTalentTrackLevelMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetTalentTrackLevel packet from client.
 */
@ParsesPacket(Incoming.TALENT_TRACK_GET_LEVEL)
public class GetTalentTrackLevelParser extends PacketParser<GetTalentTrackLevelMessageEvent> {
@Override
    public GetTalentTrackLevelMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetTalentTrackLevelMessageEvent();
    }
}
