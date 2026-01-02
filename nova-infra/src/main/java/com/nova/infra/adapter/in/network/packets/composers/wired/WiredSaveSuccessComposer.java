package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredSaveSuccessMessage;

/**
 * Composes WiredSaveSuccess packet for client.
 */
public class WiredSaveSuccessComposer extends PacketComposer<WiredSaveSuccessMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WIRED_SAVE;
    }

    @Override
    protected void write(PacketBuffer packet, WiredSaveSuccessMessage message) {
        // No fields to write
    }
}
