package com.nova.infra.adapter.network.packets.parsers.trading;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.trading.TradingListItemRemoveMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses TradingListItemRemove packet from client.
 */
@ParsesPacket(Incoming.TRADE_ITEM_REMOVE)
public class TradingListItemRemoveParser extends PacketParser<TradingListItemRemoveMessageEvent> {
@Override
    public TradingListItemRemoveMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingListItemRemoveMessageEvent();
    }
}
