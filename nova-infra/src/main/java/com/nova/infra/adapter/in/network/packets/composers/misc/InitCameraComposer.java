package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.InitCameraMessage;

/**
 * Composes InitCamera packet for client.
 */
public class InitCameraComposer extends PacketComposer<InitCameraMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.INIT_CAMERA;
    }

    @Override
    protected void write(PacketBuffer packet, InitCameraMessage message) {
        packet.appendInt(message.creditPrice());
        packet.appendInt(message.ducketPrice());
        packet.appendInt(message.publishDucketPrice());
    }
}
