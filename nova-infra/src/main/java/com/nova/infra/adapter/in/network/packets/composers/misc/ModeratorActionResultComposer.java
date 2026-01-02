package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ModeratorActionResultMessage;

/**
 * Composes ModeratorActionResult packet for client.
 */
public class ModeratorActionResultComposer extends PacketComposer<ModeratorActionResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MODERATOR_ACTION_RESULT;
    }

    @Override
    protected void write(PacketBuffer packet, ModeratorActionResultMessage message) {
        packet.appendInt(message.userId());
        packet.appendBoolean(message.success());
    }
}
