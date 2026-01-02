package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingOpenFailedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingOpenFailed packet for client.
 */
@ComposesPacket(Outgoing.TRADE_OPEN_FAILED)
public class TradingOpenFailedComposer extends PacketComposer<TradingOpenFailedMessage> {
@Override
    protected void write(PacketBuffer packet, TradingOpenFailedMessage message) {
        packet.appendInt(message.reason());
        packet.appendString(message.otherUserName());
    }
}
