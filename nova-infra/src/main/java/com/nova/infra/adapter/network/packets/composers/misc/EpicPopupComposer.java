package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.EpicPopupMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes EpicPopup packet for client.
 */
@ComposesPacket(Outgoing.EPIC_POPUP)
public class EpicPopupComposer extends PacketComposer<EpicPopupMessage> {
@Override
    protected void write(PacketBuffer packet, EpicPopupMessage message) {
        packet.appendString(message.imageUri());
    }
}
