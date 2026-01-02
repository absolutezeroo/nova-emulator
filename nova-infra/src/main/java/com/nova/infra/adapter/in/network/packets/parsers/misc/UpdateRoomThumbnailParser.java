package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UpdateRoomThumbnailMessageEvent;

/**
 * Parses UpdateRoomThumbnail packet from client.
 */
public class UpdateRoomThumbnailParser extends PacketParser<UpdateRoomThumbnailMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.UPDATE_ROOM_THUMBNAIL;
    }

    @Override
    public UpdateRoomThumbnailMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateRoomThumbnailMessageEvent();
    }
}
