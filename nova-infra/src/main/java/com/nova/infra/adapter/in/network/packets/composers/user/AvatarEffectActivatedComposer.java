package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.AvatarEffectActivatedMessage;

/**
 * Composes AvatarEffectActivated packet for client.
 */
public class AvatarEffectActivatedComposer extends PacketComposer<AvatarEffectActivatedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_EFFECT_ACTIVATE;
    }

    @Override
    protected void write(PacketBuffer packet, AvatarEffectActivatedMessage message) {
        packet.appendInt(message.type());
        packet.appendInt(message.duration());
        packet.appendBoolean(message.isPermanent());
    }
}
