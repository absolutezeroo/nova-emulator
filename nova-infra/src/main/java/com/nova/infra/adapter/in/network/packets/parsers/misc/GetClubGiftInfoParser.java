package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetClubGiftInfoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetClubGiftInfo packet from client.
 */
@ParsesPacket(Incoming.GET_CLUB_GIFT_INFO)
public class GetClubGiftInfoParser extends PacketParser<GetClubGiftInfoMessageEvent> {
@Override
    public GetClubGiftInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetClubGiftInfoMessageEvent();
    }
}
