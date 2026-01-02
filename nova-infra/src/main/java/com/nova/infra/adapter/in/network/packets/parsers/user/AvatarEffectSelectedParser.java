package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.AvatarEffectSelectedMessageEvent;

/**
 * Parses AvatarEffectSelected packet from client.
 */
public class AvatarEffectSelectedParser extends PacketParser<AvatarEffectSelectedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_EFFECT_ENABLE;
    }

    @Override
    public AvatarEffectSelectedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AvatarEffectSelectedMessageEvent();
    }
}
