package com.nova.infra.adapter.network.packets.composers.pet;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.pet.OpenPetPackageRequestedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes OpenPetPackageRequested packet for client.
 */
@ComposesPacket(Outgoing.PET_OPEN_PACKAGE_REQUESTED)
public class OpenPetPackageRequestedComposer extends PacketComposer<OpenPetPackageRequestedMessage> {
@Override
    protected void write(PacketBuffer packet, OpenPetPackageRequestedMessage message) {
        // No fields to write
    }
}
