package com.nova.infra.adapter.network.packets.parsers.moderation;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.moderation.ModTradingLockMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses ModTradingLock packet from client.
 */
@ParsesPacket(Incoming.MODTOOL_SANCTION_TRADELOCK)
public class ModTradingLockParser extends PacketParser<ModTradingLockMessageEvent> {
@Override
    public ModTradingLockMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ModTradingLockMessageEvent();
    }
}
