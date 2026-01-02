package com.nova.infra.adapter.in.network.packets.composers.trading;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.trading.TradingListItemMessage;

/**
 * Composes TradingListItem packet for client.
 */
public class TradingListItemComposer extends PacketComposer<TradingListItemMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TRADE_LIST_ITEM;
    }

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
