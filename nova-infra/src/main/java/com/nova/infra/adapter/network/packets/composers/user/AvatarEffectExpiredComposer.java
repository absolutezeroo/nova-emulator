package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.AvatarEffectExpiredMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes AvatarEffectExpired packet for client.
 */
@ComposesPacket(Outgoing.USER_EFFECT_LIST_REMOVE)
public class AvatarEffectExpiredComposer extends PacketComposer<AvatarEffectExpiredMessage> {
@Override
    protected void write(PacketBuffer packet, AvatarEffectExpiredMessage message) {
        packet.appendInt(message.type());
    }
}
