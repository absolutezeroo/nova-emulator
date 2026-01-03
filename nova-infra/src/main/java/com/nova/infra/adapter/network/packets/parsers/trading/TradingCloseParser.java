package com.nova.infra.adapter.network.packets.parsers.trading;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.trading.TradingCloseMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
