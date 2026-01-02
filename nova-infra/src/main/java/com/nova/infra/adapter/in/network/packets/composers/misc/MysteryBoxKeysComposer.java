package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.MysteryBoxKeysMessage;

/**
 * Composes MysteryBoxKeys packet for client.
 */
public class MysteryBoxKeysComposer extends PacketComposer<MysteryBoxKeysMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MYSTERY_BOX_KEYS;
    }

    @Override
    protected void write(PacketBuffer packet, MysteryBoxKeysMessage message) {
        packet.appendString(message.boxColor());
        packet.appendString(message.keyColor());
    }
}
