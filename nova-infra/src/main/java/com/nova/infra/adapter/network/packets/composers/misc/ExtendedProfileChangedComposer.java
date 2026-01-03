package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ExtendedProfileChangedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ExtendedProfileChanged packet for client.
 */
@ComposesPacket(Outgoing.EXTENDED_PROFILE_CHANGED)
public class ExtendedProfileChangedComposer extends PacketComposer<ExtendedProfileChangedMessage> {
@Override
    protected void write(PacketBuffer packet, ExtendedProfileChangedMessage message) {
        packet.appendInt(message.userId());
    }
}
