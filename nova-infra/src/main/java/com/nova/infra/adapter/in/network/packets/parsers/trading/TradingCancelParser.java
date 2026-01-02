package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingCancelMessageEvent;

/**
 * Parses TradingCancel packet from client.
 */
public class TradingCancelParser extends PacketParser<TradingCancelMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.TRADE_CANCEL;
    }

    @Override
    public TradingCancelMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingCancelMessageEvent();
    }
}
