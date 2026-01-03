package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.AvatarEffectSelectedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes AvatarEffectSelected packet for client.
 */
@ComposesPacket(Outgoing.AVATAR_EFFECT_SELECTED)
public class AvatarEffectSelectedComposer extends PacketComposer<AvatarEffectSelectedMessage> {
@Override
    protected void write(PacketBuffer packet, AvatarEffectSelectedMessage message) {
        packet.appendInt(message.type());
    }
}
