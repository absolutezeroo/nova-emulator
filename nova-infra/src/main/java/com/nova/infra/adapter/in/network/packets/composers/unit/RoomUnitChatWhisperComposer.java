package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitChatWhisperMessage;

/**
 * Composes RoomUnitChatWhisper packet for client.
 */
public class RoomUnitChatWhisperComposer extends PacketComposer<RoomUnitChatWhisperMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_CHAT_WHISPER;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitChatWhisperMessage message) {
        // No fields to write
    }
}
