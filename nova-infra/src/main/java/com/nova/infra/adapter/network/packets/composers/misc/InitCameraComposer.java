package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.InitCameraMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes InitCamera packet for client.
 */
@ComposesPacket(Outgoing.INIT_CAMERA)
public class InitCameraComposer extends PacketComposer<InitCameraMessage> {
@Override
    protected void write(PacketBuffer packet, InitCameraMessage message) {
        packet.appendInt(message.creditPrice());
        packet.appendInt(message.ducketPrice());
        packet.appendInt(message.publishDucketPrice());
    }
}
