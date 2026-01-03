package com.nova.infra.adapter.persistence.repository;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.hotel.room.*;
import com.nova.core.domain.repository.RoomRepository;
import com.nova.infra.adapter.persistence.dao.room.RoomDao;
import com.nova.infra.adapter.persistence.dao.room.RoomRightsDao;
import com.nova.infra.adapter.persistence.dao.room.RoomSettingsDao;
import com.nova.infra.adapter.persistence.dao.user.UserDao;
import com.nova.infra.adapter.persistence.entity.room.RoomEntity;
import com.nova.infra.adapter.persistence.entity.room.RoomSettingsEntity;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Jdbi implementation of RoomRepository (Output Adapter).
 * <p>
 * Maps between domain Room aggregate and normalized database tables:
 * - rooms: Core room data
 * - room_settings: Configurable options
 * - room_rights: Users with rights
 */
@Singleton
public class JdbiRoomRepository implements RoomRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdbiRoomRepository.class);

    private final Jdbi jdbi;

    @Inject
    public JdbiRoomRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    @Override
    public Optional<Room> findById(RoomId roomId) {
        try {
            Optional<RoomEntity> roomOpt = jdbi.withExtension(
                    RoomDao.class,
                    dao -> dao.findById(roomId.value())
            );

            if (roomOpt.isEmpty()) {
                return Optional.empty();
            }

            RoomEntity roomEntity = roomOpt.get();

            // Load settings
            Optional<RoomSettingsEntity> settingsOpt = jdbi.withExtension(
                    RoomSettingsDao.class,
                    dao -> dao.findByRoomId(roomId.value())
            );

            // Load rights
            Set<UserId> rights = loadRights(roomId.value());

            // Load owner name
            String ownerName = loadOwnerName(roomEntity.ownerId());

            return Optional.of(toDomainModel(roomEntity, settingsOpt.orElse(null), rights, ownerName));
        } catch (Exception e) {
            LOGGER.error("Error finding room by ID: {}", roomId, e);
            return Optional.empty();
        }
    }

    @Override
    public List<Room> findByOwnerId(UserId ownerId) {
        try {
            List<RoomEntity> entities = jdbi.withExtension(
                    RoomDao.class,
                    dao -> dao.findByOwnerId(ownerId.value())
            );

            String ownerName = loadOwnerName(ownerId.value());

            return entities.stream()
                    .map(e -> toDomainModelSimple(e, ownerName))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error finding rooms by owner: {}", ownerId, e);
            return Collections.emptyList();
        }
    }

    @Override
    public int countByOwnerId(UserId ownerId) {
        try {
            return jdbi.withExtension(RoomDao.class, dao -> dao.countByOwnerId(ownerId.value()));
        } catch (Exception e) {
            LOGGER.error("Error counting rooms for owner: {}", ownerId, e);
            return 0;
        }
    }

    @Override
    public List<Room> findPopular(int limit) {
        try {
            List<RoomEntity> entities = jdbi.withExtension(
                    RoomDao.class,
                    dao -> dao.findPopular(limit)
            );

            return entities.stream()
                    .map(e -> toDomainModelSimple(e, loadOwnerName(e.ownerId())))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error finding popular rooms", e);
            return Collections.emptyList();
        }
    }

    @Override
    public List<Room> searchByName(String query, int limit) {
        try {
            String searchPattern = "%" + query + "%";
            List<RoomEntity> entities = jdbi.withExtension(
                    RoomDao.class,
                    dao -> dao.searchByName(searchPattern, limit)
            );

            return entities.stream()
                    .map(e -> toDomainModelSimple(e, loadOwnerName(e.ownerId())))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error searching rooms by name: {}", query, e);
            return Collections.emptyList();
        }
    }

    @Override
    public Room save(Room room) {
        try {
            jdbi.useExtension(RoomDao.class, dao ->
                    dao.updateInfo(room.getId().value(), room.getName(), room.getDescription())
            );
        } catch (Exception e) {
            LOGGER.error("Error saving room: {}", room.getId(), e);
        }
        return room;
    }

    @Override
    public boolean delete(RoomId roomId) {
        try {
            int deleted = jdbi.withExtension(RoomDao.class, dao -> dao.delete(roomId.value()));
            return deleted > 0;
        } catch (Exception e) {
            LOGGER.error("Error deleting room: {}", roomId, e);
            return false;
        }
    }

    @Override
    public void updateUserCount(RoomId roomId, int count) {
        try {
            jdbi.useExtension(RoomDao.class, dao -> dao.updateUsersCount(roomId.value(), count));
        } catch (Exception e) {
            LOGGER.error("Error updating user count for room: {}", roomId, e);
        }
    }

    @Override
    public void incrementScore(RoomId roomId) {
        try {
            jdbi.useExtension(RoomDao.class, dao -> dao.incrementScore(roomId.value()));
        } catch (Exception e) {
            LOGGER.error("Error incrementing score for room: {}", roomId, e);
        }
    }

    // ========================
    // Helper Methods
    // ========================

    private Set<UserId> loadRights(int roomId) {
        try {
            List<Integer> userIds = jdbi.withExtension(
                    RoomRightsDao.class,
                    dao -> dao.findUsersWithRights(roomId)
            );
            return userIds.stream().map(UserId::of).collect(Collectors.toSet());
        } catch (Exception e) {
            LOGGER.warn("Error loading room rights for room: {}", roomId, e);
            return Collections.emptySet();
        }
    }

    private String loadOwnerName(int ownerId) {
        try {
            return jdbi.withExtension(UserDao.class, dao -> dao.findById(ownerId))
                    .map(u -> u.username())
                    .orElse("Unknown");
        } catch (Exception e) {
            return "Unknown";
        }
    }

    // ========================
    // Entity ↔ Domain Mapping
    // ========================

    private Room toDomainModel(RoomEntity entity, RoomSettingsEntity settingsEntity,
                               Set<UserId> rights, String ownerName) {
        RoomSettings settings = mapToRoomSettings(entity, settingsEntity);
        RoomDecoration decoration = mapToRoomDecoration(settingsEntity);

        return new Room(
                RoomId.of(entity.id()),
                UserId.of(entity.ownerId()),
                ownerName,
                entity.name(),
                entity.description(),
                entity.modelName(),
                mapCategory(entity.categoryId()),
                entity.score(),
                "", // tags
                settings,
                decoration,
                rights,
                0, // groupId
                entity.createdAt()
        );
    }

    private Room toDomainModelSimple(RoomEntity entity, String ownerName) {
        return toDomainModel(entity, null, Collections.emptySet(), ownerName);
    }

    private RoomSettings mapToRoomSettings(RoomEntity roomEntity, RoomSettingsEntity entity) {
        RoomState state = mapState(roomEntity.state());
        String password = roomEntity.password() != null ? roomEntity.password() : "";

        if (entity == null) {
            return RoomSettings.defaultSettings().withState(state).withPassword(password);
        }

        return new RoomSettings(
                state,
                password,
                entity.maxUsers(),
                mapChatMode(entity.chatMode()),
                mapChatWeight(entity.chatWeight()),
                mapChatSpeed(entity.chatSpeed()),
                entity.chatDistance(),
                mapChatFlood(entity.chatFlood()),
                mapTradeMode(entity.tradeState()),
                entity.allowPets(),
                entity.allowPetsEat(),
                entity.allowWalkthrough(),
                entity.hideWalls(),
                entity.wallThickness(),
                entity.floorThickness(),
                mapMuteOption(entity.whoCanMute()),
                mapKickOption(entity.whoCanKick()),
                mapBanOption(entity.whoCanBan())
        );
    }

    private RoomDecoration mapToRoomDecoration(RoomSettingsEntity entity) {
        if (entity == null) {
            return RoomDecoration.defaultDecoration();
        }

        return new RoomDecoration(
                parseIntSafe(entity.wallpaper()),
                parseIntSafe(entity.floorpaper()),
                parseIntSafe(entity.landscape())
        );
    }

    private RoomState mapState(String state) {
        if (state == null) return RoomState.OPEN;
        return switch (state.toLowerCase()) {
            case "locked", "doorbell" -> RoomState.DOORBELL;
            case "password" -> RoomState.PASSWORD;
            case "invisible" -> RoomState.INVISIBLE;
            default -> RoomState.OPEN;
        };
    }

    private RoomCategory mapCategory(Integer categoryId) {
        if (categoryId == null) return RoomCategory.NONE;
        // Map category ID to enum if needed
        return RoomCategory.NONE;
    }

    private int mapChatMode(String mode) {
        return "line_by_line".equalsIgnoreCase(mode) ? 1 : 0;
    }

    private int mapChatWeight(String weight) {
        return switch (weight != null ? weight.toLowerCase() : "") {
            case "thin" -> 1;
            case "fat" -> 2;
            default -> 0;
        };
    }

    private int mapChatSpeed(String speed) {
        return switch (speed != null ? speed.toLowerCase() : "") {
            case "slow" -> 0;
            case "fast" -> 2;
            default -> 1;
        };
    }

    private int mapChatFlood(String flood) {
        return switch (flood != null ? flood.toLowerCase() : "") {
            case "strict" -> 2;
            case "loose" -> 0;
            default -> 1;
        };
    }

    private int mapTradeMode(String trade) {
        return switch (trade != null ? trade.toLowerCase() : "") {
            case "disabled" -> 0;
            case "owner_only" -> 1;
            default -> 2;
        };
    }

    private int mapMuteOption(String who) {
        return "nobody".equalsIgnoreCase(who) ? 0 : 1;
    }

    private int mapKickOption(String who) {
        return switch (who != null ? who.toLowerCase() : "") {
            case "nobody" -> 0;
            case "everyone" -> 2;
            default -> 1;
        };
    }

    private int mapBanOption(String who) {
        return "nobody".equalsIgnoreCase(who) ? 0 : 1;
    }

    private int parseIntSafe(String value) {
        if (value == null || value.isEmpty()) return 0;
        try {
            // Handle "0.0" format
            if (value.contains(".")) {
                return (int) Double.parseDouble(value);
            }
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
