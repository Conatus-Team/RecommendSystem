package conatus.domain.entity.user.respository;

import conatus.domain.entity.user.RecommendUserInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "recommendUserInfo",
    path = "recommendUserInfo"
)
public interface RecommendUserInfoRepository
    extends PagingAndSortingRepository<RecommendUserInfo, Long> {}
