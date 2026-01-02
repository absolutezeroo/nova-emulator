package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingNotOpenMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingNotOpen packet for client.
 */
@ComposesPacket(Outgoing.TRADE_NOT_OPEN)
public class TradingNotOpenComposer extends PacketComposer<TradingNotOpenMessage> {
@Override
    protected void write(PacketBuffer packet, TradingNotOpenMessage message) {
        // No fields to write
    }
}
