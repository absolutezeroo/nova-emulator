package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.FriendFurniConfirmLockMessageEvent;

/**
 * Parses FriendFurniConfirmLock packet from client.
 */
public class FriendFurniConfirmLockParser extends PacketParser<FriendFurniConfirmLockMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.FRIEND_FURNI_CONFIRM_LOCK;
    }

    @Override
    public FriendFurniConfirmLockMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FriendFurniConfirmLockMessageEvent();
    }
}
