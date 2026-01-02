package com.nova.infra.adapter.in.network.packets.composers.talent;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.talent.TalentLevelUpMessage;

/**
 * Composes TalentLevelUp packet for client.
 */
public class TalentLevelUpComposer extends PacketComposer<TalentLevelUpMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TALENT_TRACK_LEVEL_UP;
    }

    @Override
    protected void write(PacketBuffer packet, TalentLevelUpMessage message) {
        packet.appendString(message.talentTrackName());
        packet.appendInt(message.level());
    }
}
