package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotForceOpenContextMenuMessage;

/**
 * Composes BotForceOpenContextMenu packet for client.
 */
public class BotForceOpenContextMenuComposer extends PacketComposer<BotForceOpenContextMenuMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BOT_FORCE_OPEN_CONTEXT_MENU;
    }

    @Override
    protected void write(PacketBuffer packet, BotForceOpenContextMenuMessage message) {
        packet.appendInt(message.botId());
    }
}
