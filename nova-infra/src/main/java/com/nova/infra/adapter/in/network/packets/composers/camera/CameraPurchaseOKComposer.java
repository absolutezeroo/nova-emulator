package com.nova.infra.adapter.in.network.packets.composers.camera;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.camera.CameraPurchaseOKMessage;

/**
 * Composes CameraPurchaseOK packet for client.
 */
public class CameraPurchaseOKComposer extends PacketComposer<CameraPurchaseOKMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CAMERA_PURCHASE_OK;
    }

    @Override
    protected void write(PacketBuffer packet, CameraPurchaseOKMessage message) {
        // No fields to write
    }
}
