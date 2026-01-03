package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.RelationshipStatusInfoMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RelationshipStatusInfo packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_RELATIONSHIPS)
public class RelationshipStatusInfoComposer extends PacketComposer<RelationshipStatusInfoMessage> {
@Override
    protected void write(PacketBuffer packet, RelationshipStatusInfoMessage message) {
        packet.appendInt(message.relationshipStatusType());
        packet.appendInt(message.friendCount());
        packet.appendInt(message.randomFriendId());
        packet.appendString(message.randomFriendName());
        packet.appendString(message.randomFriendFigure());
    }
}
