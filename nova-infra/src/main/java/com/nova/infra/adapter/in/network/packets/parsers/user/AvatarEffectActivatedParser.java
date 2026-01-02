package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.AvatarEffectActivatedMessageEvent;

/**
 * Parses AvatarEffectActivated packet from client.
 */
public class AvatarEffectActivatedParser extends PacketParser<AvatarEffectActivatedMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_EFFECT_ACTIVATE;
    }

    @Override
    public AvatarEffectActivatedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AvatarEffectActivatedMessageEvent();
    }
}
