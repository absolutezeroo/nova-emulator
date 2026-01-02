package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ElementPointerMessage;

/**
 * Composes ElementPointer packet for client.
 */
public class ElementPointerComposer extends PacketComposer<ElementPointerMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NOTIFICATION_ELEMENT_POINTER;
    }

    @Override
    protected void write(PacketBuffer packet, ElementPointerMessage message) {
        packet.appendString(message.key());
    }
}
