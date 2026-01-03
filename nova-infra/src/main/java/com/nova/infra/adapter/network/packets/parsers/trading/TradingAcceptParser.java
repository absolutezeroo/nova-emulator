package com.nova.infra.adapter.network.packets.parsers.trading;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.trading.TradingAcceptMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
