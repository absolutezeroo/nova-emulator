package com.nova.infra.adapter.network.packets.parsers.trading;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.trading.TradingOpenMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses TradingOpen packet from client.
 */
@ParsesPacket(Incoming.TRADE)
public class TradingOpenParser extends PacketParser<TradingOpenMessageEvent> {
@Override
    public TradingOpenMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingOpenMessageEvent();
    }
}
