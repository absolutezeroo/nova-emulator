package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.GroupFurniContextMenuInfoMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GroupFurniContextMenuInfo packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_GROUP_CONTEXT_MENU_INFO)
public class GroupFurniContextMenuInfoComposer extends PacketComposer<GroupFurniContextMenuInfoMessage> {
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
