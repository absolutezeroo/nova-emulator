package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserPermissionsMessage;

/**
 * Composes UserPermissions packet for client.
 */
public class UserPermissionsComposer extends PacketComposer<UserPermissionsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_PERMISSIONS;
    }

    @Override
    protected void write(PacketBuffer packet, UserPermissionsMessage message) {
        packet.appendInt(message.clubLevel());
        packet.appendInt(message.securityLevel());
        packet.appendBoolean(message.isAmbassador());
    }
}
