package com.nova.infra.adapter.network.packets.composers.trading;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.trading.TradingNoSuchItemMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingNoSuchItem packet for client.
 */
@ComposesPacket(Outgoing.TRADE_NO_SUCH_ITEM)
public class TradingNoSuchItemComposer extends PacketComposer<TradingNoSuchItemMessage> {
@Override
    protected void write(PacketBuffer packet, TradingNoSuchItemMessage message) {
        // No fields to write
    }
}
