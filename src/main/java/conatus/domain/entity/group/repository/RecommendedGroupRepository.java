package conatus.domain.entity.group.repository;

import conatus.domain.entity.group.UserGroup;
import org.springframework.data.repository.PagingAndSortingRepository;
import conatus.domain.entity.group.RecommendedGroup;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "recommendedGroup", path = "recommendedGroup")
public interface RecommendedGroupRepository
        extends PagingAndSortingRepository<RecommendedGroup, Long> {
    Optional<UserGroup> findByGroupIdAndUserId(Long groupId, Long userId);
}
