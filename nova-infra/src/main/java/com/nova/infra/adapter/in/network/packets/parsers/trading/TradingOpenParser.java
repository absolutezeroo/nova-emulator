package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingOpenMessageEvent;

/**
 * Parses TradingOpen packet from client.
 */
public class TradingOpenParser extends PacketParser<TradingOpenMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TRADE;
    }

    @Override
    public TradingOpenMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingOpenMessageEvent();
    }
}
