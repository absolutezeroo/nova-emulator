package com.nova.infra.adapter.network.packets.parsers.guide;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.guide.GuideSessionGetRequesterRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GuideSessionGetRequesterRoom packet from client.
 */
@ParsesPacket(Incoming.GUIDE_SESSION_GET_REQUESTER_ROOM)
public class GuideSessionGetRequesterRoomParser extends PacketParser<GuideSessionGetRequesterRoomMessageEvent> {
@Override
    public GuideSessionGetRequesterRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionGetRequesterRoomMessageEvent();
    }
}
