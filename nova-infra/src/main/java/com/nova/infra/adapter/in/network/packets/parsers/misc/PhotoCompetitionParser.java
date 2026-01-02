package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PhotoCompetitionMessageEvent;

/**
 * Parses PhotoCompetition packet from client.
 */
public class PhotoCompetitionParser extends PacketParser<PhotoCompetitionMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PHOTO_COMPETITION;
    }

    @Override
    public PhotoCompetitionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PhotoCompetitionMessageEvent();
    }
}
