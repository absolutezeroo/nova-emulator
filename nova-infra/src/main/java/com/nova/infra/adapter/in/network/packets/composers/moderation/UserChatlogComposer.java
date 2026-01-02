package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.UserChatlogMessage;

/**
 * Composes UserChatlog packet for client.
 */
public class UserChatlogComposer extends PacketComposer<UserChatlogMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MODTOOL_USER_CHATLOG;
    }

    @Override
    protected void write(PacketBuffer packet, UserChatlogMessage message) {
        // No fields to write
    }
}
