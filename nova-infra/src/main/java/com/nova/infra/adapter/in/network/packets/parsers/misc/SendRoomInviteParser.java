package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SendRoomInviteMessageEvent;

/**
 * Parses SendRoomInvite packet from client.
 */
public class SendRoomInviteParser extends PacketParser<SendRoomInviteMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.SEND_ROOM_INVITE;
    }

    @Override
    public SendRoomInviteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SendRoomInviteMessageEvent();
    }
}
