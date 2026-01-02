package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingListAddItemsMessageEvent;

/**
 * Parses TradingListAddItems packet from client.
 */
public class TradingListAddItemsParser extends PacketParser<TradingListAddItemsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TRADE_ITEMS;
    }

    @Override
    public TradingListAddItemsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingListAddItemsMessageEvent();
    }
}
