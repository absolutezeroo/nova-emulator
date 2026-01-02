package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CancelMysteryBoxWaitMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CancelMysteryBoxWait packet for client.
 */
@ComposesPacket(Outgoing.CANCELMYSTERYBOXWAITMESSAGE)
public class CancelMysteryBoxWaitComposer extends PacketComposer<CancelMysteryBoxWaitMessage> {
@Override
    protected void write(PacketBuffer packet, CancelMysteryBoxWaitMessage message) {
        // No fields to write
    }
}
