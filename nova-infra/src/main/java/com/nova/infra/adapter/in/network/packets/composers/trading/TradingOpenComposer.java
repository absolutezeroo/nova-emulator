package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingOpenMessage;

/**
 * Composes TradingOpen packet for client.
 */
public class TradingOpenComposer extends PacketComposer<TradingOpenMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_OPEN;
    }

    @Override
    protected void write(PacketBuffer packet, TradingOpenMessage message) {
        packet.appendInt(message.reason());
        packet.appendString(message.otherUserName());
    }
}
