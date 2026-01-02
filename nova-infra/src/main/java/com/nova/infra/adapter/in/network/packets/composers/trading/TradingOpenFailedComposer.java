package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingOpenFailedMessage;

/**
 * Composes TradingOpenFailed packet for client.
 */
public class TradingOpenFailedComposer extends PacketComposer<TradingOpenFailedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_OPEN_FAILED;
    }

    @Override
    protected void write(PacketBuffer packet, TradingOpenFailedMessage message) {
        packet.appendInt(message.reason());
        packet.appendString(message.otherUserName());
    }
}
