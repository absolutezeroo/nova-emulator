package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.UpdateRoomThumbnailMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateRoomThumbnail packet from client.
 */
@ParsesPacket(Incoming.UPDATE_ROOM_THUMBNAIL)
public class UpdateRoomThumbnailParser extends PacketParser<UpdateRoomThumbnailMessageEvent> {
@Override
    public UpdateRoomThumbnailMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateRoomThumbnailMessageEvent();
    }
}
