package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.UserPermissionsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

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
