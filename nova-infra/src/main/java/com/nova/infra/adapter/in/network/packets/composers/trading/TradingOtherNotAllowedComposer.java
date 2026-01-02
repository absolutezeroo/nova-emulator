package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingOtherNotAllowedMessage;

/**
 * Composes TradingOtherNotAllowed packet for client.
 */
public class TradingOtherNotAllowedComposer extends PacketComposer<TradingOtherNotAllowedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_OTHER_NOT_ALLOWED;
    }

    @Override
    protected void write(PacketBuffer packet, TradingOtherNotAllowedMessage message) {
        // No fields to write
    }
}
