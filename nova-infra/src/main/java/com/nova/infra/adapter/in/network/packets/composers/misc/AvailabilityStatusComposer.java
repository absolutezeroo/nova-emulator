package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.AvailabilityStatusMessage;

/**
 * Composes AvailabilityStatus packet for client.
 */
public class AvailabilityStatusComposer extends PacketComposer<AvailabilityStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.AVAILABILITY_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, AvailabilityStatusMessage message) {
        packet.appendBoolean(message.isOpen());
        packet.appendBoolean(message.onShutdown());
        packet.appendBoolean(message.isAuthenticUser());
    }
}
