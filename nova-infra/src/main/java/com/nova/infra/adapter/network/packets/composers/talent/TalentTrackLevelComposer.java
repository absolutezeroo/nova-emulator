package com.nova.infra.adapter.network.packets.composers.talent;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.talent.TalentTrackLevelMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TalentTrackLevel packet for client.
 */
@ComposesPacket(Outgoing.TALENT_TRACK_LEVEL)
public class TalentTrackLevelComposer extends PacketComposer<TalentTrackLevelMessage> {
@Override
    protected void write(PacketBuffer packet, TalentTrackLevelMessage message) {
        packet.appendString(message.talentTrackName());
        packet.appendInt(message.level());
        packet.appendInt(message.maxLevel());
    }
}
