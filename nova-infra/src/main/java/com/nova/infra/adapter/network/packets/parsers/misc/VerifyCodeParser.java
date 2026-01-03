package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.VerifyCodeMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses VerifyCode packet from client.
 */
@ParsesPacket(Incoming.VERIFY_CODE)
public class VerifyCodeParser extends PacketParser<VerifyCodeMessageEvent> {
@Override
    public VerifyCodeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new VerifyCodeMessageEvent();
    }
}
