package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingListItemRemoveMessageEvent;

/**
 * Parses TradingListItemRemove packet from client.
 */
public class TradingListItemRemoveParser extends PacketParser<TradingListItemRemoveMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TRADE_ITEM_REMOVE;
    }

    @Override
    public TradingListItemRemoveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingListItemRemoveMessageEvent();
    }
}
