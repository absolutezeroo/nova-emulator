package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.UniqueMachineIDMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes the machine ID response packet for the client.
 */
@ComposesPacket(Outgoing.SECURITY_MACHINE)
public class UniqueMachineIDComposer extends PacketComposer<UniqueMachineIDMessage> {
    @Override
    protected void write(PacketBuffer packet, UniqueMachineIDMessage message) {
        packet.appendString(message.machineId());
    }
}
