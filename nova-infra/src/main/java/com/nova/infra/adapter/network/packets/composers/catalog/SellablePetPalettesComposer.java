package com.nova.infra.adapter.network.packets.composers.catalog;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.catalog.SellablePetPalettesMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes SellablePetPalettes packet for client.
 */
@ComposesPacket(Outgoing.CATALOG_RECEIVE_PET_BREEDS)
public class SellablePetPalettesComposer extends PacketComposer<SellablePetPalettesMessage> {
@Override
    protected void write(PacketBuffer packet, SellablePetPalettesMessage message) {
        packet.appendString(message.productCode());
    }
}
