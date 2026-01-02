package com.nova.infra.adapter.in.network.codec;

/**
 * Converts domain response objects to wire format.
 * <p>
 * This interface bridges the gap between protocol-agnostic domain
 * responses and the Habbo binary protocol. Implementations map
 * domain DTOs to their corresponding packet header IDs and serialize
 * the data into the correct binary format.
 */
public interface MessageEncoder {

    /**
     * Encodes a domain response object into a ServerMessage.
     *
     * @param response the domain response DTO
     * @return a ServerMessage ready for transmission
     * @throws IllegalArgumentException if the response type is not supported
     */
    ServerMessage encode(Object response);
}
