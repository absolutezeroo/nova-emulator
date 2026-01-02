package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FriendRequestQuestCompleteMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses FriendRequestQuestComplete packet from client.
 */
@ParsesPacket(Incoming.FRIEND_REQUEST_QUEST_COMPLETE)
public class FriendRequestQuestCompleteParser extends PacketParser<FriendRequestQuestCompleteMessageEvent> {
@Override
    public FriendRequestQuestCompleteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FriendRequestQuestCompleteMessageEvent();
    }
}
