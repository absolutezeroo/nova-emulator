package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.ModTradingLockMessageEvent;

/**
 * Parses ModTradingLock packet from client.
 */
public class ModTradingLockParser extends PacketParser<ModTradingLockMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_SANCTION_TRADELOCK;
    }

    @Override
    public ModTradingLockMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModTradingLockMessageEvent();
    }
}
