package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ExtendedProfileChangedMessage;

/**
 * Composes ExtendedProfileChanged packet for client.
 */
public class ExtendedProfileChangedComposer extends PacketComposer<ExtendedProfileChangedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.EXTENDED_PROFILE_CHANGED;
    }

    @Override
    protected void write(PacketBuffer packet, ExtendedProfileChangedMessage message) {
        packet.appendInt(message.userId());
    }
}
