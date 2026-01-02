package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.VerifyCodeMessageEvent;

/**
 * Parses VerifyCode packet from client.
 */
public class VerifyCodeParser extends PacketParser<VerifyCodeMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.VERIFY_CODE;
    }

    @Override
    public VerifyCodeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new VerifyCodeMessageEvent();
    }
}
