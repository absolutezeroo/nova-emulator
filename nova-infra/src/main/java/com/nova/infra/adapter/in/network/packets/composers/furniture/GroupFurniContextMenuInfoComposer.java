package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.GroupFurniContextMenuInfoMessage;

/**
 * Composes GroupFurniContextMenuInfo packet for client.
 */
public class GroupFurniContextMenuInfoComposer extends PacketComposer<GroupFurniContextMenuInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_GROUP_CONTEXT_MENU_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, GroupFurniContextMenuInfoMessage message) {
        packet.appendInt(message.objectId());
        packet.appendInt(message.guildId());
        packet.appendString(message.guildName());
        packet.appendInt(message.guildHomeRoomId());
        packet.appendBoolean(message.userIsMember());
        packet.appendBoolean(message.guildHasReadableForum());
    }
}
