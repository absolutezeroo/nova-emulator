package com.nova.infra.adapter.network.packets.parsers.trading;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.trading.TradingConfirmationMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses TradingConfirmation packet from client.
 */
@ParsesPacket(Incoming.TRADE_CONFIRM)
public class TradingConfirmationParser extends PacketParser<TradingConfirmationMessageEvent> {
@Override
    public TradingConfirmationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new TradingConfirmationMessageEvent();
    }
}
