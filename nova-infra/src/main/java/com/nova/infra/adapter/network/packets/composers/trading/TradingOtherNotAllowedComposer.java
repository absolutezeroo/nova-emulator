package com.nova.infra.adapter.network.packets.composers.trading;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.trading.TradingOtherNotAllowedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingOtherNotAllowed packet for client.
 */
@ComposesPacket(Outgoing.TRADE_OTHER_NOT_ALLOWED)
public class TradingOtherNotAllowedComposer extends PacketComposer<TradingOtherNotAllowedMessage> {
@Override
    protected void write(PacketBuffer packet, TradingOtherNotAllowedMessage message) {
        // No fields to write
    }
}
