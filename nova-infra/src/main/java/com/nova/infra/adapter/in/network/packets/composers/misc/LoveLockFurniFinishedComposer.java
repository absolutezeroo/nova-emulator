package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LoveLockFurniFinishedMessage;

/**
 * Composes LoveLockFurniFinished packet for client.
 */
public class LoveLockFurniFinishedComposer extends PacketComposer<LoveLockFurniFinishedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.LOVELOCK_FURNI_FINISHED;
    }

    @Override
    protected void write(PacketBuffer packet, LoveLockFurniFinishedMessage message) {
        // No fields to write
    }
}
