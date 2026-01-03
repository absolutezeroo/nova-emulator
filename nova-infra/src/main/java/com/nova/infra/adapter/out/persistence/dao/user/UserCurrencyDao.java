package com.nova.infra.adapter.out.persistence.dao.user;

import com.nova.infra.adapter.out.persistence.entity.user.UserCurrencyEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

/**
 * Jdbi DAO for 'user_currencies' table (multi-currency system).
 */
@RegisterConstructorMapper(UserCurrencyEntity.class)
public interface UserCurrencyDao {

    int CREDITS = 0;
    int PIXELS = 5;
    int DIAMONDS = 101;
    int SEASONAL = 102;

    @SqlQuery("""
            SELECT user_id AS userId, currency_type AS currencyType, amount
            FROM user_currencies WHERE user_id = :userId
            """)
    List<UserCurrencyEntity> findAllByUserId(@Bind("userId") int userId);

    @SqlQuery("SELECT COALESCE(amount, 0) FROM user_currencies WHERE user_id = :userId AND currency_type = :type")
    int getAmount(@Bind("userId") int userId, @Bind("type") int type);

    @SqlQuery("SELECT COALESCE(amount, 0) FROM user_currencies WHERE user_id = :userId AND currency_type = 0")
    int getCredits(@Bind("userId") int userId);

    @SqlQuery("SELECT COALESCE(amount, 0) FROM user_currencies WHERE user_id = :userId AND currency_type = 5")
    int getPixels(@Bind("userId") int userId);

    @SqlQuery("SELECT COALESCE(amount, 0) FROM user_currencies WHERE user_id = :userId AND currency_type = 101")
    int getDiamonds(@Bind("userId") int userId);

    @SqlUpdate("""
            INSERT INTO user_currencies (user_id, currency_type, amount) VALUES (:userId, :type, :amount)
            ON DUPLICATE KEY UPDATE amount = :amount
            """)
    int setCurrency(@Bind("userId") int userId, @Bind("type") int type, @Bind("amount") int amount);

    @SqlUpdate("""
            INSERT INTO user_currencies (user_id, currency_type, amount) VALUES (:userId, :type, :amount)
            ON DUPLICATE KEY UPDATE amount = amount + :amount
            """)
    int addCurrency(@Bind("userId") int userId, @Bind("type") int type, @Bind("amount") int amount);

    @SqlUpdate("""
            UPDATE user_currencies SET amount = amount - :amount
            WHERE user_id = :userId AND currency_type = :type AND amount >= :amount
            """)
    int subtractCurrency(@Bind("userId") int userId, @Bind("type") int type, @Bind("amount") int amount);

    @SqlUpdate("""
            INSERT INTO user_currencies (user_id, currency_type, amount) VALUES
                (:userId, 0, :credits), (:userId, 5, :pixels), (:userId, 101, :diamonds)
            ON DUPLICATE KEY UPDATE amount = VALUES(amount)
            """)
    int initializeDefaultCurrencies(@Bind("userId") int userId, @Bind("credits") int credits,
                                    @Bind("pixels") int pixels, @Bind("diamonds") int diamonds);
}
