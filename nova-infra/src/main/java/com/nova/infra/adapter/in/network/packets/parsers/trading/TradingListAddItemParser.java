package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingListAddItemMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses TradingListAddItem packet from client.
 */
@ParsesPacket(Incoming.TRADE_ITEM)
public class TradingListAddItemParser extends PacketParser<TradingListAddItemMessageEvent> {
@Override
    public TradingListAddItemMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingListAddItemMessageEvent();
    }
}
