package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserCurrentBadgesMessage;

/**
 * Composes UserCurrentBadges packet for client.
 */
public class UserCurrentBadgesComposer extends PacketComposer<UserCurrentBadgesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_BADGES_CURRENT;
    }

    @Override
    protected void write(PacketBuffer packet, UserCurrentBadgesMessage message) {
        packet.appendInt(message.userId());
    }
}
