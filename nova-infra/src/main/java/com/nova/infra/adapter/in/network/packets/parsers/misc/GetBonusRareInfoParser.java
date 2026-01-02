package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetBonusRareInfoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetBonusRareInfo packet from client.
 */
@ParsesPacket(Incoming.GET_BONUS_RARE_INFO)
public class GetBonusRareInfoParser extends PacketParser<GetBonusRareInfoMessageEvent> {
@Override
    public GetBonusRareInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetBonusRareInfoMessageEvent();
    }
}
