package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingYouAreNotAllowedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingYouAreNotAllowed packet for client.
 */
@ComposesPacket(Outgoing.TRADE_YOU_NOT_ALLOWED)
public class TradingYouAreNotAllowedComposer extends PacketComposer<TradingYouAreNotAllowedMessage> {
@Override
    protected void write(PacketBuffer packet, TradingYouAreNotAllowedMessage message) {
        // No fields to write
    }
}
