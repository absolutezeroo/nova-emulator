package com.nova.infra.adapter.network.packets.composers.trading;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.trading.TradingAcceptMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingAccept packet for client.
 */
@ComposesPacket(Outgoing.TRADE_ACCEPTED)
public class TradingAcceptComposer extends PacketComposer<TradingAcceptMessage> {
@Override
    protected void write(PacketBuffer packet, TradingAcceptMessage message) {
        packet.appendInt(message.userID());
    }
}
