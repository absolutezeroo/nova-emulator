package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingAcceptMessage;

/**
 * Composes TradingAccept packet for client.
 */
public class TradingAcceptComposer extends PacketComposer<TradingAcceptMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_ACCEPTED;
    }

    @Override
    protected void write(PacketBuffer packet, TradingAcceptMessage message) {
        packet.appendInt(message.userID());
    }
}
