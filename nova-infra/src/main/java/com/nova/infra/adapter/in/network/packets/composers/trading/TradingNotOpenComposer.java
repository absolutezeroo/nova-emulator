package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingNotOpenMessage;

/**
 * Composes TradingNotOpen packet for client.
 */
public class TradingNotOpenComposer extends PacketComposer<TradingNotOpenMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_NOT_OPEN;
    }

    @Override
    protected void write(PacketBuffer packet, TradingNotOpenMessage message) {
        // No fields to write
    }
}
