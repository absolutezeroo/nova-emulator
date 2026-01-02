package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingYouAreNotAllowedMessage;

/**
 * Composes TradingYouAreNotAllowed packet for client.
 */
public class TradingYouAreNotAllowedComposer extends PacketComposer<TradingYouAreNotAllowedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_YOU_NOT_ALLOWED;
    }

    @Override
    protected void write(PacketBuffer packet, TradingYouAreNotAllowedMessage message) {
        // No fields to write
    }
}
