package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingCloseMessage;

/**
 * Composes TradingClose packet for client.
 */
public class TradingCloseComposer extends PacketComposer<TradingCloseMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_CLOSED;
    }

    @Override
    protected void write(PacketBuffer packet, TradingCloseMessage message) {
        packet.appendInt(message.userId());
        packet.appendInt(message.reason());
    }
}
