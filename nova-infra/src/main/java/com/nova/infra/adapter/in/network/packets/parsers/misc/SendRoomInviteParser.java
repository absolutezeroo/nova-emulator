package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.SendRoomInviteMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses SendRoomInvite packet from client.
 */
@ParsesPacket(Incoming.SEND_ROOM_INVITE)
public class SendRoomInviteParser extends PacketParser<SendRoomInviteMessageEvent> {
@Override
    public SendRoomInviteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SendRoomInviteMessageEvent();
    }
}
