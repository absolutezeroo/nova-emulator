package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PublishPhotoMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses PublishPhoto packet from client.
 */
@ParsesPacket(Incoming.PUBLISH_PHOTO)
public class PublishPhotoParser extends PacketParser<PublishPhotoMessageEvent> {
@Override
    public PublishPhotoMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PublishPhotoMessageEvent();
    }
}
