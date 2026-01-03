package com.nova.infra.adapter.network.packets.composers.talent;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.talent.TalentLevelUpMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TalentLevelUp packet for client.
 */
@ComposesPacket(Outgoing.TALENT_TRACK_LEVEL_UP)
public class TalentLevelUpComposer extends PacketComposer<TalentLevelUpMessage> {
@Override
    protected void write(PacketBuffer packet, TalentLevelUpMessage message) {
        packet.appendString(message.talentTrackName());
        packet.appendInt(message.level());
    }
}
