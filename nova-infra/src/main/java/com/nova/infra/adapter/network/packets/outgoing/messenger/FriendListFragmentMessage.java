package com.nova.infra.adapter.network.packets.outgoing.messenger;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

import java.util.List;

/**
 * Sends a fragment of the user's friend list to the client.
 * Friends are sent in fragments to handle large friend lists.
 */
public record FriendListFragmentMessage(
    int totalFragments,
    int fragmentNumber,
    List<Friend> friends
) implements OutgoingPacket {

    /**
     * Represents a friend in the list.
     */
    public record Friend(
        int id,
        String username,
        int gender,           // 0 = male, 1 = female
        boolean online,
        boolean inRoom,
        String figure,
        int categoryId,
        String motto,
        String realName,
        boolean persistedMessageUser,
        boolean vipMember,
        boolean pocketHabbo,
        int relationshipStatus  // 0 = none, 1 = heart, 2 = smile, 3 = bobba
    ) {}

    /**
     * Creates an empty friend list (single fragment with no friends).
     */
    public static FriendListFragmentMessage empty() {
        return new FriendListFragmentMessage(1, 0, List.of());
    }
}
