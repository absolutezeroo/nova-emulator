package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.OpenPetPackageRequestedMessage;

/**
 * Composes OpenPetPackageRequested packet for client.
 */
public class OpenPetPackageRequestedComposer extends PacketComposer<OpenPetPackageRequestedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PET_OPEN_PACKAGE_REQUESTED;
    }

    @Override
    protected void write(PacketBuffer packet, OpenPetPackageRequestedMessage message) {
        // No fields to write
    }
}
