package com.nova.infra.adapter.network.packets.composers.moderation;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.moderation.UserChatlogMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UserChatlog packet for client.
 */
@ComposesPacket(Outgoing.MODTOOL_USER_CHATLOG)
public class UserChatlogComposer extends PacketComposer<UserChatlogMessage> {
@Override
    protected void write(PacketBuffer packet, UserChatlogMessage message) {
        // No fields to write
    }
}
