package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.TalentTrackMessageEvent;

/**
 * Parses TalentTrack packet from client.
 */
public class TalentTrackParser extends PacketParser<TalentTrackMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.HELPER_TALENT_TRACK;
    }

    @Override
    public TalentTrackMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TalentTrackMessageEvent();
    }
}
