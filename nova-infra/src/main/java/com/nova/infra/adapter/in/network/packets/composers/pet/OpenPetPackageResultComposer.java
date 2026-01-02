package com.nova.infra.adapter.in.network.packets.composers.pet;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.pet.OpenPetPackageResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes OpenPetPackageResult packet for client.
 */
@ComposesPacket(Outgoing.PET_OPEN_PACKAGE_RESULT)
public class OpenPetPackageResultComposer extends PacketComposer<OpenPetPackageResultMessage> {
@Override
    protected void write(PacketBuffer packet, OpenPetPackageResultMessage message) {
        // No fields to write
    }
}
