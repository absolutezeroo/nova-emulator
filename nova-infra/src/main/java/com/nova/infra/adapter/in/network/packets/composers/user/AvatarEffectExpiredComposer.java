package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.AvatarEffectExpiredMessage;

/**
 * Composes AvatarEffectExpired packet for client.
 */
public class AvatarEffectExpiredComposer extends PacketComposer<AvatarEffectExpiredMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_EFFECT_LIST_REMOVE;
    }

    @Override
    protected void write(PacketBuffer packet, AvatarEffectExpiredMessage message) {
        packet.appendInt(message.type());
    }
}
