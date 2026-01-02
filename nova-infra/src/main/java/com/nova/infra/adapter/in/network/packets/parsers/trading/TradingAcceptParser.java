package com.nova.infra.adapter.in.network.packets.parsers.trading;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.trading.TradingAcceptMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses TradingAccept packet from client.
 */
@ParsesPacket(Incoming.TRADE_ACCEPT)
public class TradingAcceptParser extends PacketParser<TradingAcceptMessageEvent> {
@Override
    public TradingAcceptMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingAcceptMessageEvent();
    }
}
