package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RestoreClientMessage;

/**
 * Composes RestoreClient packet for client.
 */
public class RestoreClientComposer extends PacketComposer<RestoreClientMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.RESTORE_CLIENT;
    }

    @Override
    protected void write(PacketBuffer packet, RestoreClientMessage message) {
        // No fields to write
    }
}
