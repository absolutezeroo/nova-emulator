package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.AvatarEffectActivatedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes AvatarEffectActivated packet for client.
 */
@ComposesPacket(Outgoing.USER_EFFECT_ACTIVATE)
public class AvatarEffectActivatedComposer extends PacketComposer<AvatarEffectActivatedMessage> {
@Override
    protected void write(PacketBuffer packet, AvatarEffectActivatedMessage message) {
        packet.appendInt(message.type());
        packet.appendInt(message.duration());
        packet.appendBoolean(message.isPermanent());
    }
}
