package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.TalentTrackMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TalentTrack packet for client.
 */
@ComposesPacket(Outgoing.HELPER_TALENT_TRACK)
public class TalentTrackComposer extends PacketComposer<TalentTrackMessage> {
@Override
    protected void write(PacketBuffer packet, TalentTrackMessage message) {
        packet.appendString(message.talentTrackName());
        packet.appendInt(message.level());
        packet.appendInt(message.maxLevel());
    }
}
