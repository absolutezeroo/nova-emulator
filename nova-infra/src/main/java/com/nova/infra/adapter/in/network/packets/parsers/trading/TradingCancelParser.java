package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingCancelMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses TradingCancel packet from client.
 */
@ParsesPacket(Incoming.TRADE_CANCEL)
public class TradingCancelParser extends PacketParser<TradingCancelMessageEvent> {
@Override
    public TradingCancelMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingCancelMessageEvent();
    }
}
