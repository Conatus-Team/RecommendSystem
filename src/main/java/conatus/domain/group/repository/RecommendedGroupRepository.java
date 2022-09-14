package conatus.domain.group.repository;

import conatus.domain.group.RecommendedGroup;
import conatus.domain.group.UserGroup;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "recommendedGroup", path = "recommendedGroup")
public interface RecommendedGroupRepository
        extends PagingAndSortingRepository<RecommendedGroup, Long> {
    Optional<RecommendedGroup> findByGroupIdAndUserId(Long groupId, Long userId);
    List<RecommendedGroup> findByUserId(Long userId);
}
