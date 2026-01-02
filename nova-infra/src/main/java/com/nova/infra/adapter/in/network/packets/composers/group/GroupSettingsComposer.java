package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupSettingsMessage;

/**
 * Composes GroupSettings packet for client.
 */
public class GroupSettingsComposer extends PacketComposer<GroupSettingsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_SETTINGS;
    }

    @Override
    protected void write(PacketBuffer packet, GroupSettingsMessage message) {
        packet.appendInt(message.roomId());
        packet.appendString(message.roomName());
    }
}
