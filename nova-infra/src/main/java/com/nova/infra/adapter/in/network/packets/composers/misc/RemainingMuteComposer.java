package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RemainingMuteMessage;

/**
 * Composes RemainingMute packet for client.
 */
public class RemainingMuteComposer extends PacketComposer<RemainingMuteMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.REMAINING_MUTE;
    }

    @Override
    protected void write(PacketBuffer packet, RemainingMuteMessage message) {
        packet.appendInt(message.seconds());
    }
}
