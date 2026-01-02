package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingCompletedMessage;

/**
 * Composes TradingCompleted packet for client.
 */
public class TradingCompletedComposer extends PacketComposer<TradingCompletedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_COMPLETED;
    }

    @Override
    protected void write(PacketBuffer packet, TradingCompletedMessage message) {
        // No fields to write
    }
}
