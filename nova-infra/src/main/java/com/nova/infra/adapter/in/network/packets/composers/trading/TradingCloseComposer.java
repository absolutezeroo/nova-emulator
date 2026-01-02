package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingCloseMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingClose packet for client.
 */
@ComposesPacket(Outgoing.TRADE_CLOSED)
public class TradingCloseComposer extends PacketComposer<TradingCloseMessage> {
@Override
    protected void write(PacketBuffer packet, TradingCloseMessage message) {
        packet.appendInt(message.userId());
        packet.appendInt(message.reason());
    }
}
