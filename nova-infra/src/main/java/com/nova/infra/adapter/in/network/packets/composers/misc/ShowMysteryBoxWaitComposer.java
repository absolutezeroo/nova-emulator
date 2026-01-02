package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ShowMysteryBoxWaitMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ShowMysteryBoxWait packet for client.
 */
@ComposesPacket(Outgoing.SHOWMYSTERYBOXWAITMESSAGE)
public class ShowMysteryBoxWaitComposer extends PacketComposer<ShowMysteryBoxWaitMessage> {
@Override
    protected void write(PacketBuffer packet, ShowMysteryBoxWaitMessage message) {
        // No fields to write
    }
}
