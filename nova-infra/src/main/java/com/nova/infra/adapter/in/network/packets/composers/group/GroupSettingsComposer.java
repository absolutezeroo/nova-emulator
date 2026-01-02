package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupSettingsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GroupSettings packet for client.
 */
@ComposesPacket(Outgoing.GROUP_SETTINGS)
public class GroupSettingsComposer extends PacketComposer<GroupSettingsMessage> {
@Override
    protected void write(PacketBuffer packet, GroupSettingsMessage message) {
        packet.appendInt(message.roomId());
        packet.appendString(message.roomName());
    }
}
