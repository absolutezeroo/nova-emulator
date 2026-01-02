package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.AvatarEffectsMessage;

/**
 * Composes AvatarEffects packet for client.
 */
public class AvatarEffectsComposer extends PacketComposer<AvatarEffectsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_EFFECT_LIST;
    }

    @Override
    protected void write(PacketBuffer packet, AvatarEffectsMessage message) {
        // No fields to write
    }
}
