package com.nova.infra.adapter.database.dao.config;

import com.nova.infra.adapter.database.entity.config.CurrencyTypeEntity;
import com.nova.infra.adapter.database.entity.config.EmulatorSettingEntity;
import com.nova.infra.adapter.database.entity.config.EmulatorTextEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;
import java.util.Optional;

/**
 * Jdbi DAO for 'emulator_settings', 'emulator_texts', and 'currency_types' tables.
 */
public interface ConfigDao {

    // ==================== EMULATOR SETTINGS ====================

    @SqlQuery("""
            SELECT setting_key AS settingKey, setting_value AS settingValue
            FROM emulator_settings WHERE setting_key = :key
            """)
    @RegisterConstructorMapper(EmulatorSettingEntity.class)
    Optional<EmulatorSettingEntity> findSettingByKey(@Bind("key") String key);

    @SqlQuery("""
            SELECT setting_key AS settingKey, setting_value AS settingValue
            FROM emulator_settings ORDER BY setting_key
            """)
    @RegisterConstructorMapper(EmulatorSettingEntity.class)
    List<EmulatorSettingEntity> findAllSettings();

    @SqlUpdate("""
            INSERT INTO emulator_settings (setting_key, setting_value) VALUES (:key, :value)
            ON DUPLICATE KEY UPDATE setting_value = :value
            """)
    int upsertSetting(@Bind("key") String key, @Bind("value") String value);

    @SqlUpdate("DELETE FROM emulator_settings WHERE setting_key = :key")
    int deleteSetting(@Bind("key") String key);

    // ==================== EMULATOR TEXTS ====================

    @SqlQuery("""
            SELECT text_key AS textKey, text_value AS textValue
            FROM emulator_texts WHERE text_key = :key
            """)
    @RegisterConstructorMapper(EmulatorTextEntity.class)
    Optional<EmulatorTextEntity> findTextByKey(@Bind("key") String key);

    @SqlQuery("""
            SELECT text_key AS textKey, text_value AS textValue
            FROM emulator_texts ORDER BY text_key
            """)
    @RegisterConstructorMapper(EmulatorTextEntity.class)
    List<EmulatorTextEntity> findAllTexts();

    @SqlQuery("""
            SELECT text_key AS textKey, text_value AS textValue
            FROM emulator_texts WHERE text_key LIKE :prefix ORDER BY text_key
            """)
    @RegisterConstructorMapper(EmulatorTextEntity.class)
    List<EmulatorTextEntity> findTextsByPrefix(@Bind("prefix") String prefix);

    @SqlUpdate("""
            INSERT INTO emulator_texts (text_key, text_value) VALUES (:key, :value)
            ON DUPLICATE KEY UPDATE text_value = :value
            """)
    int upsertText(@Bind("key") String key, @Bind("value") String value);

    // ==================== CURRENCY TYPES ====================

    @SqlQuery("""
            SELECT id, name, icon_code AS iconCode
            FROM currency_types WHERE id = :id
            """)
    @RegisterConstructorMapper(CurrencyTypeEntity.class)
    Optional<CurrencyTypeEntity> findCurrencyById(@Bind("id") int id);

    @SqlQuery("""
            SELECT id, name, icon_code AS iconCode
            FROM currency_types ORDER BY id
            """)
    @RegisterConstructorMapper(CurrencyTypeEntity.class)
    List<CurrencyTypeEntity> findAllCurrencies();
}
