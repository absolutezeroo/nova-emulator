package com.nova.infra.adapter.in.network.packets.parsers.talent;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.talent.GetTalentTrackLevelMessageEvent;

/**
 * Parses GetTalentTrackLevel packet from client.
 */
public class GetTalentTrackLevelParser extends PacketParser<GetTalentTrackLevelMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TALENT_TRACK_GET_LEVEL;
    }

    @Override
    public GetTalentTrackLevelMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetTalentTrackLevelMessageEvent();
    }
}
