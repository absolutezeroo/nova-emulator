package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.UserPermissionsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UserPermissions packet for client.
 */
@ComposesPacket(Outgoing.USER_PERMISSIONS)
public class UserPermissionsComposer extends PacketComposer<UserPermissionsMessage> {
@Override
    protected void write(PacketBuffer packet, UserPermissionsMessage message) {
        packet.appendInt(message.clubLevel());
        packet.appendInt(message.securityLevel());
        packet.appendBoolean(message.isAmbassador());
    }
}
