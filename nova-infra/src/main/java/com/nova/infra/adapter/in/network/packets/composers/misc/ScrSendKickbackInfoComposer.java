package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ScrSendKickbackInfoMessage;

/**
 * Composes ScrSendKickbackInfo packet for client.
 */
public class ScrSendKickbackInfoComposer extends PacketComposer<ScrSendKickbackInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.SCR_SEND_KICKBACK_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, ScrSendKickbackInfoMessage message) {
        // No fields to write
    }
}
