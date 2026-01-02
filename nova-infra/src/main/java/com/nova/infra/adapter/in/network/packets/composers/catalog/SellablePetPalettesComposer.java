package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.SellablePetPalettesMessage;

/**
 * Composes SellablePetPalettes packet for client.
 */
public class SellablePetPalettesComposer extends PacketComposer<SellablePetPalettesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_RECEIVE_PET_BREEDS;
    }

    @Override
    protected void write(PacketBuffer packet, SellablePetPalettesMessage message) {
        packet.appendString(message.productCode());
    }
}
