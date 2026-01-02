package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ElementPointerMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ElementPointer packet for client.
 */
@ComposesPacket(Outgoing.NOTIFICATION_ELEMENT_POINTER)
public class ElementPointerComposer extends PacketComposer<ElementPointerMessage> {
@Override
    protected void write(PacketBuffer packet, ElementPointerMessage message) {
        packet.appendString(message.key());
    }
}
