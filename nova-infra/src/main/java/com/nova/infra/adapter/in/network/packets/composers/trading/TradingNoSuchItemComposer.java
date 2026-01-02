package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingNoSuchItemMessage;

/**
 * Composes TradingNoSuchItem packet for client.
 */
public class TradingNoSuchItemComposer extends PacketComposer<TradingNoSuchItemMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_NO_SUCH_ITEM;
    }

    @Override
    protected void write(PacketBuffer packet, TradingNoSuchItemMessage message) {
        // No fields to write
    }
}
