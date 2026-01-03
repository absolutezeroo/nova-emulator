package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.AvatarEffectSelectedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses AvatarEffectSelected packet from client.
 */
@ParsesPacket(Incoming.USER_EFFECT_ENABLE)
public class AvatarEffectSelectedParser extends PacketParser<AvatarEffectSelectedMessageEvent> {
@Override
    public AvatarEffectSelectedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AvatarEffectSelectedMessageEvent();
    }
}
