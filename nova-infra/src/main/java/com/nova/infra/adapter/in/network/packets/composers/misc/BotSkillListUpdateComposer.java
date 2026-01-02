package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BotSkillListUpdateMessage;

/**
 * Composes BotSkillListUpdate packet for client.
 */
public class BotSkillListUpdateComposer extends PacketComposer<BotSkillListUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BOT_SKILL_LIST_UPDATE;
    }

    @Override
    protected void write(PacketBuffer packet, BotSkillListUpdateMessage message) {
        packet.appendInt(message.botId());
    }
}
