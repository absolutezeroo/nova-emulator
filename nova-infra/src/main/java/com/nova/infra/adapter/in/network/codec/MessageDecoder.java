package com.nova.infra.adapter.in.network.codec;

import java.util.Optional;

/**
 * Converts incoming binary packets to domain command objects.
 * <p>
 * This interface bridges the Habbo binary protocol with the domain layer.
 * Implementations map packet header IDs to domain command types and
 * deserialize the binary data into protocol-agnostic DTOs that the
 * domain can process.
 */
public interface MessageDecoder {

    /**
     * Decodes a ClientMessage into a domain command object.
     *
     * @param message the raw packet from the client
     * @return the decoded command, or empty if the packet type is unknown
     */
    Optional<Object> decode(ClientMessage message);

    /**
     * Checks if this decoder can handle a specific packet header.
     *
     * @param headerId the packet header ID
     * @return true if this decoder supports the packet type
     */
    boolean supports(short headerId);
}
