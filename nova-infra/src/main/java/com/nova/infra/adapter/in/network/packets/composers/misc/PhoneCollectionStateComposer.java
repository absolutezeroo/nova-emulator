package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.PhoneCollectionStateMessage;

/**
 * Composes PhoneCollectionState packet for client.
 */
public class PhoneCollectionStateComposer extends PacketComposer<PhoneCollectionStateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PHONE_COLLECTION_STATE;
    }

    @Override
    protected void write(PacketBuffer packet, PhoneCollectionStateMessage message) {
        packet.appendInt(message.phoneStatusCode());
        packet.appendInt(message.collectionStatusCode());
        packet.appendInt(message.millisecondsToAllowProcessReset());
    }
}
