package com.nova.infra.adapter.network.packets.parsers.user;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.user.AvatarEffectActivatedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses AvatarEffectActivated packet from client.
 */
@ParsesPacket(Incoming.USER_EFFECT_ACTIVATE)
public class AvatarEffectActivatedParser extends PacketParser<AvatarEffectActivatedMessageEvent> {
@Override
    public AvatarEffectActivatedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AvatarEffectActivatedMessageEvent();
    }
}
