package ddog.persistence.rdb.jpa.repository;

import ddog.domain.chat.enums.PartnerType;
import ddog.persistence.rdb.jpa.entity.ChatRoomJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ChatRoomJpaRepository extends JpaRepository<ChatRoomJpaEntity, Long> {
    List<ChatRoomJpaEntity> findByUserId(Long userId);

    List<ChatRoomJpaEntity> findByPartnerId(Long partnerId);

    Optional<ChatRoomJpaEntity> findByUserIdAndPartnerId(Long userId, Long partnerId);

    Optional<ChatRoomJpaEntity> findByChatRoomId(Long chatRoomId);

    List<ChatRoomJpaEntity> findAllByUserIdAndPartnerType(Long userId, PartnerType partnerType);

    void deleteChatRoomJpaEntitiesByUserId(Long userId);

    void deleteChatRoomJpaEntitiesByPartnerId(Long partnerId);
}