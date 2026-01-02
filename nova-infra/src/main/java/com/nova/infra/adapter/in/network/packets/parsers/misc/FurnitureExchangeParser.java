package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FurnitureExchangeMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FurnitureExchange packet from client.
 */
@ParsesPacket(Incoming.ITEM_EXCHANGE_REDEEM)
public class FurnitureExchangeParser extends PacketParser<FurnitureExchangeMessageEvent> {
@Override
    public FurnitureExchangeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FurnitureExchangeMessageEvent();
    }
}
