package com.nova.infra.adapter.network.packets.composers.messenger;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.messenger.FriendListFragmentMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes the friend list fragment packet.
 */
@ComposesPacket(Outgoing.MESSENGER_FRIENDS)
public class FriendListFragmentComposer extends PacketComposer<FriendListFragmentMessage> {

    @Override
    protected void write(PacketBuffer packet, FriendListFragmentMessage message) {
        packet.appendInt(message.totalFragments());
        packet.appendInt(message.fragmentNumber());
        packet.appendInt(message.friends().size());

        for (FriendListFragmentMessage.Friend friend : message.friends()) {
            packet.appendInt(friend.id());
            packet.appendString(friend.username());
            packet.appendInt(friend.gender());
            packet.appendBoolean(friend.online());
            packet.appendBoolean(friend.inRoom());
            packet.appendString(friend.figure());
            packet.appendInt(friend.categoryId());
            packet.appendString(friend.motto());
            packet.appendString(friend.realName());
            packet.appendString("");  // Facebook ID (unused)
            packet.appendBoolean(friend.persistedMessageUser());
            packet.appendBoolean(friend.vipMember());
            packet.appendBoolean(friend.pocketHabbo());
            packet.appendShort((short) friend.relationshipStatus());
        }
    }
}
