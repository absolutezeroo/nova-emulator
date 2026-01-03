package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ShowMysteryBoxWaitMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
