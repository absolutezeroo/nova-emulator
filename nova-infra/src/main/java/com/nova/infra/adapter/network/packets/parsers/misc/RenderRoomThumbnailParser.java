package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RenderRoomThumbnailMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RenderRoomThumbnail packet from client.
 */
@ParsesPacket(Incoming.RENDER_ROOM_THUMBNAIL)
public class RenderRoomThumbnailParser extends PacketParser<RenderRoomThumbnailMessageEvent> {
@Override
    public RenderRoomThumbnailMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RenderRoomThumbnailMessageEvent();
    }
}
