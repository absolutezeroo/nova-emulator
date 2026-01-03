package com.nova.infra.adapter.persistence.entity.config;

/**
 * Database entity record mapping to the 'currency_types' table.
 * <p>
 * Currency type definitions.
 */
public record CurrencyTypeEntity(
        int id,
        String name,
        String displayName,
        String icon
) {}
