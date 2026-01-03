package com.nova.infra.adapter.network.packets.parsers.trading;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.trading.TradingListAddItemsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses TradingListAddItems packet from client.
 */
@ParsesPacket(Incoming.TRADE_ITEMS)
public class TradingListAddItemsParser extends PacketParser<TradingListAddItemsMessageEvent> {
@Override
    public TradingListAddItemsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingListAddItemsMessageEvent();
    }
}
