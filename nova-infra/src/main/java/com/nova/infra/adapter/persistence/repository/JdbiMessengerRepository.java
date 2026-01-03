package com.nova.infra.adapter.persistence.repository;

import com.nova.core.domain.model.core.user.UserId;
import com.nova.core.domain.model.social.messenger.*;
import com.nova.core.domain.repository.MessengerRepository;
import com.nova.infra.adapter.persistence.dao.messenger.MessengerDao;
import com.nova.infra.adapter.persistence.entity.messenger.FriendRequestEntity;
import com.nova.infra.adapter.persistence.entity.messenger.FriendshipEntity;
import com.nova.infra.adapter.persistence.entity.messenger.MessengerMessageEntity;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jdbi.v3.core.Jdbi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Jdbi implementation of MessengerRepository (Output Adapter).
 * <p>
 * Maps between domain Messenger entities and database tables:
 * - messenger_friendships
 * - messenger_requests
 * - messenger_messages
 */
@Singleton
public class JdbiMessengerRepository implements MessengerRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdbiMessengerRepository.class);

    private final Jdbi jdbi;

    @Inject
    public JdbiMessengerRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    // ============== Friendship Operations ==============

    @Override
    public Optional<Friendship> findFriendship(UserId userOne, UserId userTwo) {
        try {
            boolean exists = jdbi.withExtension(
                    MessengerDao.class,
                    dao -> dao.areFriends(userOne.value(), userTwo.value())
            );

            if (!exists) {
                return Optional.empty();
            }

            // Create friendship object
            return Optional.of(Friendship.create(userOne, userTwo));
        } catch (Exception e) {
            LOGGER.error("Error finding friendship between {} and {}", userOne, userTwo, e);
            return Optional.empty();
        }
    }

    @Override
    public List<Friendship> findFriendsByUserId(UserId userId) {
        try {
            List<FriendshipEntity> entities = jdbi.withExtension(
                    MessengerDao.class,
                    dao -> dao.findFriendships(userId.value())
            );

            return entities.stream()
                    .map(e -> mapToFriendship(e, userId))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error finding friends for user: {}", userId, e);
            return Collections.emptyList();
        }
    }

    @Override
    public int countFriends(UserId userId) {
        try {
            return jdbi.withExtension(MessengerDao.class, dao -> dao.countFriends(userId.value()));
        } catch (Exception e) {
            LOGGER.error("Error counting friends for user: {}", userId, e);
            return 0;
        }
    }

    @Override
    public boolean areFriends(UserId userOne, UserId userTwo) {
        try {
            return jdbi.withExtension(
                    MessengerDao.class,
                    dao -> dao.areFriends(userOne.value(), userTwo.value())
            );
        } catch (Exception e) {
            LOGGER.error("Error checking friendship: {} - {}", userOne, userTwo, e);
            return false;
        }
    }

    @Override
    public Friendship saveFriendship(Friendship friendship) {
        try {
            // Friendships are bidirectional - add both directions
            jdbi.useExtension(MessengerDao.class, dao -> {
                dao.addFriendship(friendship.getUserOne().value(), friendship.getUserTwo().value());
                dao.addFriendship(friendship.getUserTwo().value(), friendship.getUserOne().value());
            });
        } catch (Exception e) {
            LOGGER.error("Error saving friendship: {}", friendship, e);
        }
        return friendship;
    }

    @Override
    public boolean deleteFriendship(UserId userOne, UserId userTwo) {
        try {
            int deleted = jdbi.withExtension(MessengerDao.class, dao -> {
                int a = dao.removeFriendship(userOne.value(), userTwo.value());
                int b = dao.removeFriendship(userTwo.value(), userOne.value());
                return a + b;
            });
            return deleted > 0;
        } catch (Exception e) {
            LOGGER.error("Error deleting friendship: {} - {}", userOne, userTwo, e);
            return false;
        }
    }

    // ============== Friend Request Operations ==============

    @Override
    public List<FriendRequest> findPendingRequests(UserId userId) {
        try {
            List<FriendRequestEntity> entities = jdbi.withExtension(
                    MessengerDao.class,
                    dao -> dao.findPendingRequests(userId.value())
            );

            return entities.stream()
                    .map(this::mapToFriendRequest)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error finding pending requests for user: {}", userId, e);
            return Collections.emptyList();
        }
    }

    @Override
    public List<FriendRequest> findSentRequests(UserId userId) {
        // Not directly supported by DAO - would need to add a query
        // For now, return empty list
        return Collections.emptyList();
    }

    @Override
    public Optional<FriendRequest> findRequest(UserId fromUserId, UserId toUserId) {
        try {
            boolean exists = jdbi.withExtension(
                    MessengerDao.class,
                    dao -> dao.hasRequest(fromUserId.value(), toUserId.value())
            );

            if (exists) {
                return Optional.of(FriendRequest.create(fromUserId, toUserId));
            }
            return Optional.empty();
        } catch (Exception e) {
            LOGGER.error("Error finding friend request: {} -> {}", fromUserId, toUserId, e);
            return Optional.empty();
        }
    }

    @Override
    public FriendRequest saveRequest(FriendRequest request) {
        try {
            jdbi.useExtension(MessengerDao.class, dao ->
                    dao.createRequest(request.fromUserId().value(), request.toUserId().value())
            );
        } catch (Exception e) {
            LOGGER.error("Error saving friend request: {}", request, e);
        }
        return request;
    }

    @Override
    public boolean deleteRequest(UserId fromUserId, UserId toUserId) {
        try {
            int deleted = jdbi.withExtension(
                    MessengerDao.class,
                    dao -> dao.deleteRequest(fromUserId.value(), toUserId.value())
            );
            return deleted > 0;
        } catch (Exception e) {
            LOGGER.error("Error deleting friend request: {} -> {}", fromUserId, toUserId, e);
            return false;
        }
    }

    // ============== Message Operations ==============

    @Override
    public List<MessengerMessage> findOfflineMessages(UserId userId) {
        try {
            List<MessengerMessageEntity> entities = jdbi.withExtension(
                    MessengerDao.class,
                    dao -> dao.findUnreadMessages(userId.value())
            );

            return entities.stream()
                    .map(this::mapToMessage)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            LOGGER.error("Error finding offline messages for user: {}", userId, e);
            return Collections.emptyList();
        }
    }

    @Override
    public MessengerMessage saveMessage(MessengerMessage message) {
        try {
            jdbi.useExtension(MessengerDao.class, dao ->
                    dao.saveMessage(
                            message.fromUserId().value(),
                            message.toUserId().value(),
                            message.message()
                    )
            );
        } catch (Exception e) {
            LOGGER.error("Error saving message: {} -> {}", message.fromUserId(), message.toUserId(), e);
        }
        return message;
    }

    @Override
    public void markMessagesAsRead(UserId userId) {
        try {
            jdbi.useExtension(MessengerDao.class, dao -> dao.markAllAsRead(userId.value()));
        } catch (Exception e) {
            LOGGER.error("Error marking messages as read for user: {}", userId, e);
        }
    }

    // ========================
    // Entity ↔ Domain Mapping
    // ========================

    private Friendship mapToFriendship(FriendshipEntity entity, UserId userId) {
        UserId friendId = UserId.of(entity.friendId());
        FriendshipId id = FriendshipId.of(userId, friendId);

        MessengerRelation relation = mapRelation(entity.relation());

        Friendship friendship = new Friendship(id, entity.createdAt(), MessengerRelation.NONE, MessengerRelation.NONE);
        friendship.setRelation(userId, relation);

        return friendship;
    }

    private FriendRequest mapToFriendRequest(FriendRequestEntity entity) {
        return new FriendRequest(
                UserId.of(entity.senderId()),
                UserId.of(entity.receiverId()),
                entity.createdAt()
        );
    }

    private MessengerMessage mapToMessage(MessengerMessageEntity entity) {
        return new MessengerMessage(
                entity.id(),
                UserId.of(entity.senderId()),
                UserId.of(entity.receiverId()),
                entity.message(),
                entity.createdAt(),
                entity.isRead()
        );
    }

    private MessengerRelation mapRelation(int relation) {
        return switch (relation) {
            case 1 -> MessengerRelation.HEART;
            case 2 -> MessengerRelation.SMILE;
            case 3 -> MessengerRelation.BOBBA;
            default -> MessengerRelation.NONE;
        };
    }
}
