package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingCloseMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses TradingClose packet from client.
 */
@ParsesPacket(Incoming.TRADE_CLOSE)
public class TradingCloseParser extends PacketParser<TradingCloseMessageEvent> {
@Override
    public TradingCloseMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingCloseMessageEvent();
    }
}
