package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CancelMysteryBoxWaitMessage;

/**
 * Composes CancelMysteryBoxWait packet for client.
 */
public class CancelMysteryBoxWaitComposer extends PacketComposer<CancelMysteryBoxWaitMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CANCELMYSTERYBOXWAITMESSAGE;
    }

    @Override
    protected void write(PacketBuffer packet, CancelMysteryBoxWaitMessage message) {
        // No fields to write
    }
}
