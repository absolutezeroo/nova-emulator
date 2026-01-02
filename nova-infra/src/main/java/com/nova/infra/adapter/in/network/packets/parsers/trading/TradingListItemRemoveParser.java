package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingListItemRemoveMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
