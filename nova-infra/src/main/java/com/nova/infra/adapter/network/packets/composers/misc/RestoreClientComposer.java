package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.RestoreClientMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RestoreClient packet for client.
 */
@ComposesPacket(Outgoing.RESTORE_CLIENT)
public class RestoreClientComposer extends PacketComposer<RestoreClientMessage> {
@Override
    protected void write(PacketBuffer packet, RestoreClientMessage message) {
        // No fields to write
    }
}
