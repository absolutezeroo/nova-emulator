package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingConfirmationMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingConfirmation packet for client.
 */
@ComposesPacket(Outgoing.TRADE_CONFIRMATION)
public class TradingConfirmationComposer extends PacketComposer<TradingConfirmationMessage> {
@Override
    protected void write(PacketBuffer packet, TradingConfirmationMessage message) {
        // No fields to write
    }
}
