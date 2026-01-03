package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.RemainingMuteMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RemainingMute packet for client.
 */
@ComposesPacket(Outgoing.REMAINING_MUTE)
public class RemainingMuteComposer extends PacketComposer<RemainingMuteMessage> {
@Override
    protected void write(PacketBuffer packet, RemainingMuteMessage message) {
        packet.appendInt(message.seconds());
    }
}
