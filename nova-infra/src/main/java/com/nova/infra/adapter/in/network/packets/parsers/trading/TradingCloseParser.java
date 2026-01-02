package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingCloseMessageEvent;

/**
 * Parses TradingClose packet from client.
 */
public class TradingCloseParser extends PacketParser<TradingCloseMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TRADE_CLOSE;
    }

    @Override
    public TradingCloseMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingCloseMessageEvent();
    }
}
