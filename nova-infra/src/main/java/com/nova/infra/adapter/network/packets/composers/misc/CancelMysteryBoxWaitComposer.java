package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.CancelMysteryBoxWaitMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
