package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.UserNameChangeMessage;

/**
 * Composes UserNameChange packet for client.
 */
public class UserNameChangeComposer extends PacketComposer<UserNameChangeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_CHANGE_NAME;
    }

    @Override
    protected void write(PacketBuffer packet, UserNameChangeMessage message) {
        packet.appendInt(message.webId());
        packet.appendInt(message.id());
        packet.appendString(message.newName());
    }
}
