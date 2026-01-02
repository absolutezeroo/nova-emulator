package com.nova.infra.adapter.in.network.packets.composers.talent;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.talent.TalentTrackLevelMessage;

/**
 * Composes TalentTrackLevel packet for client.
 */
public class TalentTrackLevelComposer extends PacketComposer<TalentTrackLevelMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TALENT_TRACK_LEVEL;
    }

    @Override
    protected void write(PacketBuffer packet, TalentTrackLevelMessage message) {
        packet.appendString(message.talentTrackName());
        packet.appendInt(message.level());
        packet.appendInt(message.maxLevel());
    }
}
