package com.nova.infra.adapter.network.packets.composers.trading;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.trading.TradingOpenMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingOpen packet for client.
 */
@ComposesPacket(Outgoing.TRADE_OPEN)
public class TradingOpenComposer extends PacketComposer<TradingOpenMessage> {
@Override
    protected void write(PacketBuffer packet, TradingOpenMessage message) {
        packet.appendInt(message.reason());
        packet.appendString(message.otherUserName());
    }
}
