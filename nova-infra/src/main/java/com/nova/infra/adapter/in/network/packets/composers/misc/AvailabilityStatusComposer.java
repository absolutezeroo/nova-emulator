package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.AvailabilityStatusMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes AvailabilityStatus packet for client.
 */
@ComposesPacket(Outgoing.AVAILABILITY_STATUS)
public class AvailabilityStatusComposer extends PacketComposer<AvailabilityStatusMessage> {
@Override
    protected void write(PacketBuffer packet, AvailabilityStatusMessage message) {
        packet.appendBoolean(message.isOpen());
        packet.appendBoolean(message.onShutdown());
        packet.appendBoolean(message.isAuthenticUser());
    }
}
