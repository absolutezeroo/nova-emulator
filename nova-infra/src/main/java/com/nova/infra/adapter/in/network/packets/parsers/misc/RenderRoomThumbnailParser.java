package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RenderRoomThumbnailMessageEvent;

/**
 * Parses RenderRoomThumbnail packet from client.
 */
public class RenderRoomThumbnailParser extends PacketParser<RenderRoomThumbnailMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.RENDER_ROOM_THUMBNAIL;
    }

    @Override
    public RenderRoomThumbnailMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RenderRoomThumbnailMessageEvent();
    }
}
