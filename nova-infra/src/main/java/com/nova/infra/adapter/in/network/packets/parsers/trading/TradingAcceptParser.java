package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingAcceptMessageEvent;

/**
 * Parses TradingAccept packet from client.
 */
public class TradingAcceptParser extends PacketParser<TradingAcceptMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TRADE_ACCEPT;
    }

    @Override
    public TradingAcceptMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingAcceptMessageEvent();
    }
}
