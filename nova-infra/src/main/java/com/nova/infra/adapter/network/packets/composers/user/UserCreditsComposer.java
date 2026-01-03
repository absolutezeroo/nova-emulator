package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.UserCreditsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UserCredits packet for client.
 */
@ComposesPacket(Outgoing.USER_CREDITS)
public class UserCreditsComposer extends PacketComposer<UserCreditsMessage> {
@Override
    protected void write(PacketBuffer packet, UserCreditsMessage message) {
        packet.appendString(message.credits());
    }
}
