package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.FriendFurniConfirmLockMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses FriendFurniConfirmLock packet from client.
 */
@ParsesPacket(Incoming.FRIEND_FURNI_CONFIRM_LOCK)
public class FriendFurniConfirmLockParser extends PacketParser<FriendFurniConfirmLockMessageEvent> {
@Override
    public FriendFurniConfirmLockMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new FriendFurniConfirmLockMessageEvent();
    }
}
