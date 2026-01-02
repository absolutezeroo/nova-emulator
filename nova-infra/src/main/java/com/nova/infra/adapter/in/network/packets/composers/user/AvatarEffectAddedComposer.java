package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.AvatarEffectAddedMessage;

/**
 * Composes AvatarEffectAdded packet for client.
 */
public class AvatarEffectAddedComposer extends PacketComposer<AvatarEffectAddedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_EFFECT_LIST_ADD;
    }

    @Override
    protected void write(PacketBuffer packet, AvatarEffectAddedMessage message) {
        packet.appendInt(message.type());
        packet.appendInt(message.subType());
        packet.appendInt(message.duration());
        packet.appendBoolean(message.permanent());
    }
}
