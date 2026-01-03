package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.UserNameChangeMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UserNameChange packet for client.
 */
@ComposesPacket(Outgoing.UNIT_CHANGE_NAME)
public class UserNameChangeComposer extends PacketComposer<UserNameChangeMessage> {
@Override
    protected void write(PacketBuffer packet, UserNameChangeMessage message) {
        packet.appendInt(message.webId());
        packet.appendInt(message.id());
        packet.appendString(message.newName());
    }
}
