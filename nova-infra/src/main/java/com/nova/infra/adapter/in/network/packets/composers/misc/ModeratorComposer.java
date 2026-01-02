package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ModeratorMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Moderator packet for client.
 */
@ComposesPacket(Outgoing.MODERATOR_MESSAGE)
public class ModeratorComposer extends PacketComposer<ModeratorMessage> {
@Override
    protected void write(PacketBuffer packet, ModeratorMessage message) {
        packet.appendInt(message.userId());
        packet.appendBoolean(message.success());
    }
}
