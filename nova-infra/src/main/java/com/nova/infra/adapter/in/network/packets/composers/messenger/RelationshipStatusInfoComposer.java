package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.RelationshipStatusInfoMessage;

/**
 * Composes RelationshipStatusInfo packet for client.
 */
public class RelationshipStatusInfoComposer extends PacketComposer<RelationshipStatusInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_RELATIONSHIPS;
    }

    @Override
    protected void write(PacketBuffer packet, RelationshipStatusInfoMessage message) {
        packet.appendInt(message.relationshipStatusType());
        packet.appendInt(message.friendCount());
        packet.appendInt(message.randomFriendId());
        packet.appendString(message.randomFriendName());
        packet.appendString(message.randomFriendFigure());
    }
}
