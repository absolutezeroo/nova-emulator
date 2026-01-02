package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ScrSendKickbackInfoMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ScrSendKickbackInfo packet for client.
 */
@ComposesPacket(Outgoing.SCR_SEND_KICKBACK_INFO)
public class ScrSendKickbackInfoComposer extends PacketComposer<ScrSendKickbackInfoMessage> {
@Override
    protected void write(PacketBuffer packet, ScrSendKickbackInfoMessage message) {
        // No fields to write
    }
}
