package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.RequestCameraConfigurationMessageEvent;

/**
 * Parses RequestCameraConfiguration packet from client.
 */
public class RequestCameraConfigurationParser extends PacketParser<RequestCameraConfigurationMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.REQUEST_CAMERA_CONFIGURATION;
    }

    @Override
    public RequestCameraConfigurationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RequestCameraConfigurationMessageEvent();
    }
}
