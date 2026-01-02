package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingUnacceptMessageEvent;

/**
 * Parses TradingUnaccept packet from client.
 */
public class TradingUnacceptParser extends PacketParser<TradingUnacceptMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TRADE_UNACCEPT;
    }

    @Override
    public TradingUnacceptMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingUnacceptMessageEvent();
    }
}
