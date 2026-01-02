package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.EpicPopupMessage;

/**
 * Composes EpicPopup packet for client.
 */
public class EpicPopupComposer extends PacketComposer<EpicPopupMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.EPIC_POPUP;
    }

    @Override
    protected void write(PacketBuffer packet, EpicPopupMessage message) {
        packet.appendString(message.imageUri());
    }
}
