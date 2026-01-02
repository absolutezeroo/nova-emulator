package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FriendRequestQuestCompleteMessageEvent;

/**
 * Parses FriendRequestQuestComplete packet from client.
 */
public class FriendRequestQuestCompleteParser extends PacketParser<FriendRequestQuestCompleteMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FRIEND_REQUEST_QUEST_COMPLETE;
    }

    @Override
    public FriendRequestQuestCompleteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FriendRequestQuestCompleteMessageEvent();
    }
}
