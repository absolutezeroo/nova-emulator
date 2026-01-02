package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetBonusRareInfoMessageEvent;

/**
 * Parses GetBonusRareInfo packet from client.
 */
public class GetBonusRareInfoParser extends PacketParser<GetBonusRareInfoMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_BONUS_RARE_INFO;
    }

    @Override
    public GetBonusRareInfoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetBonusRareInfoMessageEvent();
    }
}
