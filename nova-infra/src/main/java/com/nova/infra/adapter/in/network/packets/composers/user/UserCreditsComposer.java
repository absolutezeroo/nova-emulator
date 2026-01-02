package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserCreditsMessage;

/**
 * Composes UserCredits packet for client.
 */
public class UserCreditsComposer extends PacketComposer<UserCreditsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_CREDITS;
    }

    @Override
    protected void write(PacketBuffer packet, UserCreditsMessage message) {
        packet.appendString(message.credits());
    }
}
