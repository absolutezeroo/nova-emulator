package com.nova.infra.adapter.in.network.packets.parsers.guide;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.guide.GuideSessionGetRequesterRoomMessageEvent;

/**
 * Parses GuideSessionGetRequesterRoom packet from client.
 */
public class GuideSessionGetRequesterRoomParser extends PacketParser<GuideSessionGetRequesterRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GUIDE_SESSION_GET_REQUESTER_ROOM;
    }

    @Override
    public GuideSessionGetRequesterRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GuideSessionGetRequesterRoomMessageEvent();
    }
}
