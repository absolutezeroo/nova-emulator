package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.TalentTrackMessage;

/**
 * Composes TalentTrack packet for client.
 */
public class TalentTrackComposer extends PacketComposer<TalentTrackMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HELPER_TALENT_TRACK;
    }

    @Override
    protected void write(PacketBuffer packet, TalentTrackMessage message) {
        packet.appendString(message.talentTrackName());
        packet.appendInt(message.level());
        packet.appendInt(message.maxLevel());
    }
}
