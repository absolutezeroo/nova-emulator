package com.nova.infra.adapter.in.network.packets.composers.camera;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.camera.CameraSnapshotMessage;

/**
 * Composes CameraSnapshot packet for client.
 */
public class CameraSnapshotComposer extends PacketComposer<CameraSnapshotMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CAMERA_SNAPSHOT;
    }

    @Override
    protected void write(PacketBuffer packet, CameraSnapshotMessage message) {
        packet.appendString(message.roomType());
        packet.appendInt(message.roomId());
    }
}
