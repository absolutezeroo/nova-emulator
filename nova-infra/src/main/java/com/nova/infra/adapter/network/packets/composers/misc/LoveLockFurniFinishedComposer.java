package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.LoveLockFurniFinishedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes LoveLockFurniFinished packet for client.
 */
@ComposesPacket(Outgoing.LOVELOCK_FURNI_FINISHED)
public class LoveLockFurniFinishedComposer extends PacketComposer<LoveLockFurniFinishedMessage> {
@Override
    protected void write(PacketBuffer packet, LoveLockFurniFinishedMessage message) {
        // No fields to write
    }
}
