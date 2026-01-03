package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.RequestCameraConfigurationMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RequestCameraConfiguration packet from client.
 */
@ParsesPacket(Incoming.REQUEST_CAMERA_CONFIGURATION)
public class RequestCameraConfigurationParser extends PacketParser<RequestCameraConfigurationMessageEvent> {
@Override
    public RequestCameraConfigurationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestCameraConfigurationMessageEvent();
    }
}
