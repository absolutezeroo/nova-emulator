package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingConfirmationMessage;

/**
 * Composes TradingConfirmation packet for client.
 */
public class TradingConfirmationComposer extends PacketComposer<TradingConfirmationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_CONFIRMATION;
    }

    @Override
    protected void write(PacketBuffer packet, TradingConfirmationMessage message) {
        // No fields to write
    }
}
