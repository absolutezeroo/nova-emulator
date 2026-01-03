package com.nova.infra.adapter.out.persistence.dao.user;

import com.nova.infra.adapter.out.persistence.entity.user.UserWardrobeEntity;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

/**
 * Jdbi DAO for 'user_wardrobe' table (saved outfits).
 */
@RegisterConstructorMapper(UserWardrobeEntity.class)
public interface UserWardrobeDao {

    @SqlQuery("""
            SELECT id, user_id AS userId, slot, figure, gender
            FROM user_wardrobe WHERE user_id = :userId ORDER BY slot
            """)
    List<UserWardrobeEntity> findByUserId(@Bind("userId") int userId);

    @SqlUpdate("""
            INSERT INTO user_wardrobe (user_id, slot, figure, gender) VALUES (:userId, :slot, :figure, :gender)
            ON DUPLICATE KEY UPDATE figure = :figure, gender = :gender
            """)
    int saveOutfit(@Bind("userId") int userId, @Bind("slot") int slot,
                   @Bind("figure") String figure, @Bind("gender") String gender);

    @SqlUpdate("DELETE FROM user_wardrobe WHERE user_id = :userId AND slot = :slot")
    int deleteOutfit(@Bind("userId") int userId, @Bind("slot") int slot);
}
