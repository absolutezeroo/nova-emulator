package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.AvatarEffectSelectedMessage;

/**
 * Composes AvatarEffectSelected packet for client.
 */
public class AvatarEffectSelectedComposer extends PacketComposer<AvatarEffectSelectedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.AVATAR_EFFECT_SELECTED;
    }

    @Override
    protected void write(PacketBuffer packet, AvatarEffectSelectedMessage message) {
        packet.appendInt(message.type());
    }
}
