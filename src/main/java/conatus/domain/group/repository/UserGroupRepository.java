package conatus.domain.group.repository;


import conatus.domain.group.RecommendedGroup;
import conatus.domain.group.UserGroup;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "userGroup", path = "userGroup")
public interface UserGroupRepository extends PagingAndSortingRepository<UserGroup, Long> {
    Optional<UserGroup> findByGroupIdAndUserId(Long groupId, Long userId);
}
