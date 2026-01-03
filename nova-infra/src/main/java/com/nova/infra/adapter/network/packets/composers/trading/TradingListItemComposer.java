package com.nova.infra.adapter.network.packets.composers.trading;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.trading.TradingListItemMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TradingListItem packet for client.
 */
@ComposesPacket(Outgoing.TRADE_LIST_ITEM)
public class TradingListItemComposer extends PacketComposer<TradingListItemMessage> {
@Override
    protected void write(PacketBuffer packet, TradingListItemMessage message) {
        packet.appendInt(message.firstUserID());
        packet.appendInt(message.firstUserNumItems());
        packet.appendInt(message.firstUserNumCredits());
        packet.appendInt(message.secondUserID());
        packet.appendInt(message.secondUserNumItems());
        packet.appendInt(message.secondUserNumCredits());
    }
}
