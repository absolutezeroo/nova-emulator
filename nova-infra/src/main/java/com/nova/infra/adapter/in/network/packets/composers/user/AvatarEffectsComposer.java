package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.AvatarEffectsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes AvatarEffects packet for client.
 */
@ComposesPacket(Outgoing.USER_EFFECT_LIST)
public class AvatarEffectsComposer extends PacketComposer<AvatarEffectsMessage> {
@Override
    protected void write(PacketBuffer packet, AvatarEffectsMessage message) {
        // No fields to write
    }
}
