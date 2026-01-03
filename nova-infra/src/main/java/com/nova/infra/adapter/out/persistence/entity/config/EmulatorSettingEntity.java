package com.nova.infra.adapter.out.persistence.entity.config;

/**
 * Database entity record mapping to the 'emulator_settings' table.
 * <p>
 * Server configuration settings.
 */
public record EmulatorSettingEntity(
        String key,
        String value,
        String description
) {}
