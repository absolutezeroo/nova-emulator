package com.nova.infra.adapter.network.packets.composers.trading;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.trading.TradingCompletedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingCompleted packet for client.
 */
@ComposesPacket(Outgoing.TRADE_COMPLETED)
public class TradingCompletedComposer extends PacketComposer<TradingCompletedMessage> {
@Override
    protected void write(PacketBuffer packet, TradingCompletedMessage message) {
        // No fields to write
    }
}
