package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.AvatarEffectsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes the user's effect inventory packet.
 */
@ComposesPacket(Outgoing.USER_EFFECT_LIST)
public class AvatarEffectsComposer extends PacketComposer<AvatarEffectsMessage> {

    @Override
    protected void write(PacketBuffer packet, AvatarEffectsMessage message) {
        packet.appendInt(message.effects().size());

        for (AvatarEffectsMessage.Effect effect : message.effects()) {
            packet.appendInt(effect.effectId());
            packet.appendInt(effect.subType());
            packet.appendInt(effect.duration());
            packet.appendInt(effect.quantity());
            packet.appendInt(effect.secondsRemaining());
            packet.appendBoolean(effect.isPermanent());
        }
    }
}
