package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.PresentOpenedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PresentOpened packet for client.
 */
@ComposesPacket(Outgoing.GIFT_OPENED)
public class PresentOpenedComposer extends PacketComposer<PresentOpenedMessage> {
@Override
    protected void write(PacketBuffer packet, PresentOpenedMessage message) {
        packet.appendString(message.itemType());
        packet.appendInt(message.classId());
        packet.appendString(message.productCode());
        packet.appendInt(message.placedItemId());
        packet.appendString(message.placedItemType());
        packet.appendBoolean(message.placedInRoom());
        packet.appendString(message.petFigureString());
    }
}
