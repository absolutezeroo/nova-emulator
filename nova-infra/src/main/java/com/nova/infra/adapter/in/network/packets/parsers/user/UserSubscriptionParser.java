package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.UserSubscriptionMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UserSubscription packet from client.
 */
@ParsesPacket(Incoming.USER_SUBSCRIPTION)
public class UserSubscriptionParser extends PacketParser<UserSubscriptionMessageEvent> {
@Override
    public UserSubscriptionMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UserSubscriptionMessageEvent();
    }
}
